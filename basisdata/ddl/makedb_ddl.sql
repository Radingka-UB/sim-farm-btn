USE master;
GO

-- ========================================================
-- 1. BERSIHKAN DATABASE LAMA (JIKA ADA)
-- ========================================================
IF EXISTS (SELECT name FROM sys.databases WHERE name = 'SIM_FARM_BTN')
BEGIN
    ALTER DATABASE SIM_FARM_BTN SET SINGLE_USER WITH ROLLBACK IMMEDIATE;
    DROP DATABASE SIM_FARM_BTN;
END
GO

-- ========================================================
-- 2. BUAT DATABASE BARU
-- ========================================================
CREATE DATABASE SIM_FARM_BTN;
GO
USE SIM_FARM_BTN;
GO

