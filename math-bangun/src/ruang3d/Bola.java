package ruang3d;

import bidang2d.Lingkaran;


public class Bola extends Lingkaran implements Ruang3d {

    public double luas;
    public double volume;

       public Bola(){
        super();
        this.luas = hitungLuas();
        this.volume = hitungVolume();
    }
    
    public Bola(double r) {
        super(r);
        this.luas = hitungLuas();
        this.volume = hitungVolume();
    }

    @Override
    public double hitungLuas() {
        return (4) * super.luas;
    }

    @Override
    public double hitungVolume() {
        return (4 / 3.0) * super.luas * super.r;
    }

}
