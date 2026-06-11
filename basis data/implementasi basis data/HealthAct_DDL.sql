IF NOT EXISTS (SELECT name FROM sys.databases WHERE name = 'SIM_FARM_BT')
    CREATE DATABASE SIM_FARM_BTN;
GO

USE SIM_FARM_BTN;
GO


CREATE TABLE HEALTHACT
(
  id_act INT NOT NULL,
  tanggal DATE NOT NULL,
  dosis INT NOT NULL,
  id_kandang INT NOT NULL,
  id_obat INT NOT NULL,
  PRIMARY KEY (id_act, id_kandang, id_obat),
  FOREIGN KEY (id_kandang) REFERENCES KANDANG(id_kandang),
  FOREIGN KEY (id_obat) REFERENCES OBAT(id_obat)
);