package tuags2;

import java.util.Scanner;

public class MainGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Silahkan Pilih Karakter (Raiden, Sub-Zero)): ");
        String pilihKarakter = scanner.nextLine();
        while (true) {
            if (pilihKarakter.equalsIgnoreCase("Raiden") || pilihKarakter.equalsIgnoreCase("Sub-Zero")) {
                break;
            } else {
                System.out.println("Karakter yang anda masukan salah!");
                scanner = new Scanner(System.in);
                System.out.print("Silahkan Pilih Karakter (Raiden, Sub-Zero)): ");
                pilihKarakter = scanner.nextLine();
            }
        }

        public String attack(GameCharacter raiden, GameCharacter subzero){
            int a = raiden.attack(subzero);
            return raiden.getName() + " hit " + subzero.getName() + " for " + a + " damage.";
        }

            while(true){
                Scanner scannerPerintah = new Scanner(System.in);
                System.out.print("\nApa yang ingin anda lakukan? (Kick, Status): ");
                String pilihAksi = scannerPerintah.nextLine();
                while(true){
                    if(!pilihAksi.equalsIgnoreCase("Status") && !pilihAksi.equalsIgnoreCase("Kick")){
                        System.out.println("Karakter yang anda masukan salah!");
                        scannerPerintah = new Scanner(System.in);
                        System.out.print("\nApa yang ingin anda lakukan? (Kick, Status): ");
                        pilihAksi = scannerPerintah.nextLine();
                    }else{
                        break;
                    }
                }
                if(pilihAksi.equalsIgnoreCase("Status")){
                    System.out.println(raiden.status());

                    continue;
                }
                if(pilihAksi.equalsIgnoreCase("Kick")){
                    System.out.println(attack(raiden, subzero));
                    System.out.println(subzero.status());

                }
                if(!subzero.isDead()){
                    System.out.println(attack(subzero, raiden));
                    System.out.println(raiden.status());

                    if(raiden.isDead()){
                        System.out.println("Anda Mati!");
                        break;
                    }
                }else{
                    System.out.println("Kamu Terbunuh " + subzero.getName() + "\n");
                    System.out.println(raiden + "\n");
                    break;
                }
            }
        }
    }
