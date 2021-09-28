package tugas1;

public class MainBarang {
    public static void main(String[] args) {
        //membuat objek barang 1
        Barang barang1 = new Barang("BRG-001","Tas Gucci",(double)1200);
        barang1.setIdProduk("BRG-001");
        barang1.setNama("Tas Gucci");
        barang1.setHarga((double) 1200);

        //membuat objek barang 2
        Barang barang2 = new Barang("BRG-002", "Printer Epson L355", (double) 200);
        barang2.setIdProduk("BRG-002");
        barang2.setNama("Printer Epson L355");
        barang2.setHarga((double) 200);

        //membuat objek barang 3
        Barang barang3 = new Barang("BRG-003", "Koper", (double) 150);
        barang3.setIdProduk("BRG-003");
        barang3.setNama("Koper");
        barang3.setHarga((double) 150);

        //membuat objek barang 4
        Barang barang4 = new Barang("BRG-004", "Helm", (double) 20);
        barang4.setIdProduk("BRG-004");
        barang4.setNama("Helm");
        barang4.setHarga((double) 20);

        //menampilkan
        System.out.println("Barang 1: "+barang1.getIdProduk()+", "+barang1.getNama()+ ", " +barang1.getHarga());
        System.out.println("Barang 2: "+barang2.getIdProduk()+", "+barang2.getNama()+ ", " +barang2.getHarga());
        System.out.println("Barang 3: "+barang3.getIdProduk()+", "+barang3.getNama()+ ", " +barang3.getHarga());
        System.out.println("Barang 4: "+barang4.getIdProduk()+", "+barang4.getNama()+ ", " +barang4.getHarga());
    }
}
