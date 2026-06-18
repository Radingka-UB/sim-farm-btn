package dao;

import config.DBConnection;
import model.Farm;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class FarmDAO {

    public boolean insertFarm(Farm f) {
        String sql = "INSERT INTO FARM (FarmID, NamaFarm, Alamat, TeleponFarm) VALUES (?, ?, ?, ?)";
        
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            
            ps.setInt(1, f.getFarmId());
            ps.setString(2, f.getNamaFarm());
            ps.setString(3, f.getAlamat());
            ps.setString(4, f.getTeleponFarm());
            
            return ps.executeUpdate() > 0;
            
        } catch (SQLException e) {
            System.out.println("Error Farm: " + e.getMessage());
            return false;
        }
    }

    public List<Farm> getAllFarm() {
        List<Farm> listFarm = new ArrayList<>();
        String sql = "SELECT * FROM FARM";
        
        try (Connection conn = DBConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            
            while (rs.next()) {
                Farm f = new Farm(
                    rs.getInt(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4)
                );
                listFarm.add(f);
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return listFarm;
    }
}