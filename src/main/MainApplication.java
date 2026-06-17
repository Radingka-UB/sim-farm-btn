package main;

import dao.CustomerDAO;
import dao.PakanDAO;
import model.Customer;
import model.Pakan;

public class MainApplication {
    public static void main(String[] args) {
        System.out.println("=== SISTEM SIM-FARM BTN ===");
        
        CustomerDAO customerDao = new CustomerDAO();
        System.out.println("\n[Customer] Data Saat Ini:");
        for (Customer c : customerDao.getAllCustomer()) {
            System.out.println("- " + c.getNamaCustomer() + " (" + c.getAlamat() + ")");
        }

        PakanDAO pakanDao = new PakanDAO();
        System.out.println("\n[Pakan] Menguji Tambah Pakan Baru...");
        Pakan pakanBaru = new Pakan(101, "Sentrat Petelur BR-2", "Cargill", "Premium Fodder", 12000);
        
        if (pakanDao.insertPakan(pakanBaru)) {
            System.out.println("Sukses!");
        }
        
        System.out.println("\n[Pakan] Data Saat Ini:");
        for (Pakan p : pakanDao.getAllPakan()) {
            System.out.println("- " + p.getNamaPakan() + " (" + p.getMerek() + ") | Rp" + p.getHargaPerKg() + "/kg");
        }
    }
}