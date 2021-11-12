package tugas8;

public class KaryawanKontrak extends Karyawan {
    private int waktu;

    public KaryawanKontrak(String nama, int waktu, double gaDas) {
        super(nama,gaDas);
        this.waktu = waktu;
    }

    public void display(){
        System.out.println("Karyawan Kontrak");
    }
}
