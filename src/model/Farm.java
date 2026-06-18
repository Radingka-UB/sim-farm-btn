package model;

public class Farm {
    private int farmId;
    private String namaFarm;
    private String alamat;
    private String teleponFarm;

    public Farm() {}

    public Farm(int farmId, String namaFarm, String alamat, String teleponFarm) {
        this.farmId = farmId;
        this.namaFarm = namaFarm;
        this.alamat = alamat;
        this.teleponFarm = teleponFarm;
    }

    public int getFarmId() { return farmId; }
    public void setFarmId(int farmId) { this.farmId = farmId; }

    public String getNamaFarm() { return namaFarm; }
    public void setNamaFarm(String namaFarm) { this.namaFarm = namaFarm; }

    public String getAlamat() { return alamat; }
    public void setAlamat(String alamat) { this.alamat = alamat; }

    public String getTeleponFarm() { return teleponFarm; }
    public void setTeleponFarm(String teleponFarm) { this.teleponFarm = teleponFarm; }
}