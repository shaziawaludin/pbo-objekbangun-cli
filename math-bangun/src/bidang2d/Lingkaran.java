package bidang2d;

public class Lingkaran implements Bidang2d{
    public double luas;
    public double r;
    public double keliling;
    
     public Lingkaran(){
        this.r = 10;
        this.luas = this.hitungLuas();
        this.keliling = this.hitungKeliling();
    }
     
    public Lingkaran(double r){
        this.r = r;
        this.luas = hitungLuas();
        this.keliling = hitungKeliling();
    }


    public double hitungLuas() {
        return Math.pow(this.r, 2) * Math.PI;
    }

    public double hitungKeliling() {
        return 2.0*Math.PI*this.r;
    }
    
    
}
