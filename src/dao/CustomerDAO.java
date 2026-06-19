package dao;

import config.DBConnection;
import model.Customer;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerDAO {
    public boolean insertCustomer(Customer cust) {
        String sql = "INSERT INTO CUSTOMER (CustomerID, NamaCustomer, TipeCustomer, Alamat, Telepon) VALUES (?, ?, ?, ?, ?)";
        
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            
            ps.setInt(1, cust.getCustomerId());
            ps.setString(2, cust.getNamaCustomer());
            ps.setString(3, cust.getTipeCustomer());
            ps.setString(4, cust.getAlamat());
            ps.setString(5, cust.getTelepon());
            
            int rowsInserted = ps.executeUpdate();
            return rowsInserted > 0; 
            
        } catch (SQLException e) {
            System.out.println("Error saat insert customer: " + e.getMessage());
            return false;
        }
    }

    public List<Customer> getAllCustomer() {
        List<Customer> listCustomer = new ArrayList<>();
        String sql = "SELECT * FROM CUSTOMER";
        
        try (Connection conn = DBConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            
            while (rs.next()) {
                Customer cust = new Customer(
                    rs.getInt("CustomerID"),
                    rs.getString("NamaCustomer"),
                    rs.getString("TipeCustomer"),
                    rs.getString("Alamat"),
                    rs.getString("Telepon")
                );
                listCustomer.add(cust);
            }
        } catch (SQLException e) {
            System.out.println("Error saat mengambil data customer: " + e.getMessage());
        }
        return listCustomer;
    }
}