package tugas3.backup;

import java.util.ArrayList;
import java.util.List;

public class MahasiswaBackup {
    private String nim;
    private String nama;
    private final List<JurusanBackup> listJurusanBackup = new ArrayList<>();

    public MahasiswaBackup(String nim, String nama) {
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

    public void tambahJurusan(JurusanBackup jurusanBackup) {
        this.listJurusanBackup.add(jurusanBackup);
    }

    public List<JurusanBackup> getJurusan() {
        return listJurusanBackup;
    }

    public void print() {
        System.out.println("MahasiswaBackup Beranama " + this.nama + " Memiliki JurusanBackup :");
        for (JurusanBackup jurusanBackup :this.listJurusanBackup) {
            System.out.println("- " + jurusanBackup.getNama());
        }
    }

}
