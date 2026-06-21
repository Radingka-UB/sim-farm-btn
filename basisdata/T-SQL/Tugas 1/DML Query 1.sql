-- Query 1: Total pembelian pakan per supplier per farm
use sim_farm_btn
go
SELECT F.NamaFarm,
       S.NamaSupplier,
       SUM(PP.HargaTotal) AS TotalPembelian,
       COUNT(PP.PembelianID) AS JumlahTransaksi
FROM PEMBELIANPAKAN PP
JOIN SUPPLIER S ON PP.SupplierID = S.SupplierID
JOIN FARM F ON PP.FarmID = F.FarmID
GROUP BY F.NamaFarm, S.NamaSupplier
HAVING SUM(PP.HargaTotal) > 50000;
