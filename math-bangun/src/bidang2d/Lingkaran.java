/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bidang2d;

/**
 *
 * @author shazi awaludin
 */
public class Lingkaran implements Bidang2d{
    public double luas ;
    public double r;
    public double keliling;
    
    public Lingkaran(double r){
        this.r = r;
        this.luas = hitungLuass();
        this.keliling = hitungKeliling();
    }

    @Override
    public final double hitungLuass() {
        return Math.pow(this.r, 2) * Math.PI;
    }

    @Override
    public final double hitungKeliling() {
        return 2.0*Math.PI*this.r;
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
}
    
    
}
