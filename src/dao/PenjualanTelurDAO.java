package dao;

import config.DBConnection;
import model.PenjualanTelur;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PenjualanTelurDAO {
    public boolean insertPenjualan(PenjualanTelur pt) {
        String sql = "INSERT INTO PENJUALANTELUR (PenjualanID, TanggalJual, TotalBerat, TotalHarga, KaryawanID, CustomerID) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, pt.getPenjualanId());
            ps.setDate(2, pt.getTanggalJual());
            ps.setDouble(3, pt.getTotalBerat());
            ps.setInt(4, pt.getTotalHarga());
            ps.setInt(5, pt.getKaryawanId());
            ps.setInt(6, pt.getCustomerId());
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println("Error PenjualanTelur: " + e.getMessage());
            return false;
        }
    }

    public List<PenjualanTelur> getAllPenjualan() {
        List<PenjualanTelur> list = new ArrayList<>();
        String sql = "SELECT * FROM PENJUALANTELUR";
        try (Connection conn = DBConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                list.add(new PenjualanTelur(rs.getInt(1), rs.getDate(2), rs.getDouble(3), rs.getInt(4), rs.getInt(5), rs.getInt(6)));
            }
        } catch (SQLException e) { System.out.println("Error: " + e.getMessage()); }
        return list;
    }
}