package config;

import io.github.cdimascio.dotenv.Dotenv;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static Connection conn;

    public static Connection getConnection() {
        if (conn == null) {
            try {
                // Memuat file .env yang ada di root folder
                Dotenv dotenv = Dotenv.load();
                
                // Mengambil nilai variabel dari .env
                String url = dotenv.get("DB_URL");
                String user = dotenv.get("DB_USER");
                String password = dotenv.get("DB_PASSWORD");

                // Mendaftarkan Driver SQL Server
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                
                // Membuat Koneksi
                conn = DriverManager.getConnection(url, user, password);
                System.out.println("-> [DB Connection] Sukses terhubung secara aman menggunakan .env");
                
            } catch (ClassNotFoundException e) {
                System.out.println("Driver SQL Server Tidak Ditemukan: " + e.getMessage());
            } catch (SQLException e) {
                System.out.println("Koneksi Database Gagal: " + e.getMessage());
            }
        }
        return conn;
    }
}