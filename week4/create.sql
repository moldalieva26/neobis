--PART 1
-- I create a database named 'online_shop' using terminal and then I ran following commands to perform week4 taksks
use online_shop;
show tables;

CREATE TABLE `cart` (
  `id` BIGINT,
  `customer_id` BIGINT
);

CREATE TABLE `order_detail` (
  `id` BIGINT,
  `order_id` BIGINT,
  `product_id` BIGINT,
  `quantity` INT,
  `subtotal` FLOAT,
  `tax` FLOAT,
  `total` FLOAT
);

CREATE TABLE `review` (
  `id` BIGINT,
  `text` TEXT,
  `product_id` BIGINT,
  `customer_id` BIGINT,
  `rating` SMALLINT,
  `published_at` DATETIME
);

CREATE TABLE `transaction` (
  `id` BIGINT,
  `order_id` BIGINT,
  `customer_id` BIGINT,
  `status` SMALLINT,
  `created_At` DATETIME,
  `updated_At` DATETIME
);

CREATE TABLE `customer` (
  `id` BIGINT,
  `first_name` VARCHAR(100),
  `last_name` VARCHAR(100),
  `email` VARCHAR(150),
  `phone_number` VARCHAR(100),
  `address_line1` VARCHAR(100),
  `address_line2` VARCHAR(100),
  `city` VARCHAR(100),
  `province` VARCHAR(100),
  `country` VARCHAR(100),
  `postal_code` INT
);

CREATE TABLE `tag` (
  `id` BIGINT,
  `tag_name` VARCHAR(100)
);

CREATE TABLE `product_order` (
  `id` BIGINT,
  `customer_id` BIGINT,
  `order_date` DATETIME,
  `status` SMALLINT
);

CREATE TABLE `cart_detail` (
  `id` BIGINT,
  `cart_id` BIGINT,
  `product_id` BIGINT,
  `quantity` INT
);

CREATE TABLE `product` (
  `id` BIGINT,
  `product_name` VARCHAR(100),
  `price` FLOAT,
  `category_id` BIGINT,
  `product_desciption` TEXT,
  `in_stock` BOOLEAN,
  `tag_id` BIGINT,
  `quantity_available` INT
);

CREATE TABLE `favorite` (
  `id` BIGINT,
  `product_id` BIGINT,
  `customer_id` BIGINT
);

CREATE TABLE `product_category` (
  `id` BIGINT,
  `category_id` BIGINT,
  `product_id` BIGINT
);

CREATE TABLE `product_detail` (
  `id` BIGINT,
  `product_id` BIGINT,
  `material` VARCHAR(100),
  `color` VARCHAR(100),
  `weight` INT,
  `length` INT,
  `width` INT,
  `height` INT
);

CREATE TABLE `product_tag` (
  `id` BIGINT,
  `tag_id` BIGINT,
  `product_id` BIGINT
);

CREATE TABLE `category` (
  `id` BIGINT,
  `category_name` VARCHAR(100),
  `sub_category_name` VARCHAR(100)
);

