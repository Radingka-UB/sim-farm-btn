package model;

import java.sql.Date;

public class KandangTanggungJawab {
    private int karyawanId;
    private int kandangId;
    private Date tanggalDitugaskan;

    public KandangTanggungJawab() {}

    // Constructor lengkap (bisa dipakai saat select data)
    public KandangTanggungJawab(int karyawanId, int kandangId, Date tanggalDitugaskan) {
        this.karyawanId = karyawanId;
        this.kandangId = kandangId;
        this.tanggalDitugaskan = tanggalDitugaskan;
    }

    // Constructor khusus untuk insert tanpa tanggal (memanfaatkan DEFAULT GETDATE() dari SQL Server)
    public KandangTanggungJawab(int karyawanId, int kandangId) {
        this.karyawanId = karyawanId;
        this.kandangId = kandangId;
        this.tanggalDitugaskan = null; 
    }

    public int getKaryawanId() { return karyawanId; }
    public void setKaryawanId(int karyawanId) { this.karyawanId = karyawanId; }

    public int getKandangId() { return kandangId; }
    public void setKandangId(int kandangId) { this.kandangId = kandangId; }

    public Date getTanggalDitugaskan() { return tanggalDitugaskan; }
    public void setTanggalDitugaskan(Date tanggalDitugaskan) { this.tanggalDitugaskan = tanggalDitugaskan; }
}