package dao;

import config.DBConnection;
import model.Pakan;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PakanDAO {

    public boolean insertPakan(Pakan pakan) {
        String sql = "INSERT INTO PAKAN (PakanID, NamaPakan, Merek, JenisPakan, HargaPerKg) VALUES (?, ?, ?, ?, ?)";
        
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            
            ps.setInt(1, pakan.getPakanId());
            ps.setString(2, pakan.getNamaPakan());
            ps.setString(3, pakan.getMerek());
            ps.setString(4, pakan.getJenisPakan());
            ps.setInt(5, pakan.getHargaPerKg());
            
            return ps.executeUpdate() > 0;
            
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }
    }

    public List<Pakan> getAllPakan() {
        List<Pakan> listPakan = new ArrayList<>();
        String sql = "SELECT * FROM PAKAN";
        
        try (Connection conn = DBConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            
            while (rs.next()) {
                Pakan pakan = new Pakan(
                    rs.getInt(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getInt(5)
                );
                listPakan.add(pakan);
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return listPakan;
    }
}