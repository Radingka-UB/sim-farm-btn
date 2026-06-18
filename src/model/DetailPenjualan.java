package model;

public class DetailPenjualan {
    private int detailId;
    private String gradeTelur;
    private int jumlahButir;
    private double beratKg;
    private int hargaPerKg;
    private int batchId;
    private int penjualanId;

    public DetailPenjualan() {}

    public DetailPenjualan(int detailId, String gradeTelur, int jumlahButir, double beratKg, int hargaPerKg, int batchId, int penjualanId) {
        this.detailId = detailId;
        this.gradeTelur = gradeTelur;
        this.jumlahButir = jumlahButir;
        this.beratKg = beratKg;
        this.hargaPerKg = hargaPerKg;
        this.batchId = batchId;
        this.penjualanId = penjualanId;
    }

    public int getDetailId() { return detailId; }
    public void setDetailId(int detailId) { this.detailId = detailId; }

    public String getGradeTelur() { return gradeTelur; }
    public void setGradeTelur(String gradeTelur) { this.gradeTelur = gradeTelur; }

    public int getJumlahButir() { return jumlahButir; }
    public void setJumlahButir(int jumlahButir) { this.jumlahButir = jumlahButir; }

    public double getBeratKg() { return beratKg; }
    public void setBeratKg(double beratKg) { this.beratKg = beratKg; }

    public int getHargaPerKg() { return hargaPerKg; }
    public void setHargaPerKg(int hargaPerKg) { this.hargaPerKg = hargaPerKg; }

    public int getBatchId() { return batchId; }
    public void setBatchId(int batchId) { this.batchId = batchId; }

    public int getPenjualanId() { return penjualanId; }
    public void setPenjualanId(int penjualanId) { this.penjualanId = penjualanId; }
}