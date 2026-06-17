CREATE TABLE KANDANGTANGGUNGJAWAB 
(
  KaryawanID INT NOT NULL,
  KandangID INT NOT NULL,
  TanggalDitugaskan DATE DEFAULT GETDATE(),
  
  -- Composite Primary Key
  PRIMARY KEY (KaryawanID, KandangID),
  
  -- Foreign Key mengarah ke Subtype Mandor dan Kandang dengan Cascade Action
  FOREIGN KEY (KaryawanID) REFERENCES MANDORKANDANG(KaryawanID) ON DELETE CASCADE ON UPDATE CASCADE,
  FOREIGN KEY (KandangID) REFERENCES KANDANG(KandangID) ON DELETE CASCADE ON UPDATE CASCADE
);