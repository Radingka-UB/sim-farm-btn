package model;

import java.sql.Date;

public class StokGudangPakan {
    private int stokPakanId;
    private int jumlahStokKg;
    private Date tanggalUpdate;
    private Date tanggalKadaluarsa; 
    private int farmId;
    private int pakanId;

    public StokGudangPakan() {}
    public StokGudangPakan(int stokPakanId, int jumlahStokKg, Date tanggalUpdate, Date tanggalKadaluarsa, int farmId, int pakanId) {
        this.stokPakanId = stokPakanId;
        this.jumlahStokKg = jumlahStokKg;
        this.tanggalUpdate = tanggalUpdate;
        this.tanggalKadaluarsa = tanggalKadaluarsa;
        this.farmId = farmId;
        this.pakanId = pakanId;
    }

    public int getStokPakanId() { return stokPakanId; }
    public void setStokPakanId(int stokPakanId) { this.stokPakanId = stokPakanId; }
    public int getJumlahStokKg() { return jumlahStokKg; }
    public void setJumlahStokKg(int jumlahStokKg) { this.jumlahStokKg = jumlahStokKg; }
    public Date getTanggalUpdate() { return tanggalUpdate; }
    public void setTanggalUpdate(Date tanggalUpdate) { this.tanggalUpdate = tanggalUpdate; }
    public Date getTanggalKadaluarsa() { return tanggalKadaluarsa; }
    public void setTanggalKadaluarsa(Date tanggalKadaluarsa) { this.tanggalKadaluarsa = tanggalKadaluarsa; }
    public int getFarmId() { return farmId; }
    public void setFarmId(int farmId) { this.farmId = farmId; }
    public int getPakanId() { return pakanId; }
    public void setPakanId(int pakanId) { this.pakanId = pakanId; }
}