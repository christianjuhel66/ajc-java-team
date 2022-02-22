CREATE DATABASE  IF NOT EXISTS `cursus`;

USE `cursus`;

--
-- Table structure for table `cursus`
--

DROP TABLE IF EXISTS `cursus`;

CREATE TABLE `cursus` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nom` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

insert into cursus(nom) values ("mathématique"),
								("informatique"),
                                ("economie et gestion");