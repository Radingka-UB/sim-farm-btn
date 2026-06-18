package dao;

import config.DBConnection;
import model.PanenTelur;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PanenTelurDAO {
    public boolean insertPanen(PanenTelur pt) {
        String sql = "INSERT INTO PANENTELUR (PanenID, TanggalPanen, KaryawanID, BatchID) VALUES (?, ?, ?, ?)";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, pt.getPanenId());
            ps.setDate(2, pt.getTanggalPanen());
            ps.setInt(3, pt.getKaryawanId());
            ps.setInt(4, pt.getBatchId());
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println("Error PanenTelur: " + e.getMessage());
            return false;
        }
    }

    public List<PanenTelur> getAllPanen() {
        List<PanenTelur> list = new ArrayList<>();
        String sql = "SELECT * FROM PANENTELUR";
        try (Connection conn = DBConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                list.add(new PanenTelur(rs.getInt(1), rs.getDate(2), rs.getInt(3), rs.getInt(4)));
            }
        } catch (SQLException e) { System.out.println("Error: " + e.getMessage()); }
        return list;
    }
    // Tambahkan ini di dalam kelas PanenTelurDAO
    public boolean updatePanen(PanenTelur pt) {
        String sql = "UPDATE PANENTELUR SET TanggalPanen = ?, KaryawanID = ?, BatchID = ? WHERE PanenID = ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setDate(1, pt.getTanggalPanen());
            ps.setInt(2, pt.getKaryawanId());
            ps.setInt(3, pt.getBatchId());
            ps.setInt(4, pt.getPanenId());
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println("Error Update Panen: " + e.getMessage());
            return false;
        }
    }

    public boolean deletePanen(int panenId) {
        String sql = "DELETE FROM PANENTELUR WHERE PanenID = ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, panenId);
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println("Error Delete Panen: " + e.getMessage());
            return false;
        }
    }
}
