# 🌾 SIM-FARM BTN - Modul Panen 

Sebuah sistem simulasi pertanian yang komprehensif dibangun dengan Java. Aplikasi ini dibuat dengan Graphic User Interface yang menyediakan antarmuka manajemen pertanian yang interaktif dengan backend database SQL Server yang kuat untuk menangani operasi pertanian, manajemen tanaman, dan pelacakan sumber daya.  

## 👥 Tim Pengembang
 
Proyek ini merupakan hasil kerja sama dari mahasiswa mata kuliah Basis Data kelompok 7 kelas TIF-B dalam mengembangkan sistem simulasi pertanian yang fungsional dan user-friendly.  

| Anggota               | NIM                |
| ------------------------- | ------------------- |
| **Radingka Rocha Arfian**               | 255150200111014     |
| **Alfath Musa Damanhuri**        | 255150207111032  |
| **Bilhaq Zouvary Brahmantya Jatmiko**    | 255150200111020   |
| **Muhammad Syafiq Sukma Al Barraq**         | 255150207111030        |
| **Muhammad Raziq Syuhada**      | 245150200111019      |

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
- Jalankan Run.bat untuk pengguna Windows

## 📕 Petunjuk Penggunaan

- Tombol `Tambah` menambah baris data tabel PanenTelur berdasarkan kotak input aplikasi
- Tombol `Ubah` mengubah nilai data tabel PanenTelur pada baris data yang dipilih pada tabel aplikasi
- Tombol `Hapus` menghapus baris data tabel PanenTelur yang dipilih pada tabel aplikasi
- Tombol `Clear` mengosongkan kotak input aplikasi 

## 🖥️ Preview Aplikasi  
<img width="1280" height="720" alt="Image" src="https://github.com/user-attachments/assets/27091ed3-4785-48cb-b758-75a7f886524a" />  

## 📂 Struktur Proyek

