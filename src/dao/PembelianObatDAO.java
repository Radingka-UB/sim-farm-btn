package dao;

import config.DBConnection;
import model.PembelianObat;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PembelianObatDAO {
    public boolean insertPembelianObat(PembelianObat po) {
        String sql = "INSERT INTO PEMBELIANOBAT (PembelianObatID, TanggalBeli, JumlahStok, HargaTotal, FarmID, SupplierID) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, po.getPembelianObatId());
            ps.setDate(2, po.getTanggalBeli());
            ps.setInt(3, po.getJumlahStok());
            ps.setInt(4, po.getHargaTotal());
            ps.setInt(5, po.getFarmId());
            ps.setInt(6, po.getSupplierId());
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println("Error PembelianObat: " + e.getMessage());
            return false;
        }
    }

    public List<PembelianObat> getAllPembelianObat() {
        List<PembelianObat> list = new ArrayList<>();
        String sql = "SELECT * FROM PEMBELIANOBAT";
        try (Connection conn = DBConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                list.add(new PembelianObat(rs.getInt(1), rs.getDate(2), rs.getInt(3), rs.getInt(4), rs.getInt(5), rs.getInt(6)));
            }
        } catch (SQLException e) { System.out.println("Error: " + e.getMessage()); }
        return list;
    }
}