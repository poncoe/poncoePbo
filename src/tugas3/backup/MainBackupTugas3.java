package tugas3.backup;

public class MainBackupTugas3 {

    public static void main(String[] args) {
        JurusanBackup jurusanBackup1 = new JurusanBackup("D3IF","Diploma 3 Rekayasa Perangkat Lunak Aplikasi");
        JurusanBackup jurusanBackup2 = new JurusanBackup("D3SI","Diploma 3 Sistem Informasi");

        MahasiswaBackup mahasiswaBackup1 = new MahasiswaBackup("6701","Rendi");
        MahasiswaBackup mahasiswaBackup2 = new MahasiswaBackup("6702","Chaca");
        MahasiswaBackup mahasiswaBackup3 = new MahasiswaBackup("6703","Agus");


        MahasiswaBackup mahasiswaBackup4 = new MahasiswaBackup("6301","Ridwan");
        MahasiswaBackup mahasiswaBackup5 = new MahasiswaBackup("6302","Siska");
        MahasiswaBackup mahasiswaBackup6 = new MahasiswaBackup("6303","Zayn");
        MahasiswaBackup mahasiswaBackup7 = new MahasiswaBackup("6304","Rahmat");

        jurusanBackup1.tambahMahasiswa(mahasiswaBackup1);
        jurusanBackup1.tambahMahasiswa(mahasiswaBackup2);
        jurusanBackup1.tambahMahasiswa(mahasiswaBackup3);

        jurusanBackup2.tambahMahasiswa(mahasiswaBackup4);
        jurusanBackup2.tambahMahasiswa(mahasiswaBackup5);
        jurusanBackup2.tambahMahasiswa(mahasiswaBackup6);
        jurusanBackup2.tambahMahasiswa(mahasiswaBackup7);

        jurusanBackup1.print();
        jurusanBackup2.print();
    }
}
