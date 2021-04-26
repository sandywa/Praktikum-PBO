package ruang;

import bidang.PersegiPanjang;

public class Balok extends PersegiPanjang implements HitungRuang {
    private int tinggi;

    public Balok(int panjang, int lebar, int tinggi) {
        super(panjang, lebar);//mengarah ke conrtuctor persegi panjang
        this.tinggi = tinggi;
    }

    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    @Override
    public double volume() {
        return hitungLuas()*tinggi;
    }

    @Override
    public double luasPermukaan() {
        return ((hitungLuas())+(getLebar()*tinggi)+(getPanjang()*tinggi))*2;
    }
}
