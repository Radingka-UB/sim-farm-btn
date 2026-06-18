package dao;

import config.DBConnection;
import model.Supplier;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SupplierDAO {

    public boolean insertSupplier(Supplier sup) {
        String sql = "INSERT INTO SUPPLIER (SupplierID, NamaSupplier, Alamat, Telepon, Email) VALUES (?, ?, ?, ?, ?)";
        
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            
            ps.setInt(1, sup.getSupplierId());
            ps.setString(2, sup.getNamaSupplier());
            ps.setString(3, sup.getAlamat());
            ps.setString(4, sup.getTelepon());
            ps.setString(5, sup.getEmail());
            
            return ps.executeUpdate() > 0;
            
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }
    }

    public List<Supplier> getAllSupplier() {
        List<Supplier> listSupplier = new ArrayList<>();
        String sql = "SELECT * FROM SUPPLIER";
        
        try (Connection conn = DBConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            
            while (rs.next()) {
                Supplier sup = new Supplier(
                    rs.getInt(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5)
                );
                listSupplier.add(sup);
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return listSupplier;
    }
}