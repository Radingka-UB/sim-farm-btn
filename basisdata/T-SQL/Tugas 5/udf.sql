-- UDF untuk menghitung persentase kematian ayam dalam suatu batch berdasarkan jumlah ayam awal dan jumlah ayam yang mati.
use SIM_FARM_BTN
go
CREATE FUNCTION fn_PersentaseKematian
(
    @BatchID INT
)
RETURNS FLOAT
AS
BEGIN
    DECLARE @Awal INT, @Mati INT, @Persentase FLOAT;

    SELECT @Awal = JumlahAyamAwal, @Mati = SUM(JumlahMati)
    FROM BATCH B
    JOIN KEMATIANAYAM K ON B.BatchID = K.BatchID
    WHERE B.BatchID = @BatchID
    GROUP BY B.JumlahAyamAwal;

    SET @Persentase = (@Mati * 100.0) / @Awal;
    RETURN @Persentase;
END;

-- Contoh pemakainannya:
use SIM_FARM_BTN
go
SELECT dbo.fn_PersentaseKematian(1) AS PersentaseKematian;
