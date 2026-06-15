IF NOT EXISTS (SELECT name FROM sys.databases WHERE name = 'SIM_FARM_BTN')
    CREATE DATABASE SIM_FARM_BTN;
GO

USE SIM_FARM_BTN;
GO


CREATE TABLE MENGANGKUT
(
  id_harvesting INT NOT NULL,
  id_shipping INT NOT NULL,
  PRIMARY KEY (id_harvesting, id_shipping),
  FOREIGN KEY (id_harvesting) REFERENCES EGGHARVESTING(id_harvesting),
  FOREIGN KEY (id_shipping) REFERENCES EGGSHIPPING(id_shipping)
);
