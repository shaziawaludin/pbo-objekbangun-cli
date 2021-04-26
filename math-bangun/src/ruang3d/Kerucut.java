package ruang3d;

import bidang2d.Lingkaran;


public class Kerucut extends Lingkaran implements Ruang3d {

    private final double tinggi;

     public Kerucut() {
        super();
        this.tinggi = 10;
    }

    
    public Kerucut(double r, double tinggi) {
        super(r);
        this.tinggi = tinggi;
    }

    @Override
    public double hitungLuas() {
        return super.hitungLuas()
                + ((Math.sqrt((Math.pow(this.r, 2)
                        + Math.pow(this.tinggi, 2))))
                * this.r * Math.PI);
    }

    
    public double hitungVolume() {
        return (1 / 3.0) * Math.PI * this.r * this.r * this.tinggi;
    }

}
