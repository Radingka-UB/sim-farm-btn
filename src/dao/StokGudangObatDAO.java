package dao;

import config.DBConnection;
import model.StokGudangObat;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StokGudangObatDAO {
    public boolean insertStokObat(StokGudangObat sgo) {
        String sql = "INSERT INTO STOKGUDANGOBAT (StokObatID, JumlahStok, TanggalUpdate, ObatID, FarmID) VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, sgo.getStokObatId());
            ps.setInt(2, sgo.getJumlahStok());
            ps.setDate(3, sgo.getTanggalUpdate());
            ps.setInt(4, sgo.getObatId());
            ps.setInt(5, sgo.getFarmId());
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println("Error StokGudangObat: " + e.getMessage());
            return false;
        }
    }

    public List<StokGudangObat> getAllStokObat() {
        List<StokGudangObat> list = new ArrayList<>();
        String sql = "SELECT * FROM STOKGUDANGOBAT";
        try (Connection conn = DBConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                list.add(new StokGudangObat(rs.getInt(1), rs.getInt(2), rs.getDate(3), rs.getInt(4), rs.getInt(5)));
            }
        } catch (SQLException e) { System.out.println("Error: " + e.getMessage()); }
        return list;
    }
}