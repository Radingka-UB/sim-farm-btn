package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    // FORMAT URL KETAT: Memutus total hubungan dengan Windows Authentication (Integrated Security)
    private static final String URL = "jdbc:sqlserver://localhost:1433;"
            + "databaseName=SIM_FARM_BTN;"
            + "encrypt=false;"
            + "trustServerCertificate=true;"
            + "integratedSecurity=false;" // Wajib ada untuk mematikan Windows Auth
            + "authentication=NotSpecified;"; // Memaksa driver menggunakan username & password murni

    private static final String USER = "sa";          // <-- Isikan user SQL Servermu langsung di sini
    private static final String PASSWORD = "t3sl4b3s4r"; // <-- Isikan password SQL Servermu langsung di sini

    public static Connection getConnection() throws SQLException {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            // KUNCI UTAMA: Kirim variabel USER dan PASSWORD secara terpisah di method ini
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException e) {
            throw new SQLException("Driver JDBC SQL Server tidak ditemukan!", e);
        }
    }
}