public class Buku {
    private String kodebuku;
    private String judul;
    private String pengarang;
    private String penerbit;

    public Buku() {
    }

    public Buku(String kodebuku, String judul, String pengarang, String penerbit) {
        this.kodebuku = kodebuku;
        this.judul = judul;
        this.pengarang = pengarang;
        this.penerbit = penerbit;
    }


    public String getKodeBuku() {
        return kodebuku;
    }
    public void setKodeBuku(String kodebuku) {
        this.kodebuku = kodebuku;
    }

    public String getJudul() {
        return judul;
    }
    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPengarang() {
        return pengarang;
    }
    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }
    public String getPenerbit() {
        return penerbit;
    }
    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }
}
