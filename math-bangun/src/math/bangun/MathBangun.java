package math.bangun;

import bidang2d.Lingkaran;
import java.util.Scanner;
import ruang3d.*;

public class MathBangun {

    public static void main(String[] args) {
        char menu;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("<<| MENU |>>");
            System.out.println("1.Bidang 2D");
            System.out.println("2.Ruang 3D");
            System.out.println("0.Exit");
            System.out.print("Pilih: ");
            menu = sc.next().charAt(0);
            System.out.println("\n");

            switch(menu){
                case '1' :{   
                    char bd2;
                    System.out.println("<<| BIDANG 2D |>>");
                    System.out.println("1.Lingkaran");
                    System.out.print("Pilih : ");
                    bd2 = sc.next().charAt(0);
                    System.out.println("\n");
                    if(bd2 == '1'){
                        double r;
                        System.out.println("<<| LINGKARAN |>>");
                        System.out.print("Jejari: ");
                        r = sc.nextDouble();
                        Lingkaran lingkaran = new Lingkaran(r);
                        System.out.println("==[ Hasil ]==");
                        System.out.println("Luas: "+lingkaran.luas);
                        System.out.println("Keliling: "+lingkaran.keliling);
                        System.out.println("\n");
                    }
                break;
                }
                case '2' :{
                    char rg3;
                    System.out.println("<<| RUANG 3D |>>");
                    System.out.println("1.Tabung");
                    System.out.println("2.Kerucut");
                    System.out.println("3.Kerucut Terpancung");
                    System.out.println("4.Bola");
                    System.out.println("5.Tembereng Bola");
                    System.out.println("6.Keratan Bola");
                    System.out.println("7.Cincin Bola");
                    System.out.println("8.Juring Bola");
                    System.out.print("pilih: ");
                    rg3 = sc.next().charAt(0);
                    System.out.println("\n");

                    switch(rg3){
                        case '1':{
                            double r,t;
                            System.out.println("<<| TABUNG |>>");
                            System.out.print("Jejari: ");
                            r = sc.nextDouble();
                            System.out.print("Tinggi: ");
                            t = sc.nextDouble();
                            Tabung tabung = new Tabung(r,t);
                            System.out.println("==[ Hasil ]==");
                            System.out.println("Luas: " + tabung.luas);
                            System.out.println("Volume: " + tabung.volume);
                            System.out.println("\n");
                            break;
                        }
                        case '2':{
                            double r,t;
                            System.out.println("<<| KERUCUT |>>");
                            System.out.print("Jejari: ");
                            r = sc.nextDouble();
                            System.out.print("Tinggi: ");
                            t = sc.nextDouble();
                            Kerucut kerucut = new Kerucut(r, t);
                            System.out.println("==[ Hasil ]==");
                            System.out.println("Luas: " + kerucut.luas);
                            System.out.println("Volume: " + kerucut.volume);
                            System.out.println("\n");
                            break;
                        }
                        case '3':{
                            double r1,r2,t1,t2;
                            System.out.println("<<| KERUCUT TERPANCUNG |>>");
                            System.out.print("Jejari alas: ");
                            r1 = sc.nextDouble();
                            System.out.print("Jejari atas: ");
                            r2 = sc.nextDouble();
                            System.out.print("Tinggi bawah: ");
                            t1 = sc.nextDouble();
                            System.out.print("Tinggi atas: ");
                            t2 = sc.nextDouble();
                            System.out.println("");
                            KerucutTerpancung kT = new KerucutTerpancung(r1, r2, t1, t2);
                            System.out.println("==[ Hasil ]==");
                            System.out.println("Luas: " + kT.luas);
                            System.out.println("Volume: " + kT.volume);
                            System.out.println("\n");
                            break;
                        }
                        case '4':{
                            double r;
                            System.out.println("<<| BOLA |>>");
                            System.out.print("Jejari: ");
                            r = sc.nextDouble();
                            Bola bola = new Bola(r);
                            System.out.println("");
                            System.out.println("==[ Hasil ]==");
                            System.out.println("Luas: " + bola.luas);
                            System.out.println("Volume: " + bola.volume);
                            System.out.println("\n");
                            break;
                        }
                        case '5':{
                            double r,r1,r2,t;
                            System.out.println("<<| TEMBERENG BOLA |>>");
                            System.out.print("Jejari tengah: ");
                            r = sc.nextDouble();
                            System.out.print("Jejari atas: ");
                            r1 = sc.nextDouble();
                            System.out.print("Jejari dasar: ");
                            r2 = sc.nextDouble();
                            System.out.print("Tinggi: ");
                            t = sc.nextDouble();
                            System.out.println("");
                            TemberengBola TBola = new TemberengBola(r,r1,r2,t);
                            System.out.println("==[ Hasil ]==");
                            System.out.println("Luas: " + TBola.luas);
                            System.out.println("Volume: " + TBola.volume);
                            System.out.println("\n");
                            break;
                        }
                        case '6':{
                            double r,r1,r2,t;
                            System.out.println("<<| KERATAN BOLA |>>");
                            System.out.print("Jejari tengah: ");
                            r = sc.nextDouble();
                            System.out.print("Jejari atas: ");
                            r1 = sc.nextDouble();
                            System.out.print("Jejari dasar: ");
                            r2 = sc.nextDouble();
                            System.out.print("Tinggi: ");
                            t = sc.nextDouble();
                            System.out.println("");
                            KeratanBola KBola = new KeratanBola(r, r1, r2, t);
                            System.out.println("==[ Hasil ]==");
                            System.out.println("Luas: " + KBola.luas);
                            System.out.println("Volume: " + KBola.volume);
                            System.out.println("\n");
                            break;
                        }
                        case '7':{
                            double r,r1,r2,t, tb;
                            System.out.println("<<| CINCIN BOLA |>>");
                            System.out.print("Jejari tengah: ");
                            r = sc.nextDouble();
                            System.out.print("Jejari atas: ");
                            r1 = sc.nextDouble();
                            System.out.print("Jejari dasar: ");
                            r2 = sc.nextDouble();
                            System.out.print("Tali Busur: ");
                            tb = sc.nextDouble();
                            System.out.print("Tinggi: ");
                            t = sc.nextDouble();
                            System.out.println("");
                            CincinBola cBola = new CincinBola(r, r1, r2, tb, t);
                            System.out.println("==[ Hasil ]==");
                            System.out.println("Luas: " + cBola.luas);
                            System.out.println("Volume: " + cBola.volume);
                            System.out.println("\n");
                            break;
                        }
                        case '8':{
                            double r,r1,t;
                            System.out.println("<<| JURING BOLA |>>");
                            System.out.print("Jejari: ");
                            r = sc.nextDouble();
                            System.out.print("Jejari Dasar:");
                            r1 = sc.nextDouble();
                            System.out.print("Tinggi: ");
                            t = sc.nextDouble();
                            System.out.println("");
                            JuringBola jBola = new JuringBola(r, r1, t);
                            System.out.println("==[ Hasil ]==");
                            System.out.println("Luas: " + jBola.luas);
                            System.out.println("Volume: " + jBola.volume);
                            System.out.println("\n");
                            break;
                        }
                    }
                }
            }
            System.out.println("\n");
        }while(menu != '0');
    }
}
