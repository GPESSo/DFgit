

//adicionar os atributos que queremos salvar

public class DFbooks {
    private int id;
    private String email;
    private int peso; 
    private int idade; 
    private int altura; 
    private String nivel; 
    private String comentarios; 

    public DFbooks(int id, String email, int peso, int idade, int altura, String nivel, String comentarios) {
        this.id = id;    
        this.email = email;
        this.peso = peso;
        this.idade = idade;
        this.altura = altura;
        this.nivel = nivel;
        this.comentarios = comentarios;
    }

    public int getId(){
        return id;
    }
    public String getEmail(){
        return email;
    }
    public int getPeso(){
        return peso;
    }
    public int getIdade(){
        return idade;
    }
    public int getAltura(){
        return altura;
    }
    public String getNivel(){
        return nivel;
    }
    public String getComentarios(){
        return comentarios;
    }
}

