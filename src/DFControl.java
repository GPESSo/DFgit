

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ResourceBundle;
import javax.management.Query;

import com.mysql.cj.xdevapi.Statement;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class DFControl implements Initializable{
    //Recursos utilizados no Scene Builder
    @FXML
    private TextField alturaF;

    @FXML
    private TextArea comentarios;

    @FXML
    private TextField emailF;

    @FXML
    private TextField idadeF;

    @FXML
    private Label idadeLbl;

    @FXML
    private Label idadeLbl1;

    @FXML
    private Label idadeLbl2;

    @FXML
    private Label idadeLbl3;

    @FXML
    private Label modeloL;

    @FXML
    private TextField nivelF;

    @FXML
    private Label nivelLbl;

    @FXML
    private AnchorPane panelPrincipal;

    @FXML
    private TextField pesoF;

    @FXML
    private Button sol;

    @FXML
    private Tab tabDF21;

    @FXML
    private Tab tabDF4;

    @FXML
    private Tab tabDF5;

    @FXML
    private TabPane tabPaneModelos;

    //evento do botão "solicitar pesquisa"
    @FXML
    void solPesqEv(ActionEvent event) {
        if(event.getSource() == sol){
            inserirDB();
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // TODO Auto-generated method stub
        
    }

    //Criando conexão com a base de dados
    public Connection getConnection(){
        Connection conn;
        try{
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/df_project?useTimezone=true&serverTimezone=UTC","root","blackzeus1");
            System.out.println("Conectado!!!");
            return conn;

        }catch(Exception ex){
            System.out.println("Erro na conexão!!!" + ex.getMessage());
        }
        return null;
    }

    //Caminho para inserir na base de dados
    private void inserirDB(){
        Connection conn = getConnection();
        String query = "INSERT INTO dfbooks VALUES ('" +  emailF.getText() + "','" + comentarios.getText() + "'," + pesoF.getText() + "," + idadeF.getText() + ",'" + nivelF.getText() + "'," + alturaF.getText() + ", 0" + ")";
        executeQuery(query);
    }
    
    //método para inserir os dados
    private void executeQuery(String query) {
        Connection conn = getConnection();
        java.sql.Statement st;
        try{
            st = conn.createStatement();
            st.executeUpdate(query);
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }

}
