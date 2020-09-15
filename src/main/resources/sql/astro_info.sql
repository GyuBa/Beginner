CREATE TABLE `astro_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `astro_title` varchar(45),
  `astro_event` text,
  `astro_date` timestamp NULL DEFAULT NULL,
  `Recommend_count` int(11) DEFAULT '0',
  PRIMARY KEY (`id`)
);
