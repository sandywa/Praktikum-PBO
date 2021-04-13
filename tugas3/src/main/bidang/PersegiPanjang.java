
package bidang;

public class PersegiPanjang implements MenghitungBidang {
    int panjang;
    int lebar;
    int tinggi;

    public PersegiPanjang(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    public int bidangPersegiPanjang() {
        return panjang*lebar;
    }

    @Override
    public int kelilingPersegiPanjang() {
        return 2*(panjang+lebar);
    }
}
