package dao;

import config.DBConnection;
import model.DokterHewan;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DokterHewanDAO {

    public boolean insertDokterHewan(DokterHewan dh) {
        String sql = "INSERT INTO DOKTERHEWAN (KaryawanID, NoSIP, Spesialisasi, StatusMitra, BiayaKunjungan) VALUES (?, ?, ?, ?, ?)";
        
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            
            ps.setInt(1, dh.getKaryawanId());
            ps.setString(2, dh.getNoSip());
            ps.setString(3, dh.getSpesialisasi());
            ps.setString(4, dh.getStatusMitra());
            ps.setInt(5, dh.getBiayaKunjungan());
            
            return ps.executeUpdate() > 0;
            
        } catch (SQLException e) {
            System.out.println("Error Dokter Hewan: " + e.getMessage());
            return false;
        }
    }

    public List<DokterHewan> getAllDokterHewan() {
        List<DokterHewan> listDokter = new ArrayList<>();
        String sql = "SELECT * FROM DOKTERHEWAN";
        
        try (Connection conn = DBConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            
            while (rs.next()) {
                DokterHewan dh = new DokterHewan(
                    rs.getInt(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getInt(5)
                );
                listDokter.add(dh);
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return listDokter;
    }
}