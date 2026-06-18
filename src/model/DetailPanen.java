package model;

public class DetailPanen {
    private int detailPanenId;
    private String gradeTelur;
    private int jumlahButir;
    private double beratKg;
    private int panenId;

    public DetailPanen() {}

    public DetailPanen(int detailPanenId, String gradeTelur, int jumlahButir, double beratKg, int panenId) {
        this.detailPanenId = detailPanenId;
        this.gradeTelur = gradeTelur;
        this.jumlahButir = jumlahButir;
        this.beratKg = beratKg;
        this.panenId = panenId;
    }

    public int getDetailPanenId() { return detailPanenId; }
    public void setDetailPanenId(int detailPanenId) { this.detailPanenId = detailPanenId; }

    public String getGradeTelur() { return gradeTelur; }
    public void setGradeTelur(String gradeTelur) { this.gradeTelur = gradeTelur; }

    public int getJumlahButir() { return jumlahButir; }
    public void setJumlahButir(int jumlahButir) { this.jumlahButir = jumlahButir; }

    public double getBeratKg() { return beratKg; }
    public void setBeratKg(double beratKg) { this.beratKg = beratKg; }

    public int getPanenId() { return panenId; }
    public void setPanenId(int panenId) { this.panenId = panenId; }
}