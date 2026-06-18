package model;

import java.sql.Date;

public class PembelianObat {
    private int pembelianObatId;
    private Date tanggalBeli;
    private int jumlahStok;
    private int hargaTotal;
    private int farmId;
    private int supplierId;

    public PembelianObat() {}
    public PembelianObat(int pembelianObatId, Date tanggalBeli, int jumlahStok, int hargaTotal, int farmId, int supplierId) {
        this.pembelianObatId = pembelianObatId;
        this.tanggalBeli = tanggalBeli;
        this.jumlahStok = jumlahStok;
        this.hargaTotal = hargaTotal;
        this.farmId = farmId;
        this.supplierId = supplierId;
    }

    public int getPembelianObatId() { return pembelianObatId; }
    public void setPembelianObatId(int pembelianObatId) { this.pembelianObatId = pembelianObatId; }
    public Date getTanggalBeli() { return tanggalBeli; }
    public void setTanggalBeli(Date tanggalBeli) { this.tanggalBeli = tanggalBeli; }
    public int getJumlahStok() { return jumlahStok; }
    public void setJumlahStok(int jumlahStok) { this.jumlahStok = jumlahStok; }
    public int getHargaTotal() { return hargaTotal; }
    public void setHargaTotal(int hargaTotal) { this.hargaTotal = hargaTotal; }
    public int getFarmId() { return farmId; }
    public void setFarmId(int farmId) { this.farmId = farmId; }
    public int getSupplierId() { return supplierId; }
    public void setSupplierId(int supplierId) { this.supplierId = supplierId; }
}