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
public class TemberengBola extends Bola {

    private final double rDasar;
    private final double rAtas;
    public double luas;
    public double volume;
    private double tinggi;

    public TemberengBola(double r, double rAtas, double rDasar, double tinggi) {
        super(r);
        this.tinggi = tinggi;
        this.rDasar = rDasar;
        this.rAtas = rAtas;
        this.luas = this.hitungLuas();
        this.volume = this.hitungVolume();
    }

    @Override
    public double hitungLuas() {
        double luasDasar = 2 * Math.PI * super.r * this.tinggi;
        double luasSelimut = Math.PI * Math.pow(this.rDasar, 2);
        return luasDasar + luasSelimut;
    }

//    @Override
//    public double hitungVolume() {
//       return (1/6.0) * Math.PI * this.tinggi * (Math.pow(this.rDasar, 2) + Math.pow(this.rAtas, 2) + Math.pow(this.tinggi, 2));
//    }
    @Override
    public double hitungVolume() {
        return (1 / 3.0) * Math.PI * Math.pow(this.tinggi, 2) * (super.r * 3 - this.tinggi);
    }
}
