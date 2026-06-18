package dao;

import config.DBConnection;
import model.ManajerFarm;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ManajerFarmDAO {
    public boolean insertManajer(ManajerFarm mf) {
        String sql = "INSERT INTO MANAJERFARM (KaryawanID, GajiPokok, TanggalPengangkatan) VALUES (?, ?, ?)";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, mf.getKaryawanId());
            ps.setInt(2, mf.getGajiPokok());
            ps.setDate(3, mf.getTanggalPengangkatan());
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println("Error ManajerFarm: " + e.getMessage());
            return false;
        }
    }

    public List<ManajerFarm> getAllManajer() {
        List<ManajerFarm> list = new ArrayList<>();
        String sql = "SELECT * FROM MANAJERFARM";
        try (Connection conn = DBConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                list.add(new ManajerFarm(rs.getInt(1), rs.getInt(2), rs.getDate(3)));
            }
        } catch (SQLException e) { System.out.println("Error: " + e.getMessage()); }
        return list;
    }
}