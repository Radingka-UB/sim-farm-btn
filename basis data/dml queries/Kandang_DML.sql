USE SIM_FARM_BTN;
GO
DELETE FROM KANDANG;

INSERT INTO KANDANG (id_kandang, nama_kandang, kapasitas_maksimal, tipe_kandang, id_farm) VALUES
(1001, 'Kandang A-Bogor', 5000, 'Kandang Baterai', 1),
(1002, 'Kandang B-Bogor', 5000, 'Kandang Baterai', 1),
(1003, 'Kandang C-Bogor', 3000, 'Kandang Lantai', 1),
(1004, 'Kandang A-Malang', 6000, 'Kandang Baterai', 5),
(1005, 'Kandang B-Malang', 6000, 'Kandang Baterai', 5),
(1006, 'Kandang C-Malang', 4000, 'Kandang Lantai', 5);