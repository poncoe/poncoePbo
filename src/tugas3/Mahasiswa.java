package tugas3;

import java.util.ArrayList;
import java.util.List;

public class Mahasiswa {
    private String nim;
    private String nama;
    private final List<Jurusan> listJurusan = new ArrayList<>();

    public Mahasiswa(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void tambahJurusan(Jurusan jurusan) {
        this.listJurusan.add(jurusan);
    }

    public List<Jurusan> getJurusan() {
        return listJurusan;
    }

    public void print() {
        System.out.println("Mahasiswa Beranama " + this.nama + " Memiliki Jurusan :");
        for (Jurusan jurusan:this.listJurusan) {
            System.out.println("- " + jurusan.getNama());
        }
    }

}
