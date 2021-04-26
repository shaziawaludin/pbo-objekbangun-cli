package ruang3d;

import bidang2d.Lingkaran;


public class Tabung extends Lingkaran implements Ruang3d {

    private final double tinggi;

     public Tabung() {
        super();
        this.tinggi = 10;
    }
    
    public Tabung(double r, double tinggi) {
        super(r);
        this.tinggi = tinggi;
    }

    public double hitungLuas() {
        double luasSelimut = super.keliling * this.tinggi;
        return 2 * super.luas + luasSelimut;
    }

    public double hitungVolume() {
        return super.luas * this.tinggi;
    }

}
