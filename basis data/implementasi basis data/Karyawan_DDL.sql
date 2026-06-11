CREATE TABLE KARYAWAN
(
  id_karyawan INT NOT NULL,
  nama VARCHAR(100) NOT NULL,
  peran VARCHAR(100) NOT NULL,
  id_farm INT NOT NULL,
  PRIMARY KEY (id_karyawan),
  FOREIGN KEY (id_farm) REFERENCES FARM(id_farm)
);