CREATE TABLE `bookmark_astro_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `astro_id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  `date` date NOT NULL,
  PRIMARY KEY (`id`)
);
