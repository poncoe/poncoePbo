package tugas5;

public class Segitiga {
    private double alas, tinggi;

    public Segitiga(double a, double t) {
        alas = a;
        tinggi = t;
    }

    public double getAlas() {
        return alas;
    }

    public double getTinggi() {
        return tinggi;
    }

    public double getLuas() {
        return (alas * tinggi) / 2;
    }

    public double getKeliling() {
        double d;
        d = (double) Math.sqrt((alas * alas) + (tinggi * tinggi));
        return (alas + tinggi + d);
    }
}