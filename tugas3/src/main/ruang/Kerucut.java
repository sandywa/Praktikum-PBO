package ruang;
import bidang.Lingkaran;

public class Kerucut extends Lingkaran implements HitungRuang{
    private double tinggi;

    public Kerucut(double jari, double tinggi) {
        super(jari);
        this.tinggi = tinggi;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double sisiMiring(){
        double jumlah=getJari()*getJari()+getTinggi()*getTinggi();
        double s=Math.sqrt((jumlah));
        return s;
    }

    @Override
    public double volume() {
        return hitungLuas()*tinggi/3;
    }

    @Override
    public double luasPermukaan() {
        return Math.PI*getJari()*(getJari()+sisiMiring());
    }
}
