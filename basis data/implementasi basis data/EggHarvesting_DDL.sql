IF NOT EXISTS (SELECT name FROM sys.databases WHERE name = 'SIM_FARM_BTN')
    CREATE DATABASE SIM_FARM_BTN;
GO

USE SIM_FARM_BTN;
GO


CREATE TABLE EGGHARVESTING
(
  id_harvesting INT NOT NULL,
  tanggal DATE NOT NULL,
  grade VARCHAR(5) NOT NULL,
  jumlah_butir INT NOT NULL,
  berat_total_kg NUMERIC(7,2) NOT NULL,
  id_kandang INT NOT NULL,
  PRIMARY KEY (id_harvesting, id_kandang),
  FOREIGN KEY (id_kandang) REFERENCES KANDANG(id_kandang)
);
