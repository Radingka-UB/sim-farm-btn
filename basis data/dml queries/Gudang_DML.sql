USE SIM_FARM_BTN;
GO
DELETE FROM GUDANG;

INSERT INTO GUDANG (id_gudang, nama_gudang, lokasi) VALUES
(51, 'Gudang Pakan Utama A', 'Sektor Barat'),
(52, 'Gudang Pakan Utama B', 'Sektor Timur'),
(53, 'Gudang Obat & Vaksin Sentral', 'Sektor Utara'),
(54, 'Gudang Logistik Telur', 'Sektor Selatan'),
(55, 'Gudang Cadangan Pakan', 'Sektor Tengah');