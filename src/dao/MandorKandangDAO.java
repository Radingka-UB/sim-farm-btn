package dao;

import config.DBConnection;
import model.MandorKandang;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MandorKandangDAO {
    public boolean insertMandor(MandorKandang mk) {
        String sql = "INSERT INTO MANDORKANDANG (KaryawanID, GajiPokok) VALUES (?, ?)";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, mk.getKaryawanId());
            ps.setInt(2, mk.getGajiPokok());
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println("Error MandorKandang: " + e.getMessage());
            return false;
        }
    }

    public List<MandorKandang> getAllMandor() {
        List<MandorKandang> list = new ArrayList<>();
        String sql = "SELECT * FROM MANDORKANDANG";
        try (Connection conn = DBConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                list.add(new MandorKandang(rs.getInt(1), rs.getInt(2)));
            }
        } catch (SQLException e) { System.out.println("Error: " + e.getMessage()); }
        return list;
    }
}