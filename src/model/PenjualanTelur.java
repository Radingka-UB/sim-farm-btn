package model;

import java.sql.Date;

public class PenjualanTelur {
    private int penjualanId;
    private Date tanggalJual;
    private double totalBerat;
    private int totalHarga;
    private int karyawanId;
    private int customerId;

    public PenjualanTelur() {}
    public PenjualanTelur(int penjualanId, Date tanggalJual, double totalBerat, int totalHarga, int karyawanId, int customerId) {
        this.penjualanId = penjualanId;
        this.tanggalJual = tanggalJual;
        this.totalBerat = totalBerat;
        this.totalHarga = totalHarga;
        this.karyawanId = karyawanId;
        this.customerId = customerId;
    }

    public int getPenjualanId() { return penjualanId; }
    public void setPenjualanId(int penjualanId) { this.penjualanId = penjualanId; }
    public Date getTanggalJual() { return tanggalJual; }
    public void setTanggalJual(Date tanggalJual) { this.tanggalJual = tanggalJual; }
    public double getTotalBerat() { return totalBerat; }
    public void setTotalBerat(double totalBerat) { this.totalBerat = totalBerat; }
    public int getTotalHarga() { return totalHarga; }
    public void setTotalHarga(int totalHarga) { this.totalHarga = totalHarga; }
    public int getKaryawanId() { return karyawanId; }
    public void setKaryawanId(int karyawanId) { this.karyawanId = karyawanId; }
    public int getCustomerId() { return customerId; }
    public void setCustomerId(int customerId) { this.customerId = customerId; }
}