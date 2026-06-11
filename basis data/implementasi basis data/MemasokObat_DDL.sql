IF NOT EXISTS (SELECT name FROM sys.databases WHERE name = N'SIM_FARM_BTN')
    CREATE DATABASE SIM_FARM_BTN;
GO

USE SIM_FARM_BTN;
GO


CREATE TABLE MEMASOKOBAT
(
  id_supplier INT NOT NULL,
  id_obat INT NOT NULL,
  PRIMARY KEY (id_supplier, id_obat),
  FOREIGN KEY (id_supplier) REFERENCES SUPPLIER(id_supplier),
  FOREIGN KEY (id_obat) REFERENCES OBAT(id_obat)
);