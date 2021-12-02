package asesmen2pbo;

import java.util.ArrayList;

public class MainActivity {
    public static void main(String[] args) {
        ArrayList<Rumah> kos = new ArrayList<>();
        ArrayList<Rumah> kontrakan = new ArrayList<>();

        // KOSAN

        kos.add(new Kosan(1, "Kosan 1", "Deskripsi Kosan 1", "2", "Coe",
                "Kosan", "-", "08121",
                "Jalan Meong no 1", "Sukapura", 140000));

        kos.add(new Kosan(2, "Kosan 2", "Deskripsi Kosan 2", "1", "Dotz",
                "Kosan", "-", "08121", "Jalan Meong no 2",
                "Sukapura", 120000));

        kos.add(new Kosan(3, "Kosan 3", "Deskripsi Kosan 3", "6",
                "Siro", "Kosan", "-", "08121", "Jalan Meong no 3",
                "Sukapura", 40000));

        // KONTRAKAN

        kontrakan.add(new Kontrakan(1, "Kontrakan 1", "Deskripsi Kontrakan 1", "2",
                "Si", "Kontrakan", "-", "08121", "Jalan Kucing no 1",
                "Sukabirus", 150000));

        kontrakan.add(new Kontrakan(2, "Kontrakan 2", "Deskripsi Kontrakan 2", "4",
                "Ro", "Kontrakan", "-", "08121", "Jalan Kucing no 2",
                "Sukabirus", 190000));

        kontrakan.add(new Kontrakan(3, "Kontrakan 3", "Deskripsi Kontrakan 3", "6",
                "Meong", "Kontrakan", "-", "08121", "Jalan Kucing no 3",
                "Sukabirus", 180000));

        // PRINT DATA KOSAN

        System.out.println("\nData Kosan :\n");
        for (Rumah printkos : kos) {
            System.out.println("Nama Kos : " + printkos.getNama());
            System.out.println("Sisa Kamar : " + ((Kosan) printkos).getSisaKamar());
            System.out.println("Harga : " + printkos.getHarga());
            System.out.println("Deskripsi : " + printkos.getDeskripsi());
            System.out.println("Pemilik Kos : " + printkos.getPemilik());
            System.out.println("Kontak Pemilik : " + printkos.getKontakPemilik());
            System.out.println("Alamat : " + printkos.getAlamat());
            System.out.println("");
        }

        // PRINT DATA KONTRAKAN

        System.out.println("\nData Kontrakan :\n");
        for (Rumah printkontrakan : kontrakan) {
            System.out.println("Nama Kontrakan :" + printkontrakan.getNama());
            System.out.println("Jumlah Kamar : " + ((Kontrakan) printkontrakan).getJumlahKamar());
            System.out.println("Harga : " + printkontrakan.getHarga());
            System.out.println("Deskripsi : " + printkontrakan.getDeskripsi());
            System.out.println("Pemilik Kontrakan : " + printkontrakan.getPemilik());
            System.out.println("Kontak Pemilik : " + printkontrakan.getKontakPemilik());
            System.out.println("Alamat : " + printkontrakan.getAlamat());
            System.out.println("");
        }
    }

}
