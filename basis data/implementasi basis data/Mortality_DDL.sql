IF NOT EXISTS (SELECT name FROM sys.databases WHERE name = 'SIM_FARM_BTN')
    CREATE DATABASE SIM_FARM_BTN;
GO

USE SIM_FARM_BTN;
GO


CREATE TABLE MORTALITY
(
  id_mortality INT NOT NULL,
  tanggal DATE NOT NULL,
  penyebab VARCHAR(100) NOT NULL,
  jumlah_mati INT NOT NULL,
  id_kandang INT NOT NULL,
  PRIMARY KEY (id_mortality, id_kandang),
  FOREIGN KEY (id_kandang) REFERENCES KANDANG(id_kandang)
);