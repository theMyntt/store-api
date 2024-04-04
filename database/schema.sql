DROP DATABASE IF EXISTS STORE;

CREATE DATABASE IF NOT EXISTS STORE;

USE STORE;

CREATE TABLE COMPANY (
    NAME_COMPANY CHAR(255) NOT NULL,
    CELL_COMPANY VARCHAR(15), 
    EMAIL_COMPANY VARCHAR(80) NOT NULL,
    PRIMARY KEY (NAME_COMPANY)
);

CREATE TABLE USER (
    ID_CLIENT VARCHAR(255) NOT NULL,
    NAME_CLIENT CHAR(255) NOT NULL,
    CELLPHONE_USER VARCHAR(15),
    EMAIL_USER VARCHAR(255) NOT NULL,
    PASSWORD_USER VARCHAR(255) NOT NULL,
    COMPANY_NAME_COMPANY CHAR(255),
    PRIMARY KEY (ID_CLIENT),
    FOREIGN KEY (COMPANY_NAME_COMPANY) REFERENCES COMPANY(NAME_COMPANY)
);

CREATE TABLE PRODUCTS (
	ID_PRODUCT VARCHAR(255) NOT NULL,
    COMPANY_NAME_COMPANY CHAR(255) NOT NULL,
    NAME_PRODUCT VARCHAR(80) NOT NULL,
    DESC_PRODUCT VARCHAR(255),
    VALUE_PRODUCT NUMERIC(9,2) NOT NULL,
    PRIMARY KEY (ID_PRODUCT),
    FOREIGN KEY (COMPANY_NAME_COMPANY) REFERENCES COMPANY(NAME_COMPANY)
);

INSERT INTO COMPANY (NAME_COMPANY, CELL_COMPANY, EMAIL_COMPANY) VALUES 
	("COMPANY_1", null, "company@test.com");
    
INSERT INTO PRODUCTS (ID_PRODUCT, COMPANY_NAME_COMPANY, NAME_PRODUCT, DESC_PRODUCT, VALUE_PRODUCT) VALUES
	("2milkqunx58gxi3q6xfqat", "COMPANY_1", "PRODUCT 1", null, 69.24);

INSERT INTO USER (ID_CLIENT, NAME_CLIENT, CELLPHONE_USER, EMAIL_USER, PASSWORD_USER, COMPANY_NAME_COMPANY) VALUES
    ("2milkqunx58gxi3q6xfqat", "Admin", null, "admin@admin.org", "12345678", null);
    
SELECT * FROM PRODUCTS;