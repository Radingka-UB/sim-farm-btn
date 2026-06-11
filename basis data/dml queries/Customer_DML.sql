USE SIM_FARM_BTN;
GO
DELETE FROM CUSTOMER;
INSERT INTO CUSTOMER (id_customer, nama_customer, jenis_customer) VALUES
(1, 'Supermarket Indomakmur', 'Supermarket'),
(2, 'Agen Telur Berkah Jaya', 'Agen/Pasar'),
(3, 'Pabrik Roti & Kue Lezat', 'Pabrik Industri'),
(4, 'Pasar Induk Kramat Jati - Toko Amanah', 'Agen/Pasar'),
(5, 'Giant Distributor Egg', 'Distributor Besar');