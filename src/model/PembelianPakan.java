package model;

import java.sql.Date;

public class PembelianPakan {
    private int pembelianId;
    private Date tanggalBeli;
    private int jumlahKg;
    private int hargaTotal;
    private int supplierId;
    private int pakanId;
    private int farmId;

    public PembelianPakan() {}
    public PembelianPakan(int pembelianId, Date tanggalBeli, int jumlahKg, int hargaTotal, int supplierId, int pakanId, int farmId) {
        this.pembelianId = pembelianId;
        this.tanggalBeli = tanggalBeli;
        this.jumlahKg = jumlahKg;
        this.hargaTotal = hargaTotal;
        this.supplierId = supplierId;
        this.pakanId = pakanId;
        this.farmId = farmId;
    }

    public int getPembelianId() { return pembelianId; }
    public void setPembelianId(int pembelianId) { this.pembelianId = pembelianId; }
    public Date getTanggalBeli() { return tanggalBeli; }
    public void setTanggalBeli(Date tanggalBeli) { this.tanggalBeli = tanggalBeli; }
    public int getJumlahKg() { return jumlahKg; }
    public void setJumlahKg(int jumlahKg) { this.jumlahKg = jumlahKg; }
    public int getHargaTotal() { return hargaTotal; }
    public void setHargaTotal(int hargaTotal) { this.hargaTotal = hargaTotal; }
    public int getSupplierId() { return supplierId; }
    public void setSupplierId(int supplierId) { this.supplierId = supplierId; }
    public int getPakanId() { return pakanId; }
    public void setPakanId(int pakanId) { this.pakanId = pakanId; }
    public int getFarmId() { return farmId; }
    public void setFarmId(int farmId) { this.farmId = farmId; }
}