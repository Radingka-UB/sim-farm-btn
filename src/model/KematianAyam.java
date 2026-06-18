package model;

import java.sql.Date;

public class KematianAyam {
    private int kematianId;
    private Date tanggalKematian;
    private int jumlahMati;
    private String penyebab;
    private int batchId;
    private int karyawanId;

    public KematianAyam() {}

    public KematianAyam(int kematianId, Date tanggalKematian, int jumlahMati, String penyebab, int batchId, int karyawanId) {
        this.kematianId = kematianId;
        this.tanggalKematian = tanggalKematian;
        this.jumlahMati = jumlahMati;
        this.penyebab = penyebab;
        this.batchId = batchId;
        this.karyawanId = karyawanId;
    }

    public int getKematianId() { return kematianId; }
    public void setKematianId(int kematianId) { this.kematianId = kematianId; }

    public Date getTanggalKematian() { return tanggalKematian; }
    public void setTanggalKematian(Date tanggalKematian) { this.tanggalKematian = tanggalKematian; }

    public int getJumlahMati() { return jumlahMati; }
    public void setJumlahMati(int jumlahMati) { this.jumlahMati = jumlahMati; }

    public String getPenyebab() { return penyebab; }
    public void setPenyebab(String penyebab) { this.penyebab = penyebab; }

    public int getBatchId() { return batchId; }
    public void setBatchId(int batchId) { this.batchId = batchId; }

    public int getKaryawanId() { return karyawanId; }
    public void setKaryawanId(int karyawanId) { this.karyawanId = karyawanId; }
}