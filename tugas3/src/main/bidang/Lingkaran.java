package bidang;

public class Lingkaran implements HitungBidangDatar{ //harusnya implement ke hitung bidang
//    double phi=3.14;
//    public double getPhi() {
//        return phi;
//    }
    private double jari; //karena di private pakai setter getter untuk mengakses (ex username password)

    public Lingkaran(double jari) {
        this.jari = jari;
    }

    public double getJari() {
        return jari;
    }

    public void setJari(double jari) {
        this.jari = jari;
    }

    @Override
    public double hitungLuas() {
        return Math.PI*jari*jari;
    }

    @Override
    public double hitungKeliling() {
        return Math.PI*2*jari;
    }
}
