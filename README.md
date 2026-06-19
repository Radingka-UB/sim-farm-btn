# 🌾 SIM-FARM BTN - Modul Panen Telur

Sebuah sistem simulasi pertanian yang komprehensif dibangun dengan Java. Aplikasi ini dibuat dengan Graphic User Interface yang menyediakan antarmuka manajemen pertanian yang interaktif dengan backend database SQL Server yang kuat untuk menangani operasi pertanian, manajemen tanaman, dan pelacakan sumber daya.  

## 👥 Tim Pengembang
 
Proyek ini merupakan hasil kerja sama dari mahasiswa mata kuliah Basis Data kelompok 7 kelas TIF-B dalam mengembangkan sistem simulasi pertanian yang fungsional dan user-friendly.  

1. Radingka Rocha Arfian [255150200111014]
2. Alfath Musa Damanhuri [255150207111032]
3. Bilhaq Zouvary Brahmantya Jatmiko [255150200111020]
4. Muhammad Syafiq Sukma Al Barraq [255150207111030]
5. Muhammad Raziq Syuhada [245150200111019]

## 🛠️ Teknologi yang Digunakan
 
- **Java**
- **JDBC (Java Database Connectivity)**
- **Microsoft SQL Server**
- **Swing (GUI Framework)**
- **Arsitektur MVC**
- **Konfigurasi .env**

## 📋 Fitur-Fitur Utama
 
- Simulasi manajemen pertanian lengkap dengan dashboard interaktif
- Sistem pelacakan dan manajemen siklus hidup batch ayam
- Manajemen alokasi sumber daya dan inventaris
- Persistensi data real-time dengan database SQL Server
- Antarmuka desktop yang user-friendly menggunakan komponen Swing
- Skema database relasional untuk operasional kandang yang kompleks
- Implementasi pola DAO (Data Access Object) yang modular
- Sistem konfigurasi berbasis environment untuk fleksibilitas maksimal

## 📖 Proses Pengembangan
 
Kami membangun proyek simulasi pertanian ini dengan tujuan menciptakan sistem manajemen peternakan yang praktis dan aplikatif. Aplikasi ini menampilkan arsitektur MVC lengkap dengan lapisan terpisah untuk model, tampilan, dan akses data. Sistem terhubung dengan database Microsoft SQL Server yang mengelola semua operasi peternakan, data batch ayam, dan pelacakan sumber daya. Antarmuka memberikan cara yang intuitif untuk berinteraksi dengan simulasi peternakan, memungkinkan pengguna untuk mengelola kandang, melacak sumber daya, dan memantau operasi peternakan secara real-time. Proyek ini mendemonstrasikan desain database yang tepat dengan skema relasional dan praktik manajemen data yang komprehensif.

## 📜 Prasyarat

Pastikan komponen berikut sudah terinstal di perangkat Anda sebelum menjalankan aplikasi:

* **JDK 11+** (Java Development Kit)
* **SQL Server** (Konfigurasi: Port `1433` & SQL Server Authentication aktif)
* **Database Client** (SSMS / DBeaver / Dadbod UI / VS Code Extension)
* **Java IDE** (VS Code / IntelliJ IDEA / NetBeans)

## 🚀 Cara Menjalankan Proyek  

1. **Clone Repository**
```
   git clone https://github.com/Radingka-UB/sim-farm-btn.git
   cd sim-farm-btn
```  
2. **Setup Basis Data**
- Buka Database Management Tools Anda, lalu jalankan skrip skema struktur basis data dari file `SIM_FARM_BTN_ddl.sql` yang berada pada direktori `basisdata/ddl`.
- Ubah isi file `.env` sesuai dengan konfigurasi SQL Server di perangkat Anda:
```
DB_URL=jdbc:sqlserver://localhost:1433;databaseName=SIM_FARM_BTN;encrypt=false;
DB_USER=username_sql_server_anda
DB_PASSWORD=password_sql_server_anda
```
3. **Compile dan Jalankan**
- Jalankan Run.sh untuk pengguna MacOS/Linux
- Jalankan Run.exe untuk pengguna Windows

## 📸 Preview Aplikasi  
