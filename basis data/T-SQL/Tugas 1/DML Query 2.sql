-- Query 2: Farm dengan rata-rata harga pakan di atas rata-rata keseluruhan
SELECT F.NamaFarm,
       AVG(P.HargaPerKg) AS RataHargaFarm
FROM FARM F
JOIN PEMBELIANPAKAN PP ON F.FarmID = PP.FarmID
JOIN PAKAN P ON PP.PakanID = P.PakanID
GROUP BY F.NamaFarm
HAVING AVG(P.HargaPerKg) > (
    SELECT AVG(HargaPerKg) FROM PAKAN
);