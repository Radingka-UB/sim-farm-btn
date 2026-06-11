CREATE TABLE OBAT
(
  id_obat INT NOT NULL,
  nama_obat VARCHAR(100) NOT NULL,
  stok INT NOT NULL,
  id_gudang INT NOT NULL,
  PRIMARY KEY (id_obat),
  FOREIGN KEY (id_gudang) REFERENCES GUDANG(id_gudang)
);