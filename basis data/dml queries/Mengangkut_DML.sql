USE SIM_FARM_BTN;
GO
DELETE FROM MENGANGKUT;

INSERT INTO MENGANGKUT (id_harvesting, id_kandang, id_shipping, id_customer) VALUES
(1, 1001, 101, 1),
(2, 1001, 101, 1),
(5, 1004, 102, 2),
(6, 1004, 102, 2),
(7, 1001, 103, 3),
(9, 1004, 104, 4);