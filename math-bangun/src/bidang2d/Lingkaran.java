package bidang2d;

public class Lingkaran implements Bidang2d{
    public double luas;
    public double r;
    public double keliling;
    
     public Lingkaran(){
        this.r = 10;
        this.luas = hitungLuass();
        this.keliling = hitungKeliling();
//        this.hitungLuass();
//        hitungKeliling();
    }
     
    public Lingkaran(double r){
        this.r = r;
        this.luas = hitungLuass();
        this.keliling = hitungKeliling();
//        this.hitungLuass();
//        hitungKeliling();
    }

//    @Override
//    public final void hitungLuass() {
//        this.luas = Math.pow(this.r, 2) * Math.PI;
//    } 
    
    @Override
    public final double hitungLuass() {
        return Math.pow(this.r, 2) * Math.PI;
    }

    @Override
    public final double hitungKeliling() {
        return 2.0*Math.PI*this.r;

//    @Override
//    public final void hitungKeliling() {
//        this.keliling =  2.0*Math.PI*this.r;
}
    
    
}
