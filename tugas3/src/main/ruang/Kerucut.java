package ruang;
import bidang.Lingkaran;

public class Kerucut extends Lingkaran{
    double jari;
    double tinggi;

    public Kerucut(double jari, double tinggi) {
        this.jari = jari;
        this.tinggi=tinggi;
    }

    @Override
    public double luasLingkaran(double jari) {
        return super.luasLingkaran(jari);
    }

    public double luasKerucut(){
        double s;
        double jumlah;
        jumlah = (jari*jari)+(tinggi*tinggi);
        s=Math.pow(jumlah,0.5);
        return (getPhi()*jari*s)+luasLingkaran(jari);
    }

    public double volumeKerucut(){
        return luasLingkaran(jari)*tinggi/3;
    }
}
