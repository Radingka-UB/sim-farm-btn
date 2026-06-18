package model;

import java.sql.Date;

public class ManajerFarm {
    private int karyawanId;
    private int gajiPokok;
    private Date tanggalPengangkatan;

    public ManajerFarm() {}
    public ManajerFarm(int karyawanId, int gajiPokok, Date tanggalPengangkatan) {
        this.karyawanId = karyawanId;
        this.gajiPokok = gajiPokok;
        this.tanggalPengangkatan = tanggalPengangkatan;
    }

    public int getKaryawanId() { return karyawanId; }
    public void setKaryawanId(int karyawanId) { this.karyawanId = karyawanId; }
    public int getGajiPokok() { return gajiPokok; }
    public void setGajiPokok(int gajiPokok) { this.gajiPokok = gajiPokok; }
    public Date getTanggalPengangkatan() { return tanggalPengangkatan; }
    public void setTanggalPengangkatan(Date tanggalPengangkatan) { this.tanggalPengangkatan = tanggalPengangkatan; }
}