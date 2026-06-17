package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static final String URL = "jdbc:sqlserver://localhost:1433;"
            + "databaseName=SIM_FARM_BTN;"
            + "encrypt=false;"
            + "trustServerCertificate=true;"
            + "integratedSecurity=false;"
            + "authentication=NotSpecified;";

    // Mengambil data dari environment variable laptop masing-masing
    private static final String USER = System.getenv("DB_USER") != null ? System.getenv("DB_USER") : "sa";
    private static final String PASSWORD = System.getenv("DB_PASSWORD") != null ? System.getenv("DB_PASSWORD") : "default_pass";

    public static Connection getConnection() throws SQLException {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException e) {
            throw new SQLException("Driver JDBC SQL Server tidak ditemukan!", e);
        }
    }
}