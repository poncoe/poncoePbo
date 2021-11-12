package tugas8;

public class Karyawan {
    protected String nama;
    private static double gaDas;

    public Karyawan(String nama, double gaDas) {
        this.nama = nama;
        Karyawan.gaDas = gaDas;
    }

    public String getNama() {
        return nama;
    }

    public static double getGaDas() {
        return gaDas;
    }

    public void display(){
        System.out.println("Jenis Karyawan");
    }
}