```
.
├── 📁 basisdata
│   ├── 📁 ddl
│   │   ├── 📄 Batch_ddl.sql
│   │   ├── 📄 Customer_ddl.sql
│   │   ├── 📄 DetailPanen_ddl.sql
│   │   ├── 📄 DetailPenjualan_ddl.sql
│   │   ├── 📄 DokterHewan_ddl.sql
│   │   ├── 📄 Farm_ddl.sql
│   │   ├── 📄 Kandang_ddl.sql
│   │   ├── 📄 KandangTanggungJawab_ddl.sql
│   │   ├── 📄 Karyawan_ddl.sql
│   │   ├── 📄 KematianAyam_ddl.sql
│   │   ├── 📄 makedb_ddl.sql
│   │   ├── 📄 ManajerFarm_ddl.sql
│   │   ├── 📄 MandorKandang_ddl.sql
│   │   ├── 📄 Obat_ddl.sql
│   │   ├── 📄 Pakan_ddl.sql
│   │   ├── 📄 PanenTelur_ddl.sql
│   │   ├── 📄 PekerjaHarian_ddl.sql
│   │   ├── 📄 PembelianObat.sql
│   │   ├── 📄 PembelianPakan_ddl.sql
│   │   ├── 📄 PemberianPakan_ddl.sql
│   │   ├── 📄 PenjualanTelur_ddl.sql
│   │   ├── 📄 SIM_FARM_BTN_ddl.sql
│   │   ├── 📄 StokGudangObat_ddl.sql
│   │   ├── 📄 StokGudangPakan_ddl.sql
│   │   ├── 📄 Supplier_ddl.sql
│   │   └── 📄 TindakanMedis_ddl.sql
│   ├── 📁 dml
│   │   ├── 📄 Batch_dml.sql
│   │   ├── 📄 Customer_dml.sql
│   │   ├── 📄 DetailPanen_dml.sql
│   │   ├── 📄 DetailPenjualan_dml.sql
│   │   ├── 📄 DokterHewan_dml.sql
│   │   ├── 📄 Farm_dml.sql
│   │   ├── 📄 Kandang_dml.sql
│   │   ├── 📄 KandangTanggungJawab_dml.sql
│   │   ├── 📄 Karyawan_dml.sql
│   │   ├── 📄 KematianAyam_dml.sql
│   │   ├── 📄 ManajerFarm_dml.sql
│   │   ├── 📄 MandorKandang_dml.sql
│   │   ├── 📄 Obat_dml.sql
│   │   ├── 📄 Pakan_dml.sql
│   │   ├── 📄 PanenTelur_dml.sql
│   │   ├── 📄 PekerjaHarian_dml.sql
│   │   ├── 📄 PembelianObat_dml.sql
│   │   ├── 📄 PembelianPakan_dml.sql
│   │   ├── 📄 PemberianPakan_dml.sql
│   │   ├── 📄 PenjualanTelur_dml.sql
│   │   ├── 📄 SIM_FARM_BTN_dml.sql
│   │   ├── 📄 StokGudangObat_dml.sql
│   │   ├── 📄 StokGudangPakan_dml.sql
│   │   ├── 📄 Supplier_dml.sql
│   │   └── 📄 TindakanMedis_dml.sql
│   ├── 📄 erdd1.png
│   ├── 📄 Relational Schema.png
│   └── 📁 T-SQL
│       ├── 📁 Tugas 1
│       │   ├── 📄 DML Query 1.sql
│       │   ├── 📄 DML Query 2.sql
│       │   ├── 📄 DML Query 3.sql
│       │   ├── 📄 DML Query 4.sql
│       │   └── 📄 DML Query 5.sql
│       ├── 📁 Tugas 2
│       │   └── 📄 Laporan_Pivoting.sql
│       ├── 📁 Tugas 3
│       │   └── 📄 Stored_Procedure.sql
│       ├── 📁 Tugas 4
│       │   └── 📄 Trigger.sql
│       └── 📁 Tugas 5
│           └── 📄 udf.sql
├── 📁 bin
│   └── 📄 .gitkeep
├── 📄 .env
├── 📄 .git
│   ├── 📁 branches
│   ├── 📁 COMMIT_EDITMSG
│   ├── 📁 config
│   ├── 📁 description
│   ├── 📁 FETCH_HEAD
│   ├── 📁 HEAD
│   ├── 📁 hooks
│   │   ├── 📄 applypatch-msg.sample
│   │   ├── 📄 commit-msg.sample
│   │   ├── 📄 fsmonitor-watchman.sample
│   │   ├── 📄 post-update.sample
│   │   ├── 📄 pre-applypatch.sample
│   │   ├── 📄 pre-commit.sample
│   │   ├── 📄 pre-merge-commit.sample
│   │   ├── 📄 prepare-commit-msg.sample
│   │   ├── 📄 pre-push.sample
│   │   ├── 📄 pre-rebase.sample
│   │   ├── 📄 pre-receive.sample
│   │   ├── 📄 push-to-checkout.sample
│   │   ├── 📄 sendemail-validate.sample
│   │   └── 📄 update.sample
│   ├── 📁 index
│   ├── 📁 info
│   │   └── 📁 exclude
│   ├── 📁 logs
│   │   ├── 📁 HEAD
│   │   └── 📁 refs
│   │       ├── 📁 heads
│   │       │   └── 📁 main
│   │       └── 📁 remotes
│   │           └── 📁 origin
│   │               ├── 📁 HEAD
│   │               └── 📁 main
│   ├── 📁 objects
│   │   ├── 📁 55
│   │   │   └── 📁 c932824222bd93227ef74fd33050c9ec792ceb
│   │   ├── 📁 5e
│   │   │   └── 📁 295d5750cfc0f57754f72da3b96edda5649363
│   │   ├── 📁 79
│   │   │   └── 📁 6dc683183ca119a44503167eea61e21602f939
│   │   ├── 📁 8c
│   │   │   └── 📁 93c36d3475dd86cdbfbf224bc234e9841f2ee4
│   │   ├── 📁 b4
│   │   │   └── 📁 b628f73eb51e4683b67bfd6d4de96b3e967e76
│   │   ├── 📁 b8
│   │   │   └── 📁 44ed2547811c6e72fb263afd8eb087816a21ff
│   │   ├── 📁 db
│   │   │   └── 📁 e88d0631752663a5025b38a41cdbaf3f8c7c5f
│   │   ├── 📁 f3
│   │   │   └── 📁 6eebce330216c379200124ec49cbfcb8311ad2
│   │   ├── 📁 fc
│   │   │   └── 📁 e61f0ef76dde6445722724a8efa345c7c38d76
│   │   ├── 📁 info
│   │   └── 📁 pack
│   │       ├── 📄 pack-dd3ab63ca0997458805df470dec69f85e01c9b4d.idx
│   │       ├── 📄 pack-dd3ab63ca0997458805df470dec69f85e01c9b4d.pack
│   │       └── 📄 pack-dd3ab63ca0997458805df470dec69f85e01c9b4d.rev
│   ├── 📁 ORIG_HEAD
│   ├── 📁 packed-refs
│   └── 📁 refs
│       ├── 📁 heads
│       │   └── 📁 main
│       ├── 📁 remotes
│       │   └── 📁 origin
│       │       ├── 📁 HEAD
│       │       └── 📁 main
│       └── 📁 tags
├── 📄 .gitignore
├── 📁 lib
│   ├── 📄 dotenv-java-3.0.0.jar
│   └── 📄 mssql-jdbc-13.4.0.jre11.jar
├── 📁 LICENSE
├── 📄 README.md
├── 📄 Run.bat
├── 📄 Run.sh
├── 📁 src
│   ├── 📁 config
│   │   └── 📄 DBConnection.java
│   ├── 📁 dao
│   │   ├── 📄 BatchDAO.java
│   │   ├── 📄 CustomerDAO.java
│   │   ├── 📄 DetailPanenDAO.java
│   │   ├── 📄 DetailPenjualanDAO.java
│   │   ├── 📄 DokterHewanDAO.java
│   │   ├── 📄 FarmDAO.java
│   │   ├── 📄 KandangDAO.java
│   │   ├── 📄 KandangTanggungJawabDAO.java
│   │   ├── 📄 KaryawanDAO.java
│   │   ├── 📄 KematianAyamDAO.java
│   │   ├── 📄 ManajerFarmDAO.java
│   │   ├── 📄 MandorKandangDAO.java
│   │   ├── 📄 ObatDAO.java
│   │   ├── 📄 PakanDAO.java
│   │   ├── 📄 PanenTelurDAO.java
│   │   ├── 📄 PekerjaHarianDAO.java
│   │   ├── 📄 PembelianObatDAO.java
│   │   ├── 📄 PembelianPakanDAO.java
│   │   ├── 📄 PemberianPakanDAO.java
│   │   ├── 📄 PenjualanTelurDAO.java
│   │   ├── 📄 StokGudangObatDAO.java
│   │   ├── 📄 StokGudangPakanDAO.java
│   │   ├── 📄 SupplierDAO.java
│   │   └── 📄 TindakanMedisDAO.java
│   ├── 📁 main
│   │   └── 📄 MainApplication.java
│   ├── 📁 model
│   │   ├── 📄 Batch.java
│   │   ├── 📄 Customer.java
│   │   ├── 📄 DetailPanen.java
│   │   ├── 📄 DetailPenjualan.java
│   │   ├── 📄 DokterHewan.java
│   │   ├── 📄 Farm.java
│   │   ├── 📄 Kandang.java
│   │   ├── 📄 KandangTanggungJawab.java
│   │   ├── 📄 Karyawan.java
│   │   ├── 📄 KematianAyam.java
│   │   ├── 📄 ManajerFarm.java
│   │   ├── 📄 MandorKandang.java
│   │   ├── 📄 Obat.java
│   │   ├── 📄 Pakan.java
│   │   ├── 📄 PanenTelur.java
│   │   ├── 📄 PekerjaHarian.java
│   │   ├── 📄 PembelianObat.java
│   │   ├── 📄 PembelianPakan.java
│   │   ├── 📄 PemberianPakan.java
│   │   ├── 📄 PenjualanTelur.java
│   │   ├── 📄 StokGudangObat.java
│   │   ├── 📄 StokGudangPakan.java
│   │   ├── 📄 Supplier.java
│   │   └── 📄 TindakanMedis.java
│   └── 📁 view
│       └── 📄 PanenForm.java
└── 📁 tugas
    └── 📄 Panduan Proyek Akhir Genap 2025-2026.pdf
```
