USE SIM_FARM_BTN;
GO
DELETE FROM PAKAN;


INSERT INTO PAKAN (id_pakan, nama_pakan, stok, id_gudang) VALUES
(401, 'Pakan BR1 Starter', 5000, 51),
(402, 'Pakan BR2 Grower', 7500, 52),
(403, 'Pakan Layer Pro', 10000, 51),
(404, 'Pakan Organik Jagung', 3000, 55),
(405, 'Pakan Suplemen Calci-Egg', 1500, 52);