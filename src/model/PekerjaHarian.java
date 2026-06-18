package model;

public class PekerjaHarian {
    private int karyawanId;
    private int upahPerHari;
    private String jadwalShift;

    public PekerjaHarian() {}
    public PekerjaHarian(int karyawanId, int upahPerHari, String jadwalShift) {
        this.karyawanId = karyawanId;
        this.upahPerHari = upahPerHari;
        this.jadwalShift = jadwalShift;
    }

    public int getKaryawanId() { return karyawanId; }
    public void setKaryawanId(int karyawanId) { this.karyawanId = karyawanId; }
    public int getUpahPerHari() { return upahPerHari; }
    public void setUpahPerHari(int upahPerHari) { this.upahPerHari = upahPerHari; }
    public String getJadwalShift() { return jadwalShift; }
    public void setJadwalShift(String jadwalShift) { this.jadwalShift = jadwalShift; }
}