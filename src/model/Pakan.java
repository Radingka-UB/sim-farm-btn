package model;

public class Pakan {
    private int pakanId;
    private String namaPakan;
    private String merek;
    private String jenisPakan;
    private int hargaPerKg;

    public Pakan() {}

    public Pakan(int pakanId, String namaPakan, String merek, String jenisPakan, int hargaPerKg) {
        this.pakanId = pakanId;
        this.namaPakan = namaPakan;
        this.merek = merek;
        this.jenisPakan = jenisPakan;
        this.hargaPerKg = hargaPerKg;
    }

    public int getPakanId() { return pakanId; }
    public void setPakanId(int pakanId) { this.pakanId = pakanId; }

    public String getNamaPakan() { return namaPakan; }
    public void setNamaPakan(String namaPakan) { this.namaPakan = namaPakan; }

    public String getMerek() { return merek; }
    public void setMerek(String merek) { this.merek = merek; }

    public String getJenisPakan() { return jenisPakan; }
    public void setJenisPakan(String jenisPakan) { this.jenisPakan = jenisPakan; }

    public int getHargaPerKg() { return hargaPerKg; }
    public void setHargaPerKg(int hargaPerKg) { this.hargaPerKg = hargaPerKg; }
}