package tugas8;

public class MainActivity {

    public static void main(String[] args) {
        Departemen departemen1 = new Departemen("Ngoding");
        Departemen departemen2 = new Departemen("Ngadanalis");

        Karyawan karyawan1 = new Karyawan("Coe", 1200.0);


        KaryawanTetap tetap1 = new KaryawanTetap("Dotz", 1230.0, 421.1);
        KaryawanKontrak kontrak1 = new KaryawanKontrak("Kae", 30, 1312.1);

        departemen1.addKaryawan(karyawan1);
        departemen1.addKaryawan(tetap1);
        departemen2.addKaryawan(kontrak1);

        departemen1.displayAll();
        departemen2.displayAll();

    }
}
