package model;

import java.sql.Date;

public class Karyawan {
    private int karyawanId;
    private String nama;
    private String nik;
    private Date tanggalLahir;
    private String alamat;
    private String telepon;
    private String jenisKelamin;
    private Date tanggalMasuk;
    private String tipeKaryawan;
    private int farmId;

    public Karyawan() {}

    public Karyawan(int karyawanId, String nama, String nik, Date tanggalLahir, String alamat, String telepon, String jenisKelamin, Date tanggalMasuk, String tipeKaryawan, int farmId) {
        this.karyawanId = karyawanId;
        this.nama = nama;
        this.nik = nik;
        this.tanggalLahir = tanggalLahir;
        this.alamat = alamat;
        this.telepon = telepon;
        this.jenisKelamin = jenisKelamin;
        this.tanggalMasuk = tanggalMasuk;
        this.tipeKaryawan = tipeKaryawan;
        this.farmId = farmId;
    }

    public int getKaryawanId() { return karyawanId; }
    public void setKaryawanId(int karyawanId) { this.karyawanId = karyawanId; }

    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }

    public String getNik() { return nik; }
    public void setNik(String nik) { this.nik = nik; }

    public Date getTanggalLahir() { return tanggalLahir; }
    public void setTanggalLahir(Date tanggalLahir) { this.tanggalLahir = tanggalLahir; }

    public String getAlamat() { return alamat; }
    public void setAlamat(String alamat) { this.alamat = alamat; }

    public String getTelepon() { return telepon; }
    public void setTelepon(String telepon) { this.telepon = telepon; }

    public String getJenisKelamin() { return jenisKelamin; }
    public void setJenisKelamin(String jenisKelamin) { this.jenisKelamin = jenisKelamin; }

    public Date getTanggalMasuk() { return tanggalMasuk; }
    public void setTanggalMasuk(Date tanggalMasuk) { this.tanggalMasuk = tanggalMasuk; }

    public String getTipeKaryawan() { return tipeKaryawan; }
    public void setTipeKaryawan(String tipeKaryawan) { this.tipeKaryawan = tipeKaryawan; }

    public int getFarmId() { return farmId; }
    public void setFarmId(int farmId) { this.farmId = farmId; }
}