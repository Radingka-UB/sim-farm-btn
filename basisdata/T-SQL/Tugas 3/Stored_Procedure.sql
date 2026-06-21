-- Prosedur untuk mendapatkan laporan kinerja farm berdasarkan jumlah telur yang dipanen dan rata-rata berat telur dalam periode tertentu
use SIM_FARM_BTN
go
CREATE PROCEDURE sp_GetLaporanKinerjaFarm
    @TanggalAwal DATE,
    @TanggalAkhir DATE
AS
BEGIN
    SELECT F.NamaFarm,
           SUM(DP.JumlahButir) AS TotalTelur,
           AVG(DP.BeratKg) AS RataBeratTelur
    FROM FARM F
    JOIN PANENTELUR PT ON F.FarmID = (
        SELECT K.FarmID
        FROM BATCH B
        JOIN KANDANG K ON B.KandangID = K.KandangID
        WHERE B.BatchID = PT.BatchID
    )
    JOIN DETAILPANEN DP ON PT.PanenID = DP.PanenID
    WHERE PT.TanggalPanen BETWEEN @TanggalAwal AND @TanggalAkhir
    GROUP BY F.NamaFarm;
END;

-- Contoh eksekusi prosedur untuk mendapatkan laporan kinerja farm dari 1 Januari 2026 hingga 30 Juni 2026
use SIM_FARM_BTN
go
EXEC sp_GetLaporanKinerjaFarm '2026-01-01', '2026-06-30';
