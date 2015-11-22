CREATE TABLE `articoli`.`articolo` (
  `id_articolo` INTEGER NOT NULL AUTO_INCREMENT,
  `rivista` INTEGER NOT NULL,
  `titolo` VARCHAR(200) NOT NULL,
  `pagina` INTEGER NOT NULL,
  `genere` INTEGER NOT NULL,
  `autore` INTEGER NOT NULL,
  PRIMARY KEY (`id_articolo`),
  CONSTRAINT `fk_rivista` FOREIGN KEY `fk_rivista` (`rivista`)
    REFERENCES `rivista` (`id_rivista`)
    ON DELETE RESTRICT
    ON UPDATE CASCADE,
  CONSTRAINT `fk_autore` FOREIGN KEY `fk_autore` (`autore`)
    REFERENCES `autore` (`id_autore`)
    ON DELETE RESTRICT
    ON UPDATE CASCADE,
  CONSTRAINT `fk_genere` FOREIGN KEY `fk_genere` (`genere`)
    REFERENCES `genere` (`id_genere`)
    ON DELETE RESTRICT
    ON UPDATE CASCADE
)
ENGINE = InnoDB;
