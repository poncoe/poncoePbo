package asesmen2pbo;

public class Kontrakan extends Rumah {
    private int idKontrakan;
    private String jumlahKamar;

    public Kontrakan(int idKontrakan, String nama, String deskripsi, String jumlahKamar, String pemilik, String jenis, String gambar, String kontakPemilik, String alamat, String wilayah, int harga) {
        super(nama,deskripsi,pemilik,jenis,gambar,kontakPemilik,alamat,wilayah,harga);
        this.idKontrakan = idKontrakan;
        this.jumlahKamar = jumlahKamar;
    }

    public int getIdKontrakan() {
        return idKontrakan;
    }

    public String getJumlahKamar() {
        return jumlahKamar;
    }
}