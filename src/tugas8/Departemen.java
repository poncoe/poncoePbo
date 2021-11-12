package tugas8;

import java.util.ArrayList;
import java.util.List;

public class Departemen {
    private String nama;
    private List<Karyawan> kar = new ArrayList<>();

    public Departemen(String nama) {
        this.nama = nama;
    }

    public void addKaryawan(Karyawan karyawan) {
        this.kar.add(karyawan);
    }

    public void displayAll() {
        System.out.println("\nDepartemen : " + this.nama);
        System.out.println("Memiliki Karyawan yaitu : \n");
        for (Karyawan karyawan:this.kar) {
            System.out.println("Nama : " + karyawan.getNama() + " - " + "Gaji Dasar : " + Karyawan.getGaDas());
        }
    }
}
