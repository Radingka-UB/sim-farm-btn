package dao;

import config.DBConnection;
import model.Batch;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BatchDAO {

    public boolean insertBatch(Batch b) {
        String sql = "INSERT INTO BATCH (BatchID, KodeAyam, JenisAyam, TanggalMasuk, JumlahAyamAwal, PopulasiSekarang, StatusBatch, KandangID) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            
            ps.setInt(1, b.getBatchId());
            ps.setString(2, b.getKodeAyam());
            ps.setString(3, b.getJenisAyam());
            ps.setDate(4, b.getTanggalMasuk());
            ps.setInt(5, b.getJumlahAyamAwal());
            ps.setInt(6, b.getPopulasiSekarang());
            ps.setString(7, b.getStatusBatch());
            ps.setInt(8, b.getKandangId());
            
            return ps.executeUpdate() > 0;
            
        } catch (SQLException e) {
            System.out.println("Error Batch: " + e.getMessage());
            return false;
        }
    }

    public List<Batch> getAllBatch() {
        List<Batch> listBatch = new ArrayList<>();
        String sql = "SELECT * FROM BATCH";
        
        try (Connection conn = DBConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            
            while (rs.next()) {
                Batch b = new Batch(
                    rs.getInt(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getDate(4),
                    rs.getInt(5),
                    rs.getInt(6),
                    rs.getString(7),
                    rs.getInt(8)
                );
                listBatch.add(b);
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return listBatch;
    }
}