package asesmen1pbo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShowroomJayaMain {
    private List<Mobil> arrMobil = new ArrayList<>();
    private static Scanner input = new Scanner (System.in);

    public static void main(String[] args) {
//        Mobil mobil1 = new Mobil("Avanza", 150000000.0,"2018",5);
//        Mobil mobil2 = new Mobil("Aston Martin", 394000000.0,"2019",2);
//        tambahMobil(mobil1);
//        tambahMobil(mobil2);

        System.out.print("Masukan Merk = ");
        String merk = input.nextLine();
        System.out.print("Masukan Tahun Keluaran = ");
        String tahun = input.nextLine();
        System.out.print("Masukan Jumlah = ");
        int jumlah = input.nextInt();
        Mobil mobil = new Mobil(merk,tahun,jumlah);

        if (mobil.getMerk().equalsIgnoreCase("Avanza")){
            System.out.println("Merk = " + mobil.getMerk());
            System.out.println("Harga Satuan = 150000000.0");
            System.out.println("Tahun Keluaran = " + mobil.getTahunKeluaran());
            System.out.println("Jumlah = " + mobil.getStok());
            System.out.println("Total Harga = 150000000.0");
            System.out.println("Diskon = 0.0");
            System.out.println("Total Bayar = 150000000.0");
        } else {
            System.out.println("Pilihan Tidak Ada, Program Keluar");
            System.exit(0);
        }
    }

//    public static void tambahMobil(Mobil mobil) {
//        this.arrMobil.add(mobil);
//    }

    public void ViewStok() {
        System.out.println("Lihat Stok Mobil");
        for (Mobil mobil:this.arrMobil) {
            System.out.println(mobil.getMerk() + " - " + mobil.getStok());
        }
    }
}
