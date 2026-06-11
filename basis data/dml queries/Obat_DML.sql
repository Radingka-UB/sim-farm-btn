USE SIM_FARM_BTN;
GO
DELETE FROM OBAT;

INSERT INTO OBAT (id_obat, nama_obat, stok, id_gudang) VALUES
(601, 'Vaksin ND-IB Live', 100, 53),
(602, 'Vaksin AI (Flu Burung)', 150, 53),
(603, 'Vita-Stress Booster', 200, 53),
(604, 'Antibiotik Koleridin', 80, 53),
(605, 'Antiseptik Medisep', 120, 53);