/*==============================================================*/

DROP TABLE IF EXISTS hotel;

/*==============================================================*/
CREATE TABLE hotel
(
    id       BIGINT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    category INT          NOT NULL,
    name     VARCHAR(255) NOT NULL,
    owner    VARCHAR(255) NOT NULL,
    contact  VARCHAR(255) NOT NULL,
    address  VARCHAR(255) NOT NULL,
    city     VARCHAR(255) NOT NULL,
    zip      VARCHAR(20)  NOT NULL,
    phone    VARCHAR(50)  NOT NULL,
    rooms    INT          NOT NULL,
    beds     INT          NOT NULL
);
