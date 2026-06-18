package dao;

import config.DBConnection;
import model.Kandang;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class KandangDAO {

    public boolean insertKandang(Kandang kd) {
        String sql = "INSERT INTO KANDANG (KandangID, NamaKandang, KapasitasMaksimal, StatusKandang, TipeKandang, FarmID) VALUES (?, ?, ?, ?, ?, ?)";
        
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            
            ps.setInt(1, kd.getKandangId());
            ps.setString(2, kd.getNamaKandang());
            ps.setInt(3, kd.getKapasitasMaksimal());
            ps.setString(4, kd.getStatusKandang());
            ps.setString(5, kd.getTipeKandang());
            ps.setInt(6, kd.getFarmId());
            
            return ps.executeUpdate() > 0;
            
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }
    }

    public List<Kandang> getAllKandang() {
        List<Kandang> listKandang = new ArrayList<>();
        String sql = "SELECT * FROM KANDANG";
        
        try (Connection conn = DBConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            
            while (rs.next()) {
                Kandang kd = new Kandang(
                    rs.getInt(1),
                    rs.getString(2),
                    rs.getInt(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getInt(6)
                );
                listKandang.add(kd);
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return listKandang;
    }
}