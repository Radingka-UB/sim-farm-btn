USE sim_farm_btn;
GO

INSERT INTO FARM (FarmID, NamaFarm, Alamat, TeleponFarm) VALUES
(1,'Farm Bogor','Jl. Raya Bogor No. 10, Bogor','0251-1234567'),
(2,'Farm Bandung','Jl. Soekarno Hatta No. 22, Bandung','022-2345678'),
(3,'Farm Semarang','Jl. Pandanaran No. 5, Semarang','024-3456789'),
(4,'Farm Yogyakarta','Jl. Kaliurang No. 15, Yogyakarta','0274-4567890'),
(5,'Farm Malang','Jl. Soekarno Hatta No. 8, Malang','0341-5678901');

INSERT INTO CUSTOMER (CustomerID, NamaCustomer, TipeCustomer, Alamat, Telepon) VALUES
(1,'Pasar Induk Kramat Jati','Pasar','Jakarta Timur','021-9991112'),
(2,'Superindo Malang','Supermarket','Jl. Ijen No. 2, Malang','0341-1112223'),
(3,'Agen Telur Jaya','Agen','Jl. Pasar Besar, Malang','0341-2223334'),
(4,'Pabrik Roti Sukses','Pabrik','Jl. Industri Roti No. 9, Bandung','022-3334445'),
(5,'Indomaret Bogor','Supermarket','Jl. Pajajaran No. 4, Bogor','0251-4445556');

INSERT INTO OBAT (ObatID, NamaObat, JenisObat, Satuan) VALUES
(1,'Vita Chick','Vitamin','ml'),
(2,'ND Vaccine','Vaksin','dosis'),
(3,'AI Vaccine','Vaksin','dosis'),
(4,'Desinfex','Desinfektan','liter');

INSERT INTO PAKAN (PakanID, NamaPakan, Merek, JenisPakan, HargaPerKg) VALUES
(1,'Starter Pro','BrandA','Starter',8500),
(2,'Grower Max','BrandB','Grower',7800),
(3,'Layer Gold','BrandC','Layer',7200),
(4,'Layer Premium','BrandD','Layer',7600);

INSERT INTO SUPPLIER (SupplierID, NamaSupplier, Alamat, Telepon, Email) VALUES
(1,'PT Pakan Makmur Sejahtera','Jl. Industri No. 1, Bekasi','021-8889991','sales@pakanmakmur.co.id'),
(2,'CV Agro Pakan Nusantara','Jl. Raya Pasuruan No. 12, Pasuruan','0343-667788','info@agropakan.co.id'),
(3,'PT Mitra Vaksin Indonesia','Jl. Kesehatan No. 3, Jakarta','021-7778889','cs@mitravaksin.co.id'),
(4,'CV Vet Medika Husada','Jl. Veteriner No. 7, Surabaya','031-5556667','order@vetmedika.co.id');

INSERT INTO KANDANG (KandangID, NamaKandang, KapasitasMaksimal, StatusKandang, TipeKandang, FarmID) VALUES
(1,'Kandang A1',5500,'Aktif','Baterai',1),
(2,'Kandang A2',5500,'Aktif','Baterai',1),
(3,'Kandang B1',5000,'Aktif','Lantai',2),
(4,'Kandang B2',5000,'Aktif','Baterai',2),
(5,'Kandang C1',5500,'Aktif','Baterai',3),
(6,'Kandang C2',5500,'Aktif','Lantai',3),
(7,'Kandang D1',5000,'Aktif','Baterai',4),
(8,'Kandang D2',5000,'Aktif','Lantai',4),
(9,'Kandang E1',5500,'Aktif','Baterai',5),
(10,'Kandang E2',5500,'Aktif','Baterai',5);

