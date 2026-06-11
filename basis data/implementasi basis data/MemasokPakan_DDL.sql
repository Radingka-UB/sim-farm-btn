IF NOT EXISTS (SELECT name FROM sys.databases WHERE name = 'SIM_FARM_BTN')
    CREATE DATABASE SIM_FARM_BTN;
GO

USE SIM_FARM_BTN;
GO


CREATE TABLE MEMASOKPAKAN
(
  id_pakan INT NOT NULL,
  id_supplier INT NOT NULL,
  PRIMARY KEY (id_pakan, id_supplier),
  FOREIGN KEY (id_pakan) REFERENCES PAKAN(id_pakan),
  FOREIGN KEY (id_supplier) REFERENCES SUPPLIER(id_supplier)
);