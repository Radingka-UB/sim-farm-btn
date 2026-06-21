-- Trigger untuk mengupdate populasi ayam setelah terjadi kematian dan mencatat log kematian
use SIM_FARM_BTN
go
CREATE TRIGGER trg_UpdatePopulasiAyam
ON KEMATIANAYAM
AFTER INSERT
AS
BEGIN
    UPDATE B
    SET B.PopulasiSekarang = B.PopulasiSekarang - i.JumlahMati
    FROM BATCH B
    JOIN INSERTED i ON B.BatchID = i.BatchID;
END;
