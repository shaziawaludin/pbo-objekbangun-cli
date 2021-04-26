package ruang3d;


public class CincinBola extends Bola {

    private final double rDasar;
    private final double rAtas;
    private final double pTaliBusur;
    private final double tinggi;

    public CincinBola() {
        super();
        this.tinggi = 10;
        this.rDasar = 10;
        this.rAtas = 10;
        this.pTaliBusur = 10;
    }

    public CincinBola(double r,
            double rDasar,
            double rAtas,
            double pTaliBusur,
            double tinggi) {

        super(r);
        this.tinggi = tinggi;
        this.rDasar = rDasar;
        this.rAtas = rAtas;
        this.pTaliBusur = pTaliBusur;
    }

    @Override
    public double hitungLuas() {
        double luasLuar = 2 * Math.PI * super.r * this.tinggi;
        double luasDalam = Math.PI * pTaliBusur * (this.rDasar + this.rAtas);
        return luasLuar + luasDalam;
    }

    @Override
    public double hitungVolume() {
        return (1 / 6.0) * Math.PI * super.r * Math.pow(this.pTaliBusur, 2);
    }
}
