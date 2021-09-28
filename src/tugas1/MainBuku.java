package tugas1;

public class MainBuku {
    public static void main(String[] args) {
        //membuat objek Buku 1
        Buku buku1 = new Buku("Harry Potter","J.K. Rowling",(double)300000);
        buku1.setJudul("Harry Potter");
        buku1.setPengarang("J.K. Rowling");
        buku1.setHarga((double) 300000);

        //membuat objek Buku 2
        Buku buku2 = new Buku("UML", "Ivar Jacobson", (double) 400000);
        buku2.setJudul("UML");
        buku2.setPengarang("Ivar Jacobson");
        buku2.setHarga((double) 400000);

        //menampilkan
        System.out.println("Buku 1: "+buku1.getJudul()+", "+buku1.getPengarang()+ ", " +buku1.getHarga());
        System.out.println("Buku 2: "+buku2.getJudul()+", "+buku2.getPengarang()+ ", " +buku2.getHarga());
    }
}
