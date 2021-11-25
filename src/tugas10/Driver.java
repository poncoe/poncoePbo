package tugas10;

public class Driver extends Member {

    private String noKendaraan;
    private String jenis;

    public Driver(int nik, String nama, int noTelepon, String noKendaraan, String jenis, int saldo) {
        super(nik,nama,noTelepon,saldo);
        this.noKendaraan = noKendaraan;
        this.jenis = jenis;
    }

    public String getNoKendaraan() {
        return noKendaraan;
    }

    public String getJenis() {
        return jenis;
    }

    @Override
    public int getSaldo() {
        return saldo;
    }
}
