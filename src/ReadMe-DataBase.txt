Use the program after create a table on DataBase. You need create the table with the code below:

CREATE TABLE `dfbooks` (
  `email` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `coment` varchar(200) COLLATE utf8_unicode_ci NOT NULL,
  `peso` int(3) COLLATE utf8_unicode_ci NOT NULL,
  `idade` int(3) COLLATE utf8_unicode_ci NOT NULL,
  `nivel` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `altura` int(3) COLLATE utf8_unicode_ci NOT NULL,
  `id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

ALTER TABLE `dfbooks`
  ADD PRIMARY KEY (`id`);