IF NOT EXISTS (SELECT name FROM sys.databases WHERE name = 'SIM_FARM_BT')
    CREATE DATABASE SIM_FARM_BTN;
GO

USE SIM_FARM_BTN;
GO


CREATE TABLE FEEDING
(
  id_feeding INT NOT NULL,
  tanggal DATE NOT NULL,
  jumlah_kg INT NOT NULL,
  id_kandang INT NOT NULL,
  id_pakan INT NOT NULL,
  PRIMARY KEY (id_feeding, id_kandang, id_pakan),
  FOREIGN KEY (id_kandang) REFERENCES KANDANG(id_kandang),
  FOREIGN KEY (id_pakan) REFERENCES PAKAN(id_pakan)
);