INSERT INTO KARYAWAN (KaryawanID, Nama, NIK, TanggalLahir, Alamat, Telepon, JenisKelamin, TanggalMasuk, TipeKaryawan, FarmID) VALUES
(1,'Andi Wijaya','3201011985010001','1985-01-15','Jl. Melati No.1, Bogor','081234560001','L','2020-01-10','Manajer',1),
(2,'Budi Santoso','3273021982030002','1982-03-22','Jl. Anggrek No.2, Bandung','081234560002','L','2019-05-15','Manajer',2),
(3,'Citra Dewi','3374031988070003','1988-07-10','Jl. Mawar No.3, Semarang','081234560003','P','2020-03-01','Manajer',3),
(4,'Dedi Prasetyo','3404041983110004','1983-11-05','Jl. Kenanga No.4, Yogyakarta','081234560004','L','2019-08-20','Manajer',4),
(5,'Eka Putri','3573051990020005','1990-02-18','Jl. Dahlia No.5, Malang','081234560005','P','2021-01-05','Manajer',5),
(6,'Fajar Nugroho','3201061995040006','1995-04-12','Jl. Flamboyan No.6, Bogor','081234560006','L','2022-02-01','PekerjaHarian',1),
(7,'Gita Lestari','3273071996060007','1996-06-25','Jl. Cempaka No.7, Bandung','081234560007','P','2022-03-10','PekerjaHarian',2),
(8,'Hadi Kusuma','3374081994080008','1994-08-30','Jl. Teratai No.8, Semarang','081234560008','L','2022-04-15','PekerjaHarian',3),
(9,'Indah Permata','3404091997090009','1997-09-09','Jl. Seroja No.9, Yogyakarta','081234560009','P','2022-05-20','PekerjaHarian',4),
(10,'Karim Hidayat','3201101989050010','1989-05-17','Jl. Kamboja No.10, Bogor','081234560010','L','2021-06-01','MandorKandang',1),
(11,'Lina Marlina','3273111991100011','1991-10-21','Jl. Bougenville No.11, Bandung','081234560011','P','2021-07-15','MandorKandang',2),
(12,'Nurul Aini','3201121986120012','1986-12-03','Jl. Sakura No.12, Bogor','081234560012','P','2020-09-01','DokterHewan',1),
(13,'Oka Wirawan','3374131984040013','1984-04-28','Jl. Tulip No.13, Semarang','081234560013','L','2020-10-15','DokterHewan',3);

INSERT INTO DOKTERHEWAN (KaryawanID, NoSIP, Spesialisasi, StatusMitra, BiayaKunjungan) VALUES
(12,'SIP-001-2020','Unggas','Tetap',0),
(13,'SIP-002-2020','Unggas','Mitra',750000);

INSERT INTO MANAJERFARM (KaryawanID, GajiPokok, TanggalPengangkatan) VALUES
(1,8000000,'2020-01-10'),
(2,8200000,'2019-05-15'),
(3,8100000,'2020-03-01'),
(4,8000000,'2019-08-20'),
(5,8300000,'2021-01-05');

INSERT INTO MANDORKANDANG (KaryawanID, GajiPokok) VALUES
(10,5500000),
(11,5500000);

INSERT INTO PEKERJAHARIAN (KaryawanID, UpahPerHari, JadwalShift) VALUES
(6,120000,'Pagi'),
(7,120000,'Sore'),
(8,115000,'Pagi'),
(9,115000,'Sore');

INSERT INTO KANDANGTANGGUNGJAWAB (KaryawanID, KandangID) VALUES
(10,1),(10,2),(10,3),
(11,3),(11,4),(11,5);

INSERT INTO STOKGUDANGOBAT (StokObatID, JumlahStok, TanggalUpdate, ObatID, FarmID) VALUES
(1,200,'2026-05-10',2,1),
(2,150,'2026-05-10',1,1),
(3,180,'2026-05-10',3,2),
(4,120,'2026-05-10',4,3),
(5,160,'2026-05-10',2,4),
(6,140,'2026-05-10',1,5),
(7,100,'2026-05-10',4,2),
(8,90,'2026-05-10',3,5);

