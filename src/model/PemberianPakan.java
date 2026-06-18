package model;

import java.sql.Date;

public class PemberianPakan {
    private int feedingId;
    private Date tanggalFeeding;
    private String sesi;
    private int jumlahKg;
    private int batchId;
    private int pakanId;
    private int karyawanId;

    public PemberianPakan() {}
    public PemberianPakan(int feedingId, Date tanggalFeeding, String sesi, int jumlahKg, int batchId, int pakanId, int karyawanId) {
        this.feedingId = feedingId;
        this.tanggalFeeding = tanggalFeeding;
        this.sesi = sesi;
        this.jumlahKg = jumlahKg;
        this.batchId = batchId;
        this.pakanId = pakanId;
        this.karyawanId = karyawanId;
    }

    public int getFeedingId() { return feedingId; }
    public void setFeedingId(int feedingId) { this.feedingId = feedingId; }
    public Date getTanggalFeeding() { return tanggalFeeding; }
    public void setTanggalFeeding(Date tanggalFeeding) { this.tanggalFeeding = tanggalFeeding; }
    public String getSesi() { return sesi; }
    public void setSesi(String sesi) { this.sesi = sesi; }
    public int getJumlahKg() { return jumlahKg; }
    public void setJumlahKg(int jumlahKg) { this.jumlahKg = jumlahKg; }
    public int getBatchId() { return batchId; }
    public void setBatchId(int batchId) { this.batchId = batchId; }
    public int getPakanId() { return pakanId; }
    public void setPakanId(int pakanId) { this.pakanId = pakanId; }
    public int getKaryawanId() { return karyawanId; }
    public void setKaryawanId(int karyawanId) { this.karyawanId = karyawanId; }
}