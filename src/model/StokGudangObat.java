package model;

import java.sql.Date;

public class StokGudangObat {
    private int stokObatId;
    private int jumlahStok;
    private Date tanggalUpdate;
    private int obatId;
    private int farmId;

    public StokGudangObat() {}
    public StokGudangObat(int stokObatId, int jumlahStok, Date tanggalUpdate, int obatId, int farmId) {
        this.stokObatId = stokObatId;
        this.jumlahStok = jumlahStok;
        this.tanggalUpdate = tanggalUpdate;
        this.obatId = obatId;
        this.farmId = farmId;
    }

    public int getStokObatId() { return stokObatId; }
    public void setStokObatId(int stokObatId) { this.stokObatId = stokObatId; }
    public int getJumlahStok() { return jumlahStok; }
    public void setJumlahStok(int jumlahStok) { this.jumlahStok = jumlahStok; }
    public Date getTanggalUpdate() { return tanggalUpdate; }
    public void setTanggalUpdate(Date tanggalUpdate) { this.tanggalUpdate = tanggalUpdate; }
    public int getObatId() { return obatId; }
    public void setObatId(int obatId) { this.obatId = obatId; }
    public int getFarmId() { return farmId; }
    public void setFarmId(int farmId) { this.farmId = farmId; }
}