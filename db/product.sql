CREATE TABLE `product` (
  `id` bigint(10) NOT NULL AUTO_INCREMENT,
  `name` varchar(80) DEFAULT NULL,
  `description` varchar(300) DEFAULT NULL,
  `price` double(12,4) DEFAULT NULL,
  `create_on` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `modify_on` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `product_name_idx` (`name`)
) ENGINE=InnoDB