package dao;

import config.DBConnection;
import model.PembelianPakan;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PembelianPakanDAO {
    public boolean insertPembelianPakan(PembelianPakan pp) {
        String sql = "INSERT INTO PEMBELIANPAKAN (PembelianID, TanggalBeli, JumlahKg, HargaTotal, SupplierID, PakanID, FarmID) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, pp.getPembelianId());
            ps.setDate(2, pp.getTanggalBeli());
            ps.setInt(3, pp.getJumlahKg());
            ps.setInt(4, pp.getHargaTotal());
            ps.setInt(5, pp.getSupplierId());
            ps.setInt(6, pp.getPakanId());
            ps.setInt(7, pp.getFarmId());
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println("Error PembelianPakan: " + e.getMessage());
            return false;
        }
    }

    public List<PembelianPakan> getAllPembelianPakan() {
        List<PembelianPakan> list = new ArrayList<>();
        String sql = "SELECT * FROM PEMBELIANPAKAN";
        try (Connection conn = DBConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                list.add(new PembelianPakan(rs.getInt(1), rs.getDate(2), rs.getInt(3), rs.getInt(4), rs.getInt(5), rs.getInt(6), rs.getInt(7)));
            }
        } catch (SQLException e) { System.out.println("Error: " + e.getMessage()); }
        return list;
    }
}