package view;

import dao.PanenTelurDAO;
import model.PanenTelur;
import java.sql.Date;
import java.util.List;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PanenForm extends JFrame {
    private JTable tablePanen;
    private DefaultTableModel tableModel;
    private JTextField txtPanenID, txtTanggal, txtKaryawanID, txtBatchID;
    private JButton btnInsert, btnUpdate, btnDelete, btnClear;
    private PanenTelurDAO dao = new PanenTelurDAO();
    
    public PanenForm() {
        setTitle("SIM-FARM BTN - Modul Panen Telur");
        setSize(750, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        JLabel lblPanenID = new JLabel("Panen ID:");
        lblPanenID.setBounds(20, 20, 100, 25);
        add(lblPanenID);

        txtPanenID = new JTextField();
        txtPanenID.setBounds(130, 20, 150, 25);
        add(txtPanenID);

        JLabel lblTanggal = new JLabel("Tanggal (YYYY-MM-DD):");
        lblTanggal.setBounds(20, 60, 150, 25);
        add(lblTanggal);

        txtTanggal = new JTextField("2026-06-18");
        txtTanggal.setBounds(170, 60, 110, 25);
        add(txtTanggal);

        JLabel lblKaryawanID = new JLabel("Karyawan ID:");
        lblKaryawanID.setBounds(320, 20, 100, 25);
        add(lblKaryawanID);

        txtKaryawanID = new JTextField();
        txtKaryawanID.setBounds(420, 20, 150, 25);
        add(txtKaryawanID);

        JLabel lblBatchID = new JLabel("Batch ID:");
        lblBatchID.setBounds(320, 60, 100, 25);
        add(lblBatchID);

        txtBatchID = new JTextField();
        txtBatchID.setBounds(420, 60, 150, 25);
        add(txtBatchID);

        btnInsert = new JButton("Tambah");
        btnInsert.setBounds(20, 110, 90, 30);
        add(btnInsert);

        btnUpdate = new JButton("Ubah");
        btnUpdate.setBounds(120, 110, 90, 30);
        add(btnUpdate);

        btnDelete = new JButton("Hapus");
        btnDelete.setBounds(220, 110, 90, 30);
        add(btnDelete);

        btnClear = new JButton("Clear");
        btnClear.setBounds(320, 110, 90, 30);
        add(btnClear);

        String[] columns = {"Panen ID", "Tanggal Panen", "Karyawan ID", "Batch ID"};
        tableModel = new DefaultTableModel(columns, 0);
        tablePanen = new JTable(tableModel);

        JScrollPane scrollPane = new JScrollPane(tablePanen);
        scrollPane.setBounds(20, 160, 690, 270);
        add(scrollPane);

        loadDataToGrid();

        tablePanen.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                int selectedRow = tablePanen.getSelectedRow();
                txtPanenID.setText(tableModel.getValueAt(selectedRow, 0).toString());
                txtTanggal.setText(tableModel.getValueAt(selectedRow, 1).toString());
                txtKaryawanID.setText(tableModel.getValueAt(selectedRow, 2).toString());
                txtBatchID.setText(tableModel.getValueAt(selectedRow, 3).toString());
                txtPanenID.setEditable(false);
            }
        });

        btnInsert.addActionListener(e -> {
            if (validateInput()) {
                PanenTelur pt = getFormDate();
                if (dao.insertPanen(pt)) {
                    JOptionPane.showMessageDialog(this, "Data Berhasil Ditambahkan!");
                    clearForm();
                    loadDataToGrid();
                } else {
                    JOptionPane.showMessageDialog(this, "Gagal Tambah Data! Cek referensi ID.");
                }
            }
        });

        btnUpdate.addActionListener(e -> {
            if (validateInput()) {
                PanenTelur pt = getFormDate();
                if (dao.updatePanen(pt)) {
                    JOptionPane.showMessageDialog(this, "Data Berhasil Diperbarui!");
                    clearForm();
                    loadDataToGrid();
                } else {
                    JOptionPane.showMessageDialog(this, "Gagal Mengubah Data!");
                }
            }
        });

        btnDelete.addActionListener(e -> {
            if (txtPanenID.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Pilih data pada tabel yang ingin dihapus!");
                return;
            }

            int confirm = JOptionPane.showConfirmDialog(
                this,
                "Yakin hapus data ini?",
                "Konfirmasi",
                JOptionPane.YES_NO_OPTION
            );

            if (confirm == JOptionPane.YES_OPTION) {
                int id = Integer.parseInt(txtPanenID.getText().trim());

                if (dao.deletePanen(id)) {
                    JOptionPane.showMessageDialog(this, "Data Berhasil Dihapus!");
                    clearForm();
                    loadDataToGrid();
                } else {
                    JOptionPane.showMessageDialog(this, "Gagal Menghapus Data!");
                }
            }
        });

        btnClear.addActionListener(e -> clearForm());
        
    }

    private void loadDataToGrid() {
        tableModel.setRowCount(0);

        List<PanenTelur> list = dao.getAllPanen();

        for (PanenTelur pt : list) {
            Object[] row = {
                pt.getPanenId(),
                pt.getTanggalPanen(),
                pt.getKaryawanId(),
                pt.getBatchId()
            };
            tableModel.addRow(row);
        }
        tableModel.fireTableDataChanged();
    }

    private PanenTelur getFormDate() {
        int id = Integer.parseInt(txtPanenID.getText().trim());
        Date tgl = Date.valueOf(txtTanggal.getText().trim());
        int karId = Integer.parseInt(txtKaryawanID.getText().trim());
        int batId = Integer.parseInt(txtBatchID.getText().trim());

        return new PanenTelur(id, tgl, karId, batId);
    }

 private void clearForm() {
        System.out.println("-> Fungsi clearForm() berhasil dipanggil!"); 
        txtPanenID.setText("");
        txtTanggal.setText("2026-06-19"); 
        txtKaryawanID.setText("");
        txtBatchID.setText("");
        txtPanenID.setEditable(true);
        tablePanen.clearSelection();
    }

    private boolean validateInput() {
        if (txtPanenID.getText().trim().isEmpty()
                || txtTanggal.getText().trim().isEmpty()
                || txtKaryawanID.getText().trim().isEmpty()
                || txtBatchID.getText().trim().isEmpty()) {

            JOptionPane.showMessageDialog(
                this,
                "Semua form input wajib diisi, tidak boleh kosong!",
                "Peringatan",
                JOptionPane.WARNING_MESSAGE
            );
            return false;
        }

        try {
            Integer.parseInt(txtPanenID.getText().trim());
            Integer.parseInt(txtKaryawanID.getText().trim());
            Integer.parseInt(txtBatchID.getText().trim());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(
                this,
                "ID harus berupa angka bulat numerik!",
                "Format Salah",
                JOptionPane.ERROR_MESSAGE
            );
            return false;
        }

        try {
            Date.valueOf(txtTanggal.getText().trim());
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(
                this,
                "Format tanggal salah! Harus format YYYY-MM-DD (Contoh: 2026-06-18)",
                "Format Salah",
                JOptionPane.ERROR_MESSAGE
            );
            return false;
        }

        return true;
    }
}