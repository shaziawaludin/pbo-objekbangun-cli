package ruang3d;


public final class JuringBola extends Bola {

    private double tinggi;
    private final double rDasar;

    public JuringBola() {
        super();
        this.tinggi = 10;
        this.rDasar = 10;
    }
    
    public JuringBola(double r, double rDasar, double tinggi) {
        super(r);
        this.tinggi = tinggi;
        this.rDasar = rDasar;
    }

    @Override
    public double hitungLuas() {
        return (2) * Math.PI * super.r * (this.tinggi + this.rDasar);
    }

    @Override
    public double hitungVolume() {
        return (2 / 3.0) * Math.PI * Math.pow(super.r, 2) * this.tinggi;
    }
}
