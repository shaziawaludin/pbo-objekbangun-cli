/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ruang3d;

/**
 *
 * @author shazi awaludin
 */
public class CincinBola extends Bola {

    private final double rDasar;
    private final double rAtas;
    private final double pTaliBusur;
    private final double tinggi;
    public double luas;
    public double volume;

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
        this.luas = this.hitungLuas();
        this.volume = this.hitungVolume();
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
