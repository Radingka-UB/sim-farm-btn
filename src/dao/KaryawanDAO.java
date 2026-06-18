package dao;

import config.DBConnection;
import model.Karyawan;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class KaryawanDAO {

    public boolean insertKaryawan(Karyawan kr) {
        String sql = "INSERT INTO KARYAWAN (KaryawanID, Nama, NIK, TanggalLahir, Alamat, Telepon, JenisKelamin, TanggalMasuk, TipeKaryawan, FarmID) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            
            ps.setInt(1, kr.getKaryawanId());
            ps.setString(2, kr.getNama());
            ps.setString(3, kr.getNik());
            ps.setDate(4, kr.getTanggalLahir());
            ps.setString(5, kr.getAlamat());
            ps.setString(6, kr.getTelepon());
            ps.setString(7, kr.getJenisKelamin());
            ps.setDate(8, kr.getTanggalMasuk());
            ps.setString(9, kr.getTipeKaryawan());
            ps.setInt(10, kr.getFarmId());
            
            return ps.executeUpdate() > 0;
            
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }
    }

    public List<Karyawan> getAllKaryawan() {
        List<Karyawan> listKaryawan = new ArrayList<>();
        String sql = "SELECT * FROM KARYAWAN";
        
        try (Connection conn = DBConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            
            while (rs.next()) {
                Karyawan kr = new Karyawan(
                    rs.getInt(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getDate(4),
                    rs.getString(5),
                    rs.getString(6),
                    rs.getString(7),
                    rs.getDate(8),
                    rs.getString(9),
                    rs.getInt(10)
                );
                listKaryawan.add(kr);
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return listKaryawan;
    }
}