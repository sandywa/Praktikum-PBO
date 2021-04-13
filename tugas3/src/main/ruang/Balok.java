package ruang;

public class Balok implements MenghitungRuang{
    int panjang;
    int lebar;
    int tinggi;

    public Balok(int panjang, int lebar, int tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    @Override
    public int volumeBalok() {
        return panjang*tinggi*lebar;
    }

    @Override
    public int luasPermukaanBalok() {
        return (panjang*lebar)+(panjang*tinggi)+(lebar*tinggi);
    }
}