INSERT INTO STOKGUDANGPAKAN (StokPakanID, JumlahStokKg, TanggalUpdate, TanggalKadaluarsa, FarmID, PakanID) VALUES
(1,1500,'2026-05-10','2026-11-10',1,1),
(2,1200,'2026-05-10','2026-11-10',1,3),
(3,1300,'2026-05-10','2026-11-10',2,3),
(4,1000,'2026-05-10','2026-11-10',3,2),
(5,1400,'2026-05-10','2026-11-10',4,3),
(6,1100,'2026-05-10','2026-11-10',5,4),
(7,900,'2026-05-10','2026-11-10',5,1),
(8,1250,'2026-05-10','2026-11-10',2,2);

INSERT INTO PEMBELIANOBAT (PembelianObatID, TanggalBeli, JumlahStok, HargaTotal, FarmID, SupplierID) VALUES
(1,'2026-04-02',500,7500000,1,3),
(2,'2026-04-03',300,4500000,2,4),
(3,'2026-04-04',400,6000000,3,3),
(4,'2026-04-06',350,5250000,4,4),
(5,'2026-04-07',450,6750000,5,3);

INSERT INTO PEMBELIANPAKAN (PembelianID, TanggalBeli, JumlahKg, HargaTotal, SupplierID, PakanID, FarmID) VALUES
(1,'2026-04-01',2000,17000000,1,1,1),
(2,'2026-04-01',2500,19500000,1,3,2),
(3,'2026-04-05',1800,15840000,2,2,3),
(4,'2026-04-05',2200,16720000,2,3,4),
(5,'2026-04-10',2000,15200000,1,4,5),
(6,'2026-04-10',1500,12750000,2,1,1);

INSERT INTO PENJUALANTELUR (PenjualanID, TanggalJual, TotalBerat, TotalHarga, KaryawanID, CustomerID) VALUES
(1,'2026-05-05',168.00,5712000,1,1),
(2,'2026-05-05',174.00,5916000,1,5),
(3,'2026-05-05',173.00,5676000,2,2),
(4,'2026-05-06',177.00,6195000,2,3),
(5,'2026-05-06',186.00,6510000,3,1),
(6,'2026-05-06',165.00,5610000,3,4),
(7,'2026-05-07',183.90,6387000,4,2),
(8,'2026-05-07',171.00,5985000,5,5);

INSERT INTO BATCH (BatchID, KodeAyam, JenisAyam, TanggalMasuk, JumlahAyamAwal, PopulasiSekarang, StatusBatch, KandangID) VALUES
(1,'BTC-001','Lohmann Brown','2025-06-01',5000,4900,'Aktif',1),
(2,'BTC-002','Lohmann Brown','2025-06-01',5000,4950,'Aktif',2),
(3,'BTC-003','ISA Brown','2025-07-15',4800,4700,'Aktif',3),
(4,'BTC-004','ISA Brown','2025-07-15',4800,4750,'Aktif',4),
(5,'BTC-005','Hy-Line Brown','2025-08-01',5200,5100,'Aktif',5),
(6,'BTC-006','Hy-Line Brown','2025-08-01',5200,5150,'Aktif',6),
(7,'BTC-007','Lohmann Brown','2025-09-10',4600,4550,'Aktif',7),
(8,'BTC-008','ISA Brown','2025-09-10',4600,4500,'Aktif',8),
(9,'BTC-009','Hy-Line Brown','2025-10-01',5000,4950,'Aktif',9),
(10,'BTC-010','Lohmann Brown','2025-10-01',5000,4900,'Aktif',10);

INSERT INTO DETAILPENJUALAN (DetailID, GradeTelur, JumlahButir, BeratKg, HargaPerKg, BatchID, PenjualanID) VALUES
(1,'A',2800,168.00,34000,1,1),
(2,'A',2900,174.00,34000,2,2),
(3,'A',2700,162.00,33000,3,3),
(4,'B',200,11.00,30000,3,3),
(5,'A',2950,177.00,35000,4,4),
(6,'A',3100,186.00,35000,5,5),
(7,'A',2750,165.00,34000,6,6),
(8,'A',2900,174.00,35000,7,7),
(9,'B',180,9.90,30000,7,7),
(10,'A',2850,171.00,35000,9,8);

