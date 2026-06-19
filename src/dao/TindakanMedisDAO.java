package dao;

import config.DBConnection;
import model.TindakanMedis;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TindakanMedisDAO {
    public boolean insertTindakanMedis(TindakanMedis tm) {
        String sql = "INSERT INTO TINDAKANMEDIS (MedisID, TanggalTindakan, JenisTindakan, DosisAktual, Keterangan, BatchID, ObatID, DokterID) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, tm.getMedisId());
            ps.setDate(2, tm.getTanggalTindakan());
            ps.setString(3, tm.getJenisTindakan());
            ps.setInt(4, tm.getDosisAktual());
            ps.setString(5, tm.getKeterangan()); 
            ps.setInt(6, tm.getBatchId());
            ps.setInt(7, tm.getObatId());
            ps.setInt(8, tm.getDokterId());
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println("Error TindakanMedis: " + e.getMessage());
            return false;
        }
    }

    public List<TindakanMedis> getAllTindakanMedis() {
        List<TindakanMedis> list = new ArrayList<>();
        String sql = "SELECT * FROM TINDAKANMEDIS";
        try (Connection conn = DBConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                list.add(new TindakanMedis(rs.getInt(1), rs.getDate(2), rs.getString(3), rs.getInt(4), rs.getString(5), rs.getInt(6), rs.getInt(7), rs.getInt(8)));
            }
        } catch (SQLException e) { System.out.println("Error: " + e.getMessage()); }
        return list;
    }
}