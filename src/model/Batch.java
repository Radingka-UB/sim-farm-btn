package model;

import java.sql.Date;

public class Batch {
    private int batchId;
    private String kodeAyam;
    private String jenisAyam;
    private Date tanggalMasuk;
    private int jumlahAyamAwal;
    private int populasiSekarang;
    private String statusBatch;
    private int kandangId;

    public Batch() {}

    public Batch(int batchId, String kodeAyam, String jenisAyam, Date tanggalMasuk, int jumlahAyamAwal, int populasiSekarang, String statusBatch, int kandangId) {
        this.batchId = batchId;
        this.kodeAyam = kodeAyam;
        this.jenisAyam = jenisAyam;
        this.tanggalMasuk = tanggalMasuk;
        this.jumlahAyamAwal = jumlahAyamAwal;
        this.populasiSekarang = populasiSekarang;
        this.statusBatch = statusBatch;
        this.kandangId = kandangId;
    }

    public int getBatchId() { return batchId; }
    public void setBatchId(int batchId) { this.batchId = batchId; }

    public String getKodeAyam() { return kodeAyam; }
    public void setKodeAyam(String kodeAyam) { this.kodeAyam = kodeAyam; }

    public String getJenisAyam() { return jenisAyam; }
    public void setJenisAyam(String jenisAyam) { this.jenisAyam = jenisAyam; }

    public Date getTanggalMasuk() { return tanggalMasuk; }
    public void setTanggalMasuk(Date tanggalMasuk) { this.tanggalMasuk = tanggalMasuk; }

    public int getJumlahAyamAwal() { return jumlahAyamAwal; }
    public void setJumlahAyamAwal(int jumlahAyamAwal) { this.jumlahAyamAwal = jumlahAyamAwal; }

    public int getPopulasiSekarang() { return populasiSekarang; }
    public void setPopulasiSekarang(int populasiSekarang) { this.populasiSekarang = populasiSekarang; }

    public String getStatusBatch() { return statusBatch; }
    public void setStatusBatch(String statusBatch) { this.statusBatch = statusBatch; }

    public int getKandangId() { return kandangId; }
    public void setKandangId(int kandangId) { this.kandangId = kandangId; }
}