INSERT INTO PANENTELUR (PanenID, TanggalPanen, KaryawanID, BatchID) VALUES
(1,'2026-05-01',10,1),
(2,'2026-05-01',10,2),
(3,'2026-05-01',11,3),
(4,'2026-05-01',11,4),
(5,'2026-05-02',11,5),
(6,'2026-05-02',11,6),
(7,'2026-05-02',10,7),
(8,'2026-05-02',10,8),
(9,'2026-05-03',11,9),
(10,'2026-05-03',10,10);

INSERT INTO KEMATIANAYAM (KematianID, TanggalKematian, JumlahMati, Penyebab, BatchID, KaryawanID) VALUES
(1,'2026-05-01',5,'Sakit',1,10),
(2,'2026-05-02',3,'TidakDiketahui',2,10),
(3,'2026-05-01',8,'Kanibalisme',3,11),
(4,'2026-05-03',4,'Sakit',4,11),
(5,'2026-05-02',6,'Sakit',5,11),
(6,'2026-05-04',2,'TidakDiketahui',6,11),
(7,'2026-05-03',7,'Sakit',7,10),
(8,'2026-05-04',5,'Kanibalisme',9,11);

INSERT INTO PEMBERIANPAKAN (FeedingID, TanggalFeeding, Sesi, JumlahKg, BatchID, PakanID, KaryawanID) VALUES
(1,'2026-05-01','Pagi',150,1,3,6),
(2,'2026-05-01','Sore',140,1,3,6),
(3,'2026-05-01','Pagi',155,2,3,6),
(4,'2026-05-01','Pagi',148,3,3,7),
(5,'2026-05-01','Sore',145,3,3,7),
(6,'2026-05-01','Pagi',160,5,4,8),
(7,'2026-05-01','Pagi',158,6,4,8),
(8,'2026-05-02','Pagi',142,7,3,9),
(9,'2026-05-02','Pagi',150,8,3,9),
(10,'2026-05-02','Pagi',165,9,4,6),
(11,'2026-05-02','Sore',160,9,4,6),
(12,'2026-05-02','Pagi',170,10,3,7);

INSERT INTO TINDAKANMEDIS (MedisID, TanggalTindakan, JenisTindakan, DosisAktual, Keterangan, BatchID, ObatID, DokterID) VALUES
(1,'2026-04-15','Vaksinasi',10,'Vaksinasi rutin ND',1,2,12),
(2,'2026-04-15','Vaksinasi',10,'Vaksinasi rutin ND',2,2,12),
(3,'2026-04-20','Vitamin',5,'Pemberian vitamin pasca stress',3,1,13),
(4,'2026-04-25','Vaksinasi',8,'Vaksinasi AI',5,3,13),
(5,'2026-04-25','Vaksinasi',8,'Vaksinasi AI',6,3,13),
(6,'2026-05-01','Desinfeksi',2,'Penyemprotan kandang',7,4,12),
(7,'2026-05-05','Vitamin',6,'Vitamin penguat daya tahan',9,1,13),
(8,'2026-05-06','Vaksinasi',10,'Vaksinasi ND lanjutan',10,2,12);

INSERT INTO DETAILPANEN (DetailPanenID, GradeTelur, JumlahButir, BeratKg, PanenID) VALUES
(1,'A',2800,168.00,1),
(2,'B',300,16.50,1),
(3,'A',2900,174.00,2),
(4,'A',2700,162.00,3),
(5,'B',250,13.75,3),
(6,'A',2950,177.00,4),
(7,'A',3100,186.00,5),
(8,'B',200,11.00,5),
(9,'A',3050,183.00,6),
(10,'A',2600,156.00,7),
(11,'A',2750,165.00,8),
(12,'A',2900,174.00,9),
(13,'B',280,15.40,9),
(14,'A',2850,171.00,10);
