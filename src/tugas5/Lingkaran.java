package tugas5;

public class Lingkaran {
    private float jarijari;
    private final double PI = 3.14;

    public Lingkaran(float r) {
        jarijari = r;
    }

    public double getRadius() {
        return jarijari;
    }

    public double getLuas() {
        return (PI * jarijari * jarijari);
    }

    public double getKeliling() {
        return (2 * PI * jarijari);
    }
}