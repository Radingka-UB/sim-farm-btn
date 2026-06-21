-- Query 5: Farm dengan total kematian ayam tertinggi dibanding rata‑rata semua farm
use SIM_FARM_BTN
go
SELECT F.NamaFarm,
       SUM(KA.JumlahMati) AS TotalKematian
FROM KEMATIANAYAM KA
JOIN BATCH B ON KA.BatchID = B.BatchID
JOIN KANDANG K ON B.KandangID = K.KandangID
JOIN FARM F ON K.FarmID = F.FarmID
GROUP BY F.NamaFarm
HAVING SUM(KA.JumlahMati) > (
    SELECT AVG(JumlahMati)
    FROM KEMATIANAYAM
)
ORDER BY TotalKematian DESC;
