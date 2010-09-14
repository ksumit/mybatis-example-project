DROP TABLE IF EXISTS `contact`;

CREATE TABLE `contact` (
  `id` int(15) NOT NULL,
  `lastName` varchar(50) DEFAULT NULL,
  `firstName` varchar(50) DEFAULT NULL,
  `phone` varchar(20) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
);

INSERT INTO `contact`(`id`,`lastName`,`firstName`,`phone`,`email`) VALUES ( '1','bar','foo','9986099860','foo@bar.com');