package asesmen1pbo;

public class MainPengiriman {
    public static void main(String[] args) {

        // NORMAL
        Pengiriman normal =  new Pengiriman
                ("1","N0001","Pos Indonesia",23000,
                        "Eiger","Bandung Kopo","Bambang","Dayeuhkolot");

        // DROPSHIP
        Pengiriman dropship =  new Pengiriman
                ("2","N0002","SiCepat",24000,
                        "Dropship2","Pontianak","Joko","Dayeuhkolot");

        // ASURANSI
        Pengiriman asuransi =  new Pengiriman
                ("3","N0003","J&T",16000,
                        "Eiger","Bandung Kopo","Tini","Dayeuhkolot", 40000);

        // ASURANSI DROPSHIP
        Pengiriman asuransidropship =  new Pengiriman
                ("4","N0004","JNE",21000,
                        "Dropship1","Surabaya","Bejo","Dayeuhkolot", 40000);

        // Print Normal
        System.out.println("Normal");
        System.out.println("No Transaksi = " + normal.getNoTransaksi());
        System.out.println("No Resi = " + normal.getNoResi());
        System.out.println("Nama Ekspedisi = " + normal.getNamaEkspedisi());
        System.out.println("Ongkos Kirim = " + normal.getOngkir());
        System.out.println("Nama Pengirim = " + normal.getNamaPengirim());
        System.out.println("Alamat Pengirim = " + normal.getAlamatPengirim());
        System.out.println("Nama Penerima = " + normal.getNamaPenerima());
        System.out.println("Alamat Penerima = " + normal.getAlamatPenerima());

        System.out.println();

        // Print Dropship
        System.out.println("Dropship");
        System.out.println("No Transaksi = " + dropship.getNoTransaksi());
        System.out.println("No Resi = " + dropship.getNoResi());
        System.out.println("Nama Ekspedisi = " + dropship.getNamaEkspedisi());
        System.out.println("Ongkos Kirim = " + dropship.getOngkir());
        System.out.println("Nama Pengirim = " + dropship.getNamaPengirim());
        System.out.println("Alamat Pengirim = " + dropship.getAlamatPengirim());
        System.out.println("Nama Penerima = " + dropship.getNamaPenerima());
        System.out.println("Alamat Penerima = " + dropship.getAlamatPenerima());

        System.out.println();

        // Print Asuransi
        System.out.println("Asuransi");
        System.out.println("No Transaksi = " + asuransi.getNoTransaksi());
        System.out.println("No Resi = " + asuransi.getNoResi());
        System.out.println("Nama Ekspedisi = " + asuransi.getNamaEkspedisi());
        System.out.println("Ongkos Kirim = " + asuransi.getOngkir());
        System.out.println("Nama Pengirim = " + asuransi.getNamaPengirim());
        System.out.println("Alamat Pengirim = " + asuransi.getAlamatPengirim());
        System.out.println("Nama Penerima = " + asuransi.getNamaPenerima());
        System.out.println("Alamat Penerima = " + asuransi.getAlamatPenerima());
        System.out.println("Nominal Asuransi = " + asuransi.getNomimalAsuransi());

        System.out.println();

        // Print Asuransi Dropship
        System.out.println("Asuransi Dropship");
        System.out.println("No Transaksi = " + asuransidropship.getNoTransaksi());
        System.out.println("No Resi = " + asuransidropship.getNoResi());
        System.out.println("Nama Ekspedisi = " + asuransidropship.getNamaEkspedisi());
        System.out.println("Ongkos Kirim = " + asuransidropship.getOngkir());
        System.out.println("Nama Pengirim = " + asuransidropship.getNamaPengirim());
        System.out.println("Alamat Pengirim = " + asuransidropship.getAlamatPengirim());
        System.out.println("Nama Penerima = " + asuransidropship.getNamaPenerima());
        System.out.println("Alamat Penerima = " + asuransidropship.getAlamatPenerima());
        System.out.println("Nominal Asuransi = " + asuransidropship.getNomimalAsuransi());

    }
}
