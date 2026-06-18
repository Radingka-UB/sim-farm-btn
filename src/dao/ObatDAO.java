package dao;

import config.DBConnection;
import model.Obat;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ObatDAO {

    public boolean insertObat(Obat obat) {
        String sql = "INSERT INTO OBAT (ObatID, NamaObat, JenisObat, Satuan) VALUES (?, ?, ?, ?)";
        
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            
            ps.setInt(1, obat.getObatId());
            ps.setString(2, obat.getNamaObat());
            ps.setString(3, obat.getJenisObat());
            ps.setString(4, obat.getSatuan());
            
            return ps.executeUpdate() > 0;
            
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }
    }

    public List<Obat> getAllObat() {
        List<Obat> listObat = new ArrayList<>();
        String sql = "SELECT * FROM OBAT";
        
        try (Connection conn = DBConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            
            while (rs.next()) {
                Obat obat = new Obat(
                    rs.getInt(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4)
                );
                listObat.add(obat);
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return listObat;
    }
}