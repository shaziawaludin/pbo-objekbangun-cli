package ruang3d;


public class TemberengBola extends Bola {

    private final double rDasar;
    private double tinggi;

    public TemberengBola() {
        super();
        this.tinggi = 10;
        this.rDasar = 10;
    }
    
    public TemberengBola(double r, double rDasar, double tinggi) {
        super(r);
        this.tinggi = tinggi;
        this.rDasar = rDasar;
    }

    @Override
    public double hitungLuas() {
        double luasDasar = 2 * Math.PI * super.r * this.tinggi;
        double luasSelimut = Math.PI * Math.pow(this.rDasar, 2);
        return luasDasar + luasSelimut;
    }
    @Override
    public double hitungVolume() {
        return (1 / 3.0) * Math.PI * Math.pow(this.tinggi, 2) * (super.r * 3 - this.tinggi);
    }
}
