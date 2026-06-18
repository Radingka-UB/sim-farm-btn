# sim-farm-btn
Kelompok 7 Basis Data:  
1. Radingka Rocha Arfian [255150200111014]
2. Alfath Musa Damanhuri [255150207111032]
3. Bilhaq Zouvary Brahmantya Jatmiko [255150200111020]
4. Muhammad Syafiq Sukma Al Barraq [255150207111030]
5. Muhammad Raziq Syuhada [245150200111019]

# 🌾 SIM-FARM BTN - Modul Panen Telur (Java Swing + SQL Server)

Tugas Kelompok Pengembangan Aplikasi Sistem Informasi Manajemen Peternakan Ayam.

## Prasyarat (Prerequisites)
Sebelum menjalankan aplikasi, pastikan perangkat Anda sudah terpasang:
1. **Java Development Kit (JDK)** versi 11 atau yang lebih baru.
2. **SQL Server & SQL Server Management Studio (SSMS)**.
3. IDE pilihan (**VS Code** / **NetBeans** / **IntelliJ IDEA**).

## Langkah 1: Pengaturan Database
1. Buka SSMS, lalu buat database baru bernama `SIM_FARM_BTN`.
2. Buka dan jalankan (Execute) script skema struktur tabel dan data master yang berada di dalam folder proyek:
   `database_setup.sql`
3. Pastikan SQL Server Anda mengizinkan koneksi melalui **SQL Server Authentication** (Port 1433).

## Langkah 2: Pengaturan Environment Variables (.env)
Aplikasi ini menggunakan `dotenv-java` untuk mengamankan kredensial database.
1. Di root folder proyek, buatlah sebuah file baru bernama `.env` (atau salin dari `.env.example`).
2. Ubah isi di dalamnya sesuai dengan konfigurasi SQL Server di laptop Anda:

```env
DB_URL=jdbc:sqlserver://localhost:1433;databaseName=SIM_FARM_BTN;encrypt=false;
DB_USER=username_sql_server_anda
DB_PASSWORD=password_sql_server_anda