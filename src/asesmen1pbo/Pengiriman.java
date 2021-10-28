package asesmen1pbo;

public class Pengiriman {
    private String NoTransaksi;
    private String NoResi;
    private String NamaEkspedisi;
    private Integer Ongkir;
    private String NamaPengirim;
    private String AlamatPengirim;
    private String NamaPenerima;
    private String AlamatPenerima;
    private Integer NomimalAsuransi;

    // Konstruktor Data Non Asuransi
    public Pengiriman(String noTransaksi, String noResi, String namaEkspedisi, Integer ongkir, String namaPengirim, String alamatPengirim, String namaPenerima, String alamatPenerima) {
        NoTransaksi = noTransaksi;
        NoResi = noResi;
        NamaEkspedisi = namaEkspedisi;
        Ongkir = ongkir;
        NamaPengirim = namaPengirim;
        AlamatPengirim = alamatPengirim;
        NamaPenerima = namaPenerima;
        AlamatPenerima = alamatPenerima;
    }

    // Konstruktor Data + Asuransi
    public Pengiriman(String noTransaksi, String noResi, String namaEkspedisi, Integer ongkir, String namaPengirim, String alamatPengirim, String namaPenerima, String alamatPenerima, Integer nomimalAsuransi) {
        NoTransaksi = noTransaksi;
        NoResi = noResi;
        NamaEkspedisi = namaEkspedisi;
        Ongkir = ongkir;
        NamaPengirim = namaPengirim;
        AlamatPengirim = alamatPengirim;
        NamaPenerima = namaPenerima;
        AlamatPenerima = alamatPenerima;
        NomimalAsuransi = nomimalAsuransi;
    }

    public String getNoTransaksi() {
        return NoTransaksi;
    }

    public void setNoTransaksi(String noTransaksi) {
        NoTransaksi = noTransaksi;
    }

    public String getNoResi() {
        return NoResi;
    }

    public void setNoResi(String noResi) {
        NoResi = noResi;
    }

    public String getNamaEkspedisi() {
        return NamaEkspedisi;
    }

    public void setNamaEkspedisi(String namaEkspedisi) {
        NamaEkspedisi = namaEkspedisi;
    }

    public Integer getOngkir() {
        return Ongkir;
    }

    public void setOngkir(Integer ongkir) {
        Ongkir = ongkir;
    }

    public String getNamaPengirim() {
        return NamaPengirim;
    }

    public void setNamaPengirim(String namaPengirim) {
        NamaPengirim = namaPengirim;
    }

    public String getAlamatPengirim() {
        return AlamatPengirim;
    }

    public void setAlamatPengirim(String alamatPengirim) {
        AlamatPengirim = alamatPengirim;
    }

    public String getNamaPenerima() {
        return NamaPenerima;
    }

    public void setNamaPenerima(String namaPenerima) {
        NamaPenerima = namaPenerima;
    }

    public String getAlamatPenerima() {
        return AlamatPenerima;
    }

    public void setAlamatPenerima(String alamatPenerima) {
        AlamatPenerima = alamatPenerima;
    }

    public Integer getNomimalAsuransi() {
        return NomimalAsuransi;
    }

    public void setNomimalAsuransi(Integer nomimalAsuransi) {
        NomimalAsuransi = nomimalAsuransi;
    }
}
