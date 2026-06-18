package dao;

import config.DBConnection;
import model.DetailPenjualan;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DetailPenjualanDAO {

    public boolean insertDetailPenjualan(DetailPenjualan dp) {
        String sql = "INSERT INTO DETAILPENJUALAN (DetailID, GradeTelur, JumlahButir, BeratKg, HargaPerKg, BatchID, PenjualanID) VALUES (?, ?, ?, ?, ?, ?, ?)";
        
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            
            ps.setInt(1, dp.getDetailId());
            ps.setString(2, dp.getGradeTelur());
            ps.setInt(3, dp.getJumlahButir());
            ps.setDouble(4, dp.getBeratKg());
            ps.setInt(5, dp.getHargaPerKg());
            ps.setInt(6, dp.getBatchId());
            ps.setInt(7, dp.getPenjualanId());
            
            return ps.executeUpdate() > 0;
            
        } catch (SQLException e) {
            System.out.println("Error Detail Penjualan: " + e.getMessage());
            return false;
        }
    }

    public List<DetailPenjualan> getAllDetailPenjualan() {
        List<DetailPenjualan> listDetail = new ArrayList<>();
        String sql = "SELECT * FROM DETAILPENJUALAN";
        
        try (Connection conn = DBConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            
            while (rs.next()) {
                DetailPenjualan dp = new DetailPenjualan(
                    rs.getInt(1),
                    rs.getString(2),
                    rs.getInt(3),
                    rs.getDouble(4),
                    rs.getInt(5),
                    rs.getInt(6),
                    rs.getInt(7)
                );
                listDetail.add(dp);
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return listDetail;
    }
}