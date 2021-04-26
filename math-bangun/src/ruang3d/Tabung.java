/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ruang3d;

import bidang2d.Lingkaran;

/**
 *
 * @author shazi awaludin
 */
public class Tabung extends Lingkaran implements Ruang3d{
    public double luas;
    public double volume;
    private final double tinggi;

    public Tabung(double r, double tinggi) {
        super(r);
        this.tinggi = tinggi;
        this.luas = this.hitungLuas();
        this.volume = this.hitungVolume();
    }
    
    public double hitungLuas() {
        double luasSelimut = super.keliling * this.tinggi;
        return 2*super.luas+luasSelimut;
    }

    public double hitungVolume() {
        return super.luas * this.tinggi;
    }
    
}
