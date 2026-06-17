package model;

public class Customer {
    private int customerId;
    private String namaCustomer;
    private String tipeCustomer;
    private String alamat;
    private String telepon;

    // Constructor Kosong
    public Customer() {}

    // Constructor Lengkap
    public Customer(int customerId, String namaCustomer, String tipeCustomer, String alamat, String telepon) {
        this.customerId = customerId;
        this.namaCustomer = namaCustomer;
        this.tipeCustomer = tipeCustomer;
        this.alamat = alamat;
        this.telepon = telepon;
    }

    // Getter dan Setter
    public int getCustomerId() { return customerId; }
    public void setCustomerId(int customerId) { this.customerId = customerId; }

    public String getNamaCustomer() { return namaCustomer; }
    public void setNamaCustomer(String namaCustomer) { this.namaCustomer = namaCustomer; }

    public String getTipeCustomer() { return tipeCustomer; }
    public void setTipeCustomer(String tipeCustomer) { this.tipeCustomer = tipeCustomer; }

    public String getAlamat() { return alamat; }
    public void setAlamat(String alamat) { this.alamat = alamat; }

    public String getTelepon() { return telepon; }
    public void setTelepon(String telepon) { this.telepon = telepon; }
}