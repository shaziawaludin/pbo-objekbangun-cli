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
public final class JuringBola extends Bola {

    private double tinggi;
    private final double rDasar;
    public double luas;
    public double volume;

    public JuringBola(double r, double rDasar, double tinggi) {
        super(r);
        this.tinggi = tinggi;
        this.rDasar = rDasar;
        this.luas = this.hitungLuas();
        this.volume = this.hitungVolume();
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
