USE SIM_FARM_BTN;
GO
DELETE FROM KARYAWAN;

INSERT INTO KARYAWAN (id_karyawan, nama, peran, id_farm) VALUES
(11, 'Ahmad Subarjo', 'Manajer Farm', 1),
(12, 'Slamet Riyadi', 'Pekerja Harian', 1),
(13, 'Dadang Suherman', 'Mandor Kandang', 1),
(14, 'Drh. Rian Utama', 'Dokter Hewan', 1),
(15, 'Bambang Tri', 'Manajer Farm', 5),
(16, 'Eko Prasetyo', 'Pekerja Harian', 5),
(17, 'Supardi', 'Mandor Kandang', 5),
(18, 'Drh. Linda Sari', 'Dokter Hewan', 5);