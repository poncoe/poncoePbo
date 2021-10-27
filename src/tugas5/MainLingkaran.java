package tugas5;

public class MainLingkaran {
    public static void main(String[] args) {

        // Lingkaran
        Lingkaran lingkaran1 =  new Lingkaran (7);
        Lingkaran lingkaran2 = new Lingkaran(8);

        // Print Lingkaran
        System.out.println("Jari-Jari Lingkaran = " + lingkaran1.getRadius());
        System.out.println("Luas = " + lingkaran1.getLuas());
        System.out.println("Keliling = " + lingkaran1.getKeliling());
        System.out.println();
        System.out.println("Jari-Jari Lingkaran = " + lingkaran2.getRadius());
        System.out.println("Luas = " + lingkaran2.getLuas());
        System.out.println("Keliling = " + lingkaran2.getKeliling());

    }
}
