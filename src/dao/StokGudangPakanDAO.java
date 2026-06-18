package dao;

import config.DBConnection;
import model.StokGudangPakan;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StokGudangPakanDAO {
    public boolean insertStokPakan(StokGudangPakan sgp) {
        String sql = "INSERT INTO STOKGUDANGPAKAN (StokPakanID, JumlahStokKg, TanggalUpdate, TanggalKadaluarsa, FarmID, PakanID) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, sgp.getStokPakanId());
            ps.setInt(2, sgp.getJumlahStokKg());
            ps.setDate(3, sgp.getTanggalUpdate());
            
            // Mengatasi kolom tanggal kadaluarsa yang Nullable
            if (sgp.getTanggalKadaluarsa() != null) {
                ps.setDate(4, sgp.getTanggalKadaluarsa());
            } else {
                ps.setNull(4, Types.DATE);
            }
            
            ps.setInt(5, sgp.getFarmId());
            ps.setInt(6, sgp.getPakanId());
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println("Error StokGudangPakan: " + e.getMessage());
            return false;
        }
    }

    public List<StokGudangPakan> getAllStokPakan() {
        List<StokGudangPakan> list = new ArrayList<>();
        String sql = "SELECT * FROM STOKGUDANGPAKAN";
        try (Connection conn = DBConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                list.add(new StokGudangPakan(rs.getInt(1), rs.getInt(2), rs.getDate(3), rs.getDate(4), rs.getInt(5), rs.getInt(6)));
            }
        } catch (SQLException e) { System.out.println("Error: " + e.getMessage()); }
        return list;
    }
}