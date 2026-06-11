CREATE TABLE PAKAN
(
  id_pakan INT NOT NULL,
  nama_pakan VARCHAR(100) NOT NULL,
  stok INT NOT NULL,
  id_gudang INT NOT NULL,
  PRIMARY KEY (id_pakan),
  FOREIGN KEY (id_gudang) REFERENCES GUDANG(id_gudang)
);