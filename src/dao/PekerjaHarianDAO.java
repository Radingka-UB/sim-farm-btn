package dao;

import config.DBConnection;
import model.PekerjaHarian;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PekerjaHarianDAO {
    public boolean insertPekerja(PekerjaHarian ph) {
        String sql = "INSERT INTO PEKERJAHARIAN (KaryawanID, UpahPerHari, JadwalShift) VALUES (?, ?, ?)";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, ph.getKaryawanId());
            ps.setInt(2, ph.getUpahPerHari());
            ps.setString(3, ph.getJadwalShift());
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println("Error PekerjaHarian: " + e.getMessage());
            return false;
        }
    }

    public List<PekerjaHarian> getAllPekerja() {
        List<PekerjaHarian> list = new ArrayList<>();
        String sql = "SELECT * FROM PEKERJAHARIAN";
        try (Connection conn = DBConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                list.add(new PekerjaHarian(rs.getInt(1), rs.getInt(2), rs.getString(3)));
            }
        } catch (SQLException e) { System.out.println("Error: " + e.getMessage()); }
        return list;
    }
}