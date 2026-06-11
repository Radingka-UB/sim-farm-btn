IF NOT EXISTS (SELECT name FROM sys.databases WHERE name = 'SIM_FARM_BTN')
    CREATE DATABASE SIM_FARM_BTNN;
GO

USE SIM_FARM_BTNN;
GO


CREATE TABLE MENGANGKUT
(
  id_harvesting INT NOT NULL,
  id_kandang INT NOT NULL,
  id_shipping INT NOT NULL,
  id_customer INT NOT NULL,
  PRIMARY KEY (id_harvesting, id_kandang, id_shipping, id_customer),
  FOREIGN KEY (id_harvesting, id_kandang) REFERENCES EGGHARVESTING(id_harvesting, ),
  FOREIGN KEY (id_shipping, id_customer) REFERENCES EGGSHIPPING(id_shipping, )
);