package dao;

import config.DBConnection;
import model.PemberianPakan;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PemberianPakanDAO {
    public boolean insertPemberianPakan(PemberianPakan pp) {
        String sql = "INSERT INTO PEMBERIANPAKAN (FeedingID, TanggalFeeding, Sesi, JumlahKg, BatchID, PakanID, KaryawanID) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, pp.getFeedingId());
            ps.setDate(2, pp.getTanggalFeeding());
            ps.setString(3, pp.getSesi());
            ps.setInt(4, pp.getJumlahKg());
            ps.setInt(5, pp.getBatchId());
            ps.setInt(6, pp.getPakanId());
            ps.setInt(7, pp.getKaryawanId());
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println("Error PemberianPakan: " + e.getMessage());
            return false;
        }
    }

    public List<PemberianPakan> getAllPemberianPakan() {
        List<PemberianPakan> list = new ArrayList<>();
        String sql = "SELECT * FROM PEMBERIANPAKAN";
        try (Connection conn = DBConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                list.add(new PemberianPakan(rs.getInt(1), rs.getDate(2), rs.getString(3), rs.getInt(4), rs.getInt(5), rs.getInt(6), rs.getInt(7)));
            }
        } catch (SQLException e) { System.out.println("Error: " + e.getMessage()); }
        return list;
    }
}