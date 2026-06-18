package model;

public class Kandang {
    private int kandangId;
    private String namaKandang;
    private int kapasitasMaksimal;
    private String statusKandang;
    private String tipeKandang;
    private int farmId;

    public Kandang() {}

    public Kandang(int kandangId, String namaKandang, int kapasitasMaksimal, String statusKandang, String tipeKandang, int farmId) {
        this.kandangId = kandangId;
        this.namaKandang = namaKandang;
        this.kapasitasMaksimal = kapasitasMaksimal;
        this.statusKandang = statusKandang;
        this.tipeKandang = tipeKandang;
        this.farmId = farmId;
    }

    public int getKandangId() { return kandangId; }
    public void setKandangId(int kandangId) { this.kandangId = kandangId; }

    public String getNamaKandang() { return namaKandang; }
    public void setNamaKandang(String namaKandang) { this.namaKandang = namaKandang; }

    public int getKapasitasMaksimal() { return kapasitasMaksimal; }
    public void setKapasitasMaksimal(int kapasitasMaksimal) { this.kapasitasMaksimal = kapasitasMaksimal; }

    public String getStatusKandang() { return statusKandang; }
    public void setStatusKandang(String statusKandang) { this.statusKandang = statusKandang; }

    public String getTipeKandang() { return tipeKandang; }
    public void setTipeKandang(String tipeKandang) { this.tipeKandang = tipeKandang; }

    public int getFarmId() { return farmId; }
    public void setFarmId(int farmId) { this.farmId = farmId; }
}