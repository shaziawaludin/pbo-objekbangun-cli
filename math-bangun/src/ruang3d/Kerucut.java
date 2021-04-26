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
public class Kerucut extends Lingkaran implements Ruang3d{
    private final double tinggi;
    public double r = super.r;
    public double luas;
    public double volume;
    public Kerucut(double r, double tinggi){
        super(r);
        this.tinggi = tinggi;
        this.luas = this.hitungLuas();
        this.volume = this.hitungVolume();
    }
    
    @Override
    public double hitungLuas() {
        return super.hitungLuass() 
                + ((Math.sqrt((Math.pow(this.r,2)
                        +Math.pow(this.tinggi,2))))
                *this.r*Math.PI);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double hitungVolume() {
        return (1/3.0) * Math.PI*this.r*this.r*this.tinggi;
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
