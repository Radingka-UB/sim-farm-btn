-- Query 3: Jumlah kematian ayam per farm dengan join batch dan kandang
SELECT F.NamaFarm,
       SUM(KA.JumlahMati) AS TotalKematian
FROM KEMATIANAYAM KA
JOIN BATCH B ON KA.BatchID = B.BatchID
JOIN KANDANG K ON B.KandangID = K.KandangID
JOIN FARM F ON K.FarmID = F.FarmID
GROUP BY F.NamaFarm
ORDER BY TotalKematian DESC;