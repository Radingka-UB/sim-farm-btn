-- Rekap total panen per bulan untuk setiap farm dari Januari hingga Juni.
SELECT NamaFarm,
       [Jan] AS Januari,
       [Feb] AS Februari,
       [Mar] AS Maret,
       [Apr] AS April,
       [May] AS Mei,
       [Jun] AS Juni
FROM (
    SELECT F.NamaFarm,
           LEFT(DATENAME(MONTH, PT.TanggalPanen), 3) AS Bulan,
           DP.JumlahButir
    FROM FARM F
    JOIN PANENTELUR PT ON F.FarmID = (
        SELECT K.FarmID
        FROM BATCH B
        JOIN KANDANG K ON B.KandangID = K.KandangID
        WHERE B.BatchID = PT.BatchID
    )
    JOIN DETAILPANEN DP ON PT.PanenID = DP.PanenID
) AS SourceTable
PIVOT (
    SUM(JumlahButir)
    FOR Bulan IN ([Jan], [Feb], [Mar], [Apr], [May], [Jun])
) AS PivotTable;