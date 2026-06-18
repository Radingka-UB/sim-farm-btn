package dao;

import config.DBConnection;
import model.KematianAyam;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class KematianAyamDAO {

    public boolean insertKematian(KematianAyam ka) {
        String sql = "INSERT INTO KEMATIANAYAM (KematianID, TanggalKematian, JumlahMati, Penyebab, BatchID, KaryawanID) VALUES (?, ?, ?, ?, ?, ?)";
        
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            
            ps.setInt(1, ka.getKematianId());
            ps.setDate(2, ka.getTanggalKematian());
            ps.setInt(3, ka.getJumlahMati());
            ps.setString(4, ka.getPenyebab());
            ps.setInt(5, ka.getBatchId());
            ps.setInt(6, ka.getKaryawanId());
            
            return ps.executeUpdate() > 0;
            
        } catch (SQLException e) {
            System.out.println("Error Kematian Ayam: " + e.getMessage());
            return false;
        }
    }

    public List<KematianAyam> getAllKematian() {
        List<KematianAyam> listKematian = new ArrayList<>();
        String sql = "SELECT * FROM KEMATIANAYAM";
        
        try (Connection conn = DBConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            
            while (rs.next()) {
                KematianAyam ka = new KematianAyam(
                    rs.getInt(1),
                    rs.getDate(2),
                    rs.getInt(3),
                    rs.getString(4),
                    rs.getInt(5),
                    rs.getInt(6)
                );
                listKematian.add(ka);
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return listKematian;
    }
}