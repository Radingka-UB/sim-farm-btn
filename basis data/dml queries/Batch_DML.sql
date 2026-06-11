USE SIM_FARM_BTN;
GO
DELETE FROM BATCH;

INSERT INTO BATCH (id_batch, tanggal_mulai, tanggal_akhir, jumlah_ayam_awal, jenis_ayam, jumlah_ayam_hidup, id_kandang) VALUES
(201, '2025-01-10', '2026-08-10', 4800, 'Isa Brown', 4750, 1001),
(202, '2025-03-15', '2026-10-15', 4900, 'Lohmann Brown', 4880, 1002),
(203, '2025-06-01', '2027-01-01', 2950, 'Hy-Line Brown', 2900, 1003),
(204, '2025-02-20', '2026-09-20', 5800, 'Isa Brown', 5700, 1004),
(205, '2025-04-05', '2026-11-05', 5900, 'Lohmann Brown', 5820, 1005),
(206, '2025-07-12', '2027-02-12', 3850, 'Novogen', 3800, 1006);