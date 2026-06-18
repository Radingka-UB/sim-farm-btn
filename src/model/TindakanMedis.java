package model;

import java.sql.Date;

public class TindakanMedis {
    private int medisId;
    private Date tanggalTindakan;
    private String jenisTindakan;
    private int dosisAktual;
    private String keterangan; // Bisa bernilai null
    private int batchId;
    private int obatId;
    private int dokterId;

    public TindakanMedis() {}
    public TindakanMedis(int medisId, Date tanggalTindakan, String jenisTindakan, int dosisAktual, String keterangan, int batchId, int obatId, int dokterId) {
        this.medisId = medisId;
        this.tanggalTindakan = tanggalTindakan;
        this.jenisTindakan = jenisTindakan;
        this.dosisAktual = dosisAktual;
        this.keterangan = keterangan;
        this.batchId = batchId;
        this.obatId = obatId;
        this.dokterId = dokterId;
    }

    public int getMedisId() { return medisId; }
    public void setMedisId(int medisId) { this.medisId = medisId; }
    public Date getTanggalTindakan() { return tanggalTindakan; }
    public void setTanggalTindakan(Date tanggalTindakan) { this.tanggalTindakan = tanggalTindakan; }
    public String getJenisTindakan() { return jenisTindakan; }
    public void setJenisTindakan(String jenisTindakan) { this.jenisTindakan = jenisTindakan; }
    public int getDosisAktual() { return dosisAktual; }
    public void setDosisAktual(int dosisAktual) { this.dosisAktual = dosisAktual; }
    public String getKeterangan() { return keterangan; }
    public void setKeterangan(String keterangan) { this.keterangan = keterangan; }
    public int getBatchId() { return batchId; }
    public void setBatchId(int batchId) { this.batchId = batchId; }
    public int getObatId() { return obatId; }
    public void setObatId(int obatId) { this.obatId = obatId; }
    public int getDokterId() { return dokterId; }
    public void setDokterId(int dokterId) { this.dokterId = dokterId; }
}