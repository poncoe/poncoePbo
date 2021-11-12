package asesmen1pbo;

public class Mobil {
    private String merk;
    private String tahunKeluaran;
    private double harga;
    private int stok;

//    public Mobil(String merk,  double harga, String tahunKeluaran, int stok) {
//        this.merk = merk;
//        this.harga = harga;
//        this.tahunKeluaran = tahunKeluaran;
//        this.stok = stok;
//    }

    public Mobil(String merk, String tahunKeluaran, int stok) {
        this.merk = merk;
        this.tahunKeluaran = tahunKeluaran;
        this.stok = stok;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getTahunKeluaran() {
        return tahunKeluaran;
    }

    public void setTahunKeluaran(String tahunKeluaran) {
        this.tahunKeluaran = tahunKeluaran;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public void DisplayInfo() {
        System.out.println("Informasi Mobil");
        System.out.println("\nMerk : " + getMerk());
        System.out.println("Harga : " + getHarga());
        System.out.println("Tahun Keluaran : " + getTahunKeluaran());
        System.out.println("Sisa Stok : " + getStok());
        System.out.println("Memiliki mahasiswa yaitu : \n");
    }
}
