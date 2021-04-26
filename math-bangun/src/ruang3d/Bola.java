package ruang3d;

import bidang2d.Lingkaran;


public class Bola extends Lingkaran implements Ruang3d {


       public Bola(){
        super();
    }
    
    public Bola(double r) {
        super(r);
    }

    public double hitungLuas() {
        return (4) * super.luas;
    }

    
    public double hitungVolume() {
        return (4 / 3.0) * super.luas * super.r;
    }

}
