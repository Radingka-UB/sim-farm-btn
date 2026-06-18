package config;

import io.github.cdimascio.dotenv.Dotenv;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static Connection conn;

    public static Connection getConnection() {
        try {
            if (conn == null || conn.isClosed()) {
                Dotenv dotenv = Dotenv.load();
                String url = dotenv.get("DB_URL");
                String user = dotenv.get("DB_USER");
                String password = dotenv.get("DB_PASSWORD");

                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                conn = DriverManager.getConnection(url, user, password);
                System.out.println("-> [DB Connection] Koneksi Baru/Segar Berhasil Dibuka via .env");
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Driver SQL Server Tidak Ditemukan: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Koneksi Database Gagal: " + e.getMessage());
        }
        return conn;
    }
}