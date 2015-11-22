CREATE TABLE `articoli`.`rivista` (
  `id_rivista` INTEGER NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(200) NOT NULL,
  `editore` VARCHAR(200),
  `nr` INTEGER NOT NULL,
  `copertina` VARCHAR(200) NOT NULL DEFAULT 'nofoto.gif',
  PRIMARY KEY (`id_rivista`)
)
ENGINE = InnoDB;
