package dao;

import config.DBConnection;
import model.Customer;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerDAO {

    public boolean insert(Customer cust) {
        // Tulis kerangka query berdasarkan draf kasar. Jika besok temanmu 
        // mengubah nama tabel/kolom di DDL, kamu CUMA perlu edit string di bawah ini!
        String sql = "INSERT INTO Customer (CustomerID, NamaCustomer, TipeCustomer, Alamat, Telepon) VALUES (?, ?, ?, ?, ?)";
        
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            
            ps.setInt(1, cust.getCustomerId());
            ps.setString(2, cust.getNamaCustomer());
            ps.setString(3, cust.getTipeCustomer());
            ps.setString(4, cust.getAlamat());
            ps.setString(5, cust.getTelepon());
            
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            System.err.println("Error saat INSERT: " + e.getMessage());
            return false;
        }
    }

    public List<Customer> getAll() {
        List<Customer> list = new ArrayList<>();
        String sql = "SELECT * FROM Customer";
        
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            
            while (rs.next()) {
                Customer c = new Customer();
                // Antisipasi pemetaan kolom database ke objek Java
                c.setCustomerId(rs.getInt("CustomerID"));
                c.setNamaCustomer(rs.getString("NamaCustomer"));
                c.setTipeCustomer(rs.getString("TipeCustomer"));
                c.setAlamat(rs.getString("Alamat"));
                c.setTelepon(rs.getString("Telepon"));
                list.add(c);
            }
        } catch (SQLException e) {
            System.err.println("Error saat SELECT ALL: " + e.getMessage());
        }
        return list;
    }

    public boolean update(Customer cust) {
        String sql = "UPDATE Customer SET NamaCustomer = ?, TipeCustomer = ?, Alamat = ?, Telepon = ? WHERE CustomerID = ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            
            ps.setString(1, cust.getNamaCustomer());
            ps.setString(2, cust.getTipeCustomer());
            ps.setString(3, cust.getAlamat());
            ps.setString(4, cust.getTelepon());
            ps.setInt(5, cust.getCustomerId());
            
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            System.err.println("Error saat UPDATE: " + e.getMessage());
            return false;
        }
    }

    public boolean delete(int id) {
        String sql = "DELETE FROM Customer WHERE CustomerID = ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            
            ps.setInt(1, id);
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            System.err.println("Error saat DELETE: " + e.getMessage());
            return false;
        }
    }
}