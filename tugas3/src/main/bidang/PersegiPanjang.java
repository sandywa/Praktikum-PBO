
package bidang;

public class PersegiPanjang implements HitungBidangDatar {
    private int panjang;
    private int lebar;

    public PersegiPanjang(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public int getPanjang() {
        return panjang;
    }

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    public int getLebar() {
        return lebar;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    @Override
    public double hitungLuas() {
        return panjang*lebar;
    }

    @Override
    public double hitungKeliling() {
        return (panjang+lebar)*2;
    }
}
