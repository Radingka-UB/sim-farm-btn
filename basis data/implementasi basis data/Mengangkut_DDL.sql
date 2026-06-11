CREATE TABLE MENGANGKUT
(
  id_harvesting INT NOT NULL,
  id_kandang INT NOT NULL,
  id_shipping INT NOT NULL,
  id_customer INT NOT NULL,
  PRIMARY KEY (id_harvesting, id_kandang, id_shipping, id_customer),
  FOREIGN KEY (id_harvesting, id_kandang) REFERENCES EGGHARVESTING(id_harvesting, id_kandang),
  FOREIGN KEY (id_shipping, id_customer) REFERENCES EGGSHIPPING(id_shipping, id_customer)
);
