CREATE TABLE MEMASOKOBAT
(
  id_supplier INT NOT NULL,
  id_obat INT NOT NULL,
  PRIMARY KEY (id_supplier, id_obat),
  FOREIGN KEY (id_supplier) REFERENCES SUPPLIER(id_supplier),
  FOREIGN KEY (id_obat) REFERENCES OBAT(id_obat)
);