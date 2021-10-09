package tugas3.backup;

import java.util.ArrayList;
import java.util.List;

public class JurusanBackup {
    private String kode;
    private String nama;
    private List<MahasiswaBackup> mhs = new ArrayList<>();

    public JurusanBackup(String kode, String nama) {
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

    public void tambahMahasiswa(MahasiswaBackup mahasiswaBackup) {
        mahasiswaBackup.tambahJurusan(this);
        this.mhs.add(mahasiswaBackup);
    }

    public List<MahasiswaBackup> getMhs() {
        return mhs;
    }

    public void print() {
        System.out.println("\nKode : " + this.kode);
        System.out.println("Nama : " + this.nama);
        System.out.println("\nMemiliki mahasiswa yaitu : \n");
        for (MahasiswaBackup mahasiswaBackup :this.mhs) {
            System.out.println(mahasiswaBackup.getNim() + " - " + mahasiswaBackup.getNama());
        }
    }
}
