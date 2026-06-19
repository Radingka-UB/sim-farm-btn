-- Query 4: Total penjualan telur per farm dan rata‑rata berat per grade
SELECT F.NamaFarm,
       DP.GradeTelur,
       SUM(DP.JumlahButir) AS TotalTelur,
       AVG(DP.BeratKg) AS RataBeratTelur
FROM DETAILPENJUALAN DP
JOIN PENJUALANTELUR PJ ON DP.PenjualanID = PJ.PenjualanID
JOIN KARYAWAN K ON PJ.KaryawanID = K.KaryawanID
JOIN FARM F ON K.FarmID = F.FarmID
GROUP BY F.NamaFarm, DP.GradeTelur
HAVING SUM(DP.JumlahButir) > (
    SELECT AVG(JumlahButir) FROM DETAILPENJUALAN
)
ORDER BY F.NamaFarm, DP.GradeTelur;