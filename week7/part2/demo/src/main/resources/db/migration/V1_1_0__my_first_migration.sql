CREATE TABLE IF NOT EXISTS `customer` (
 
    `id` bigint NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `first_name` varchar(20),
    `last_name` varchar(20),
    `email` varchar(50),
    `phone_number` varchar(50)
 
)ENGINE=InnoDB DEFAULT CHARSET=UTF8;