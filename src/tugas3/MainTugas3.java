package tugas3;

public class MainTugas3 {

    public static void main(String[] args) {
        Jurusan jurusan1 = new Jurusan("D3IF","Diploma 3 Rekayasa Perangkat Lunak Aplikasi");
        Jurusan jurusan2 = new Jurusan("D3SI","Diploma 3 Sistem Informasi");

        Mahasiswa mahasiswa1 = new Mahasiswa("6701","Rendi");
        Mahasiswa mahasiswa2 = new Mahasiswa("6702","Chaca");
        Mahasiswa mahasiswa3 = new Mahasiswa("6703","Agus");


        Mahasiswa mahasiswa4 = new Mahasiswa("6301","Ridwan");
        Mahasiswa mahasiswa5 = new Mahasiswa("6302","Siska");
        Mahasiswa mahasiswa6 = new Mahasiswa("6303","Zayn");
        Mahasiswa mahasiswa7 = new Mahasiswa("6304","Rahmat");

        jurusan1.tambahMahasiswa(mahasiswa1);
        jurusan1.tambahMahasiswa(mahasiswa2);
        jurusan1.tambahMahasiswa(mahasiswa3);

        jurusan2.tambahMahasiswa(mahasiswa4);
        jurusan2.tambahMahasiswa(mahasiswa5);
        jurusan2.tambahMahasiswa(mahasiswa6);
        jurusan2.tambahMahasiswa(mahasiswa7);

        jurusan1.print();
        jurusan2.print();
    }
}
