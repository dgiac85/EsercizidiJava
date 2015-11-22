CREATE TABLE `articoli`.`autore` (
  `id_autore` INTEGER NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(100) NOT NULL,
  `cognome` VARCHAR(100) NOT NULL,
  `indirizzo` VARCHAR(250),
  `citta` VARCHAR(100),
  `telefono` VARCHAR(20),
  `email` VARCHAR(50),
  `professione` VARCHAR(100) ,
  `foto` VARCHAR(200) NOT NULL DEFAULT 'nofoto.gif',
  PRIMARY KEY (`id_autore`)
)
ENGINE = InnoDB;
