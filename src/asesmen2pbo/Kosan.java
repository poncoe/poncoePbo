package asesmen2pbo;

public class Kosan extends Rumah {
    private int idKosan;
    private String sisaKamar;

    public Kosan(int idKosan, String nama, String deskripsi, String sisaKamar, String pemilik, String jenis, String gambar, String kontakPemilik, String alamat, String wilayah, int harga) {
        super(nama,deskripsi,pemilik,jenis,gambar,kontakPemilik,alamat,wilayah,harga);
        this.idKosan = idKosan;
        this.sisaKamar = sisaKamar;
    }

    public int getIdKosan() {
        return idKosan;
    }

    public String getSisaKamar() {
        return sisaKamar;
    }
}
