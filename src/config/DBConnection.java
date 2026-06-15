package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    // URL dasar SQL Server lokal. Sesuaikan properti jika ada perubahan nanti.
    private static final String URL = "jdbc:sqlserver://localhost;databaseName=SIM_FARM_BTN;encrypt=false;integratedSecurity=true;";
    private static Connection connection = null;

    public static Connection getConnection() throws SQLException {
        if (connection == null || connection.isClosed()) {
            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                connection = DriverManager.getConnection(URL);
            } catch (ClassNotFoundException e) {
                throw new SQLException("Driver JDBC SQL Server tidak ditemukan!", e);
            }
        }
        return connection;
    }
    
    // Fungsi pembantu untuk menutup koneksi dengan aman
    public static void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                System.err.println("Gagal menutup koneksi: " + e.getMessage());
            }
        }
    }
}