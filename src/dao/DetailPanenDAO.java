package dao;

import config.DBConnection;
import model.DetailPanen;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DetailPanenDAO {

    public boolean insertDetailPanen(DetailPanen dp) {
        String sql = "INSERT INTO DETAILPANEN (DetailPanenID, GradeTelur, JumlahButir, BeratKg, PanenID) VALUES (?, ?, ?, ?, ?)";
        
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            
            ps.setInt(1, dp.getDetailPanenId());
            ps.setString(2, dp.getGradeTelur());
            ps.setInt(3, dp.getJumlahButir());
            ps.setDouble(4, dp.getBeratKg());
            ps.setInt(5, dp.getPanenId());
            
            return ps.executeUpdate() > 0;
            
        } catch (SQLException e) {
            System.out.println("Error Detail Panen: " + e.getMessage());
            return false;
        }
    }

    public List<DetailPanen> getAllDetailPanen() {
        List<DetailPanen> listDetail = new ArrayList<>();
        String sql = "SELECT * FROM DETAILPANEN";
        
        try (Connection conn = DBConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            
            while (rs.next()) {
                DetailPanen dp = new DetailPanen(
                    rs.getInt(1),
                    rs.getString(2),
                    rs.getInt(3),
                    rs.getDouble(4),
                    rs.getInt(5)
                );
                listDetail.add(dp);
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return listDetail;
    }
    // Tambahkan ini di dalam kelas DetailPanenDAO
    public boolean updateDetailPanen(DetailPanen dp) {
        String sql = "UPDATE DETAILPANEN SET GradeTelur = ?, JumlahButir = ?, BeratKg = ?, PanenID = ? WHERE DetailPanenID = ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, dp.getGradeTelur());
            ps.setInt(2, dp.getJumlahButir());
            ps.setDouble(3, dp.getBeratKg());
            ps.setInt(4, dp.getPanenId());
            ps.setInt(5, dp.getDetailPanenId());
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println("Error Update Detail Panen: " + e.getMessage());
            return false;
        }
    }

    public boolean deleteDetailPanen(int detailPanenId) {
        String sql = "DELETE FROM DETAILPANEN WHERE DetailPanenID = ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, detailPanenId);
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println("Error Delete Detail Panen: " + e.getMessage());
            return false;
        }
    }
}