package tugas10;

public class Customer extends Member {

    public Customer(int nik, String nama, int noTelepon, int saldo) {
        super(nik,nama,noTelepon,saldo);
    }

    @Override
    public int getSaldo() {
        return saldo;
    }
}
