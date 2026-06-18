package model;

public class Obat {
    private int obatId;
    private String namaObat;
    private String jenisObat;
    private String satuan;

    public Obat() {}

    public Obat(int obatId, String namaObat, String jenisObat, String satuan) {
        this.obatId = obatId;
        this.namaObat = namaObat;
        this.jenisObat = jenisObat;
        this.satuan = satuan;
    }

    public int getObatId() { return obatId; }
    public void setObatId(int obatId) { this.obatId = obatId; }

    public String getNamaObat() { return namaObat; }
    public void setNamaObat(String namaObat) { this.namaObat = namaObat; }

    public String getJenisObat() { return jenisObat; }
    public void setJenisObat(String jenisObat) { this.jenisObat = jenisObat; }

    public String getSatuan() { return satuan; }
    public void setSatuan(String satuan) { this.satuan = satuan; }
}