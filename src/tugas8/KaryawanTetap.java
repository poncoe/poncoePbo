package tugas8;

public class KaryawanTetap extends Karyawan {
    private double tuDas;

    public KaryawanTetap(String nama, double tuDas, double gaDas) {
        super(nama,gaDas);
        this.tuDas = tuDas;
    }

    public void display(){
        System.out.println("Karyawan Tetap");
    }

}
