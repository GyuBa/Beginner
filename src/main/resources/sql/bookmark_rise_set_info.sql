CREATE TABLE `bookmark_rise_set_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `bookmark_name` varchar(45) NOT NULL,
  `user_id` int(11) NOT NULL,
  `date` date NOT NULL,
  `location` varchar(45) NOT NULL,
  `sun_rise` time DEFAULT NULL,
  `sun_set` time DEFAULT NULL,
  `moon_rise` time DEFAULT NULL,
  `moon_set` time DEFAULT NULL,
  `lun_age` FLOAT DEFAULT NULL,
  PRIMARY KEY (`id`)
);
