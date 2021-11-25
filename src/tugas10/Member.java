package tugas10;

public abstract class Member {

    protected int nik;
    protected String nama;
    protected int noTelepon;
    protected int saldo;

    public Member(int nik, String nama, int noTelepon, int saldo) {
        this.nik = nik;
        this.nama = nama;
        this.noTelepon = noTelepon;
        this.saldo = saldo;
    }

    public int getNik() {
        return nik;
    }

    public String getNama() {
        return nama;
    }

    public int getNoTelepon() {
        return noTelepon;
    }

    public abstract int getSaldo();
}
