package model;

public class MandorKandang {
    private int karyawanId;
    private int gajiPokok;

    public MandorKandang() {}
    public MandorKandang(int karyawanId, int gajiPokok) {
        this.karyawanId = karyawanId;
        this.gajiPokok = gajiPokok;
    }

    public int getKaryawanId() { return karyawanId; }
    public void setKaryawanId(int karyawanId) { this.karyawanId = karyawanId; }
    public int getGajiPokok() { return gajiPokok; }
    public void setGajiPokok(int gajiPokok) { this.gajiPokok = gajiPokok; }
}