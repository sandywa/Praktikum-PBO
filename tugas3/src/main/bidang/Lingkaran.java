package bidang;

public class Lingkaran {
    double phi=3.14;
    public double getPhi() {
        return phi;
    }
    public double luasLingkaran(double jari){
        return jari*jari*getPhi();
    }
    public double kelilingLingkaran(double jari){
        return jari*2*getPhi();
    }


}
