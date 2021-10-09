package tugas3;

import java.util.ArrayList;
import java.util.List;

public class Jurusan {
    private String kode;
    private String nama;
    private List<Mahasiswa> mhs = new ArrayList<>();

    public Jurusan(String kode, String nama) {
        this.kode = kode;
        this.nama = nama;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void tambahMahasiswa(Mahasiswa mahasiswa) {
        mahasiswa.tambahJurusan(this);
        this.mhs.add(mahasiswa);
    }

    public List<Mahasiswa> getMhs() {
        return mhs;
    }

    public void print() {
        System.out.println("\nKode : " + this.kode);
        System.out.println("Nama : " + this.nama);
        System.out.println("Memiliki mahasiswa yaitu : \n");
        for (Mahasiswa mahasiswa:this.mhs) {
            System.out.println(mahasiswa.getNim() + " - " + mahasiswa.getNama());
        }
    }
}
