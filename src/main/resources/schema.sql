-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema skoon_yasmin
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema skoon_yasmin
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `skoon_yasmin` DEFAULT CHARACTER SET utf8 ;
USE `skoon_yasmin` ;

-- -----------------------------------------------------
-- Table `skoon_yasmin`.`role`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `skoon_yasmin`.`role` (
  `idRôle` INT NOT NULL AUTO_INCREMENT,
  `administratif` VARCHAR(45) NOT NULL,
  `nettoyeur` VARCHAR(45) NOT NULL,
  `Preteur` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idRôle`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `skoon_yasmin`.`adresse`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `skoon_yasmin`.`adresse` (
  `idAdresse` INT NOT NULL AUTO_INCREMENT,
  `ville` VARCHAR(45) NOT NULL,
  `rue` VARCHAR(45) NOT NULL,
  `code_postal` VARCHAR(45) NOT NULL,
  `evenement_id` INT NOT NULL,
  PRIMARY KEY (`idAdresse`),
  INDEX `fk_adresse_evenement1_idx` (`evenement_id` ASC) VISIBLE,
  CONSTRAINT `fk_adresse_evenement1`
    FOREIGN KEY (`evenement_id`)
    REFERENCES `skoon_yasmin`.`evenement` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `skoon_yasmin`.`skooner`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `skoon_yasmin`.`skooner` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `age` INT NOT NULL,
  `nom` VARCHAR(45) NOT NULL,
  `prenom` VARCHAR(45) NOT NULL,
  `mail` VARCHAR(45) NOT NULL,
  `agenda_id` INT NOT NULL,
  `adresse_idAdresse` INT NOT NULL,
  `messagerie_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_skooner_adresse1_idx` (`adresse_idAdresse` ASC) VISIBLE,
  CONSTRAINT `fk_skooner_adresse1`
    FOREIGN KEY (`adresse_idAdresse`)
    REFERENCES `skoon_yasmin`.`adresse` (`idAdresse`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `skoon_yasmin`.`participant`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `skoon_yasmin`.`participant` (
  `idParticipant` INT NOT NULL AUTO_INCREMENT,
  `pseudo` VARCHAR(45) NOT NULL,
  `activité` VARCHAR(45) NOT NULL,
  `materiel_id` INT NOT NULL,
  `role_idRôle` INT NOT NULL,
  `skooner_id` INT NOT NULL,
  PRIMARY KEY (`idParticipant`),
  INDEX `fk_participant_role1_idx` (`role_idRôle` ASC) VISIBLE,
  INDEX `fk_participant_skooner1_idx` (`skooner_id` ASC) VISIBLE,
  CONSTRAINT `fk_participant_role1`
    FOREIGN KEY (`role_idRôle`)
    REFERENCES `skoon_yasmin`.`role` (`idRôle`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_participant_skooner1`
    FOREIGN KEY (`skooner_id`)
    REFERENCES `skoon_yasmin`.`skooner` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `skoon_yasmin`.`evenement`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `skoon_yasmin`.`evenement` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `description_evenement` VARCHAR(45) NOT NULL,
  `nom` VARCHAR(45) NOT NULL,
  `nombre_participant` INT NOT NULL,
  `agenda_id` INT NOT NULL,
  `messagerie_id` INT NOT NULL,
  `media_id` INT NOT NULL,
  `materiel_id` INT NOT NULL,
  `participant_idParticipant` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_evenement_participant1_idx` (`participant_idParticipant` ASC) VISIBLE,
  CONSTRAINT `fk_evenement_participant1`
    FOREIGN KEY (`participant_idParticipant`)
    REFERENCES `skoon_yasmin`.`participant` (`idParticipant`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
