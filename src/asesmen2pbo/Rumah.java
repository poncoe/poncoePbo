package asesmen2pbo;

public class Rumah {
    private String nama;
    private String deskripsi;
    private String pemilik;
    private String Jenis;
    private String gambar;
    private String kontakPemilik;
    private String alamat;
    private String wilayah;
    private int harga;

    public Rumah(String nama, String deskripsi, String pemilik, String jenis, String gambar, String kontakPemilik, String alamat, String wilayah, int harga) {
        this.nama = nama;
        this.deskripsi = deskripsi;
        this.pemilik = pemilik;
        Jenis = jenis;
        this.gambar = gambar;
        this.kontakPemilik = kontakPemilik;
        this.alamat = alamat;
        this.wilayah = wilayah;
        this.harga = harga;
    }

    public String getNama() {
        return nama;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public String getPemilik() {
        return pemilik;
    }

    public String getJenis() {
        return Jenis;
    }

    public String getGambar() {
        return gambar;
    }

    public String getKontakPemilik() {
        return kontakPemilik;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getWilayah() {
        return wilayah;
    }

    public int getHarga() {
        return harga;
    }
}
