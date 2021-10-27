package tugas5;

import java.util.Scanner;

public class MainSegitiga {
    private static Scanner input = new Scanner (System.in);

    private static void ProgramSegitiga(){
        System.out.print("Masukan Alas = ");
        int alas = input.nextInt();
        System.out.print("Masukan Tinggi = ");
        int tinggi = input.nextInt();
        Segitiga segitiga1 = new Segitiga(alas,tinggi);

        System.out.println("Keliling = " + segitiga1.getKeliling());
        System.out.println("Luas = " + segitiga1.getLuas());
        System.out.println();

    }

    public static void main(String[] args) {
        int pilihan = 0;

        do{
            System.out.println("Silahkan pilih menu :");
            System.out.println("1. Hitung Segitiga");
            System.out.println("2. Keluar Program");
            System.out.print("Masukan Pilihan = ");
            pilihan = input.nextInt();
            if (pilihan == 1){
                ProgramSegitiga();
            } else if (pilihan == 2){
                System.out.println("Keluar Aplikasi");
                System.exit(0);
            } else {
                System.out.println("Tidak Ada Pilihan");
            }
        } while (pilihan != 2);

    }
}
