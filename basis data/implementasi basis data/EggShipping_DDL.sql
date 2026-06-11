IF NOT EXISTS (SELECT name FROM sys.databases WHERE name = 'SIM_FARM_BT')
    CREATE DATABASE SIM_FARM_BTN;
GO

USE SIM_FARM_BTN;
GO


CREATE TABLE EGGSHIPPING
(
  id_shipping INT NOT NULL,
  tanggal DATE NOT NULL,
  total_harga INT NOT NULL,
  total_berat_kg NUMERIC(7,2) NOT NULL,
  total_butir INT NOT NULL,
  id_customer INT NOT NULL,
  PRIMARY KEY (id_shipping, id_customer),
  FOREIGN KEY (id_customer) REFERENCES CUSTOMER(id_customer)
);