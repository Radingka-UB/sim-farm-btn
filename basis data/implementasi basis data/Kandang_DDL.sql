CREATE TABLE KANDANG
(
  id_kandang INT NOT NULL,
  nama_kandang VARCHAR(100) NOT NULL,
  kapasitas_maksimal INT NOT NULL,
  tipe_kandang VARCHAR(100) NOT NULL,
  id_farm INT NOT NULL,
  PRIMARY KEY (id_kandang),
  FOREIGN KEY (id_farm) REFERENCES FARM(id_farm)
);