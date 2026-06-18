package model;

import java.sql.Date;

public class PanenTelur {
    private int panenId;
    private Date tanggalPanen;
    private int karyawanId;
    private int batchId;

    public PanenTelur() {}
    public PanenTelur(int panenId, Date tanggalPanen, int karyawanId, int batchId) {
        this.panenId = panenId;
        this.tanggalPanen = tanggalPanen;
        this.karyawanId = karyawanId;
        this.batchId = batchId;
    }

    public int getPanenId() { return panenId; }
    public void setPanenId(int panenId) { this.panenId = panenId; }
    public Date getTanggalPanen() { return tanggalPanen; }
    public void setTanggalPanen(Date tanggalPanen) { this.tanggalPanen = tanggalPanen; }
    public int getKaryawanId() { return karyawanId; }
    public void setKaryawanId(int karyawanId) { this.karyawanId = karyawanId; }
    public int getBatchId() { return batchId; }
    public void setBatchId(int batchId) { this.batchId = batchId; }
}