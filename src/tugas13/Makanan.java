package tugas13;

public class Makanan {
    private String nama;
    private String jenismakanan;
    private Integer kalori;
    private Integer rating;

    public Makanan(String nama, String jenismakanan, Integer kalori, Integer rating) {

        this.nama = nama;
        this.jenismakanan = jenismakanan;
        this.kalori = kalori;
        this.rating = rating;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenismakanan() {
        return jenismakanan;
    }

    public void setJenismakanan(String jenismakanan) {
        this.jenismakanan = jenismakanan;
    }

    public Integer getKalori() {
        return kalori;
    }

    public void setKalori(Integer kalori) {
        this.kalori = kalori;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }
}
