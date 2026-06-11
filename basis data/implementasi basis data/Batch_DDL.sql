IF NOT EXISTS (SELECT name FROM sys.databases WHERE name = 'SIM_FARM_BTN')
    CREATE DATABASE SIM_FARM_BTNN;
GO

USE SIM_FARM_BTNN;
GO


CREATE TABLE BATCH
(
  id_batch INT NOT NULL,
  tanggal_mulai DATE NOT NULL,
  tanggal_akhir DATE,
  jumlah_ayam_awal INT NOT NULL,
  jenis_ayam VARCHAR(100) NOT NULL,
  jumlah_ayam_hidup INT NOT NULL,
  id_kandang INT NOT NULL,
  PRIMARY KEY (id_batch),
  FOREIGN KEY (id_kandang) REFERENCES KANDANG(id_kandang)
);