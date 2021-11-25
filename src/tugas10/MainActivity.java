package tugas10;

import java.util.ArrayList;

public class MainActivity {

    public static void main(String[] args) {
        ArrayList<Member> customer = new ArrayList<>();
        ArrayList<Member> driver = new ArrayList<>();

        customer.add(new Customer(1,"Coe",123,5000));
        customer.add(new Customer(2,"Dotz",1234,15000));
        customer.add(new Customer(3,"Meonk",12345,25000));

        driver.add(new Driver(1,"Ngojek",123,"B1213E","Motor", 12400));

        System.out.println("\nData Customer :");
        for(Member printcus:customer){
            System.out.println("Nama :" + printcus.getNama());
            System.out.println("Saldonya :" + printcus.getSaldo());
        }

        System.out.println("\nData Driver :");
        for(Member printdriv:driver){
            System.out.println("Nama :" + printdriv.getNama());
            //System.out.println("No Kendaraan :" + printdriv.getNoKendaraan());
            //System.out.println("Jenis Kendaraan : " + printdriv.getJenisKendaraan());
            System.out.println("Saldo : " + printdriv.getSaldo());
        }

    }
}
