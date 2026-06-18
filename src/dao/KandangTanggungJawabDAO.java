package dao;

import config.DBConnection;
import model.KandangTanggungJawab;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class KandangTanggungJawabDAO {

    public boolean insertTanggungJawab(KandangTanggungJawab ktj) {
        String sql;
        // Jika tanggalDitugaskan null, jangan masukkan kolomnya ke query agar DEFAULT GETDATE() dari SQL Server bekerja
        if (ktj.getTanggalDitugaskan() == null) {
            sql = "INSERT INTO KANDANGTANGGUNGJAWAB (KaryawanID, KandangID) VALUES (?, ?)";
        } else {
            sql = "INSERT INTO KANDANGTANGGUNGJAWAB (KaryawanID, KandangID, TanggalDitugaskan) VALUES (?, ?, ?)";
        }
        
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            
            ps.setInt(1, ktj.getKaryawanId());
            ps.setInt(2, ktj.getKandangId());
            
            if (ktj.getTanggalDitugaskan() != null) {
                ps.setDate(3, ktj.getTanggalDitugaskan());
            }
            
            return ps.executeUpdate() > 0;
            
        } catch (SQLException e) {
            System.out.println("Error Kandang TanggonJawab: " + e.getMessage());
            return false;
        }
    }

    public List<KandangTanggungJawab> getAllTanggungJawab() {
        List<KandangTanggungJawab> listTugas = new ArrayList<>();
        String sql = "SELECT * FROM KANDANGTANGGUNGJAWAB";
        
        try (Connection conn = DBConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            
            while (rs.next()) {
                KandangTanggungJawab ktj = new KandangTanggungJawab(
                    rs.getInt(1),
                    rs.getInt(2),
                    rs.getDate(3)
                );
                listTugas.add(ktj);
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return listTugas;
    }
}