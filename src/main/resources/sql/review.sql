CREATE TABLE `review` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `astro_title` varchar(45),
  `title` varchar(45),
  `value` varchar(45),
  `user_Name` varchar(45,
  `update_date` timestamp DEFAULT CURRENT_TIMESTAMP,
  `create_date` timestamp DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
);
