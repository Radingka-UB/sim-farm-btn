package model;

public class DokterHewan {
    private int karyawanId;
    private String noSip;
    private String spesialisasi;
    private String statusMitra;
    private int biayaKunjungan;

    public DokterHewan() {}

    public DokterHewan(int karyawanId, String noSip, String spesialisasi, String statusMitra, int biayaKunjungan) {
        this.karyawanId = karyawanId;
        this.noSip = noSip;
        this.spesialisasi = spesialisasi;
        this.statusMitra = statusMitra;
        this.biayaKunjungan = biayaKunjungan;
    }

    public int getKaryawanId() { return karyawanId; }
    public void setKaryawanId(int karyawanId) { this.karyawanId = karyawanId; }

    public String getNoSip() { return noSip; }
    public void setNoSip(String noSip) { this.noSip = noSip; }

    public String getSpesialisasi() { return spesialisasi; }
    public void setSpesialisasi(String spesialisasi) { this.spesialisasi = spesialisasi; }

    public String getStatusMitra() { return statusMitra; }
    public void setStatusMitra(String statusMitra) { this.statusMitra = statusMitra; }

    public int getBiayaKunjungan() { return biayaKunjungan; }
    public void setBiayaKunjungan(int biayaKunjungan) { this.biayaKunjungan = biayaKunjungan; }
}