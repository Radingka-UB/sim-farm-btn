USE SIM_FARM_BTN;
GO
DELETE FROM MORTALITY;

INSERT INTO MORTALITY (id_mortality, tanggal, penyebab, jumlah_mati, id_kandang) VALUES
(801, '2026-06-01', 'Kanibalisme', 2, 1001),
(802, '2026-06-01', 'Tidak Diketahui', 1, 1002),
(803, '2026-06-02', 'Sakit', 3, 1004),
(804, '2026-06-03', 'Sakit', 160, 1003);