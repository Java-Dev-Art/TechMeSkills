DROP SCHEMA IF EXISTS tmsHomeWork;
CREATE SCHEMA IF NOT EXISTS tmsHomeWork;

DROP TABLE IF EXISTS tmsHomeWork.products;
CREATE TABLE IF NOT EXISTS tmsHomeWork.products
(
    id           INT          NOT NULL AUTO_INCREMENT,
    name         VARCHAR(45)  NOT NULL,
    description  VARCHAR(200) NOT NULL,
    price        DOUBLE       NOT NULL,
    number       INT          NOT NULL,
    availability CHAR         NOT NULL,
    PRIMARY KEY (id)
);

INSERT INTO tmsHomeWork.products(name, description, price, number, availability)
VALUES ('Milk', '3.2% laktoze FREE', 4.23, 78, '1');
INSERT INTO tmsHomeWork.products(name, description, price, number, availability)
VALUES ('BEAR', 'German lager', 1.89, 7, '1');
INSERT INTO tmsHomeWork.products(name, description, price, number, availability)
VALUES ('Ketchup', 'BBQ', 4, 0, '0');

