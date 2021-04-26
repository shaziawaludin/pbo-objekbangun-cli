package math.bangun;

import bidang2d.Lingkaran;
import java.util.Scanner;
import ruang3d.*;

public class MathBangun {

    public static void main(String[] args) {
        char menu;
        System.out.println("");
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("<<| MENU |>>");
            System.out.println("1.Bidang 2D");
            System.out.println("2.Ruang 3D");
            System.out.println("0.Exit");
            System.out.print("Pilih: ");
            menu = sc.next().charAt(0);
            System.out.println("\n");

            switch (menu) {
                case '1': {
                    char bd2;
                    System.out.println("<<| BIDANG 2D |>>");
                    System.out.println("1.Lingkaran");
                    System.out.print("Pilih : ");
                    bd2 = sc.next().charAt(0);
                    System.out.println("\n");
                    if (bd2 == '1') {
                        Lingkaran lingkaran;
                        double r;
                        System.out.println("<<| LINGKARAN |>>");
                        System.out.print("Jejari: ");
                        try {
                            r = sc.nextDouble();
                            lingkaran = new Lingkaran(r);
                        } catch (Exception e) {
                            System.out.println("Kosong jadi Kami isi otomatis");
                            lingkaran = new Lingkaran();
                            sc.next();
                        }
                        System.out.println("==[ Hasil ]==");
                        System.out.println("Luas: " + lingkaran.luas);
                        System.out.println("Keliling: " + lingkaran.keliling);
                        System.out.println("\n");
                    }
                    break;
                }
                case '2': {
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

                    switch (rg3) {
                        case '1': {
                            double r, t;
                            Tabung tabung;
                            System.out.println("<<| TABUNG |>>");
                            System.out.println("Jejari: ");
                            try {
                                r = sc.nextDouble();
                                System.out.println("Tinggi: ");
                                t = sc.nextDouble();
                                tabung = new Tabung(r, t);
                            } catch (Exception e) {
                                System.out.println("Kosong jadi Kami isi otomatis");
                                tabung = new Tabung();
                                sc.next();
                            }
                            System.out.println("==[ Hasil ]==");
                            System.out.println("Luas: " + tabung.hitungLuas());
                            System.out.println("Volume: " + tabung.hitungVolume());
                            System.out.println("\n");
                            break;
                        }
                        case '2': {
                            double r, t;
                            Kerucut kerucut;
                            System.out.println("<<| KERUCUT |>>");
                            try {
                                System.out.print("Jejari: ");
                                r = sc.nextDouble();
                                System.out.print("Tinggi: ");
                                t = sc.nextDouble();
                                kerucut = new Kerucut(r, t);
                            } catch (Exception e) {
                                System.out.println("Kosong jadi Kami isi otomatis");
                                kerucut = new Kerucut();
                                sc.next();
                            }
                            System.out.println("==[ Hasil ]==");
                            System.out.println("Luas: " + kerucut.hitungLuas());
                            System.out.println("Volume: " + kerucut.hitungVolume());
                            System.out.println("\n");
                            break;
                        }
                        case '3': {
                            double r1, r2, t1, t2;
                            KerucutTerpancung kT;
                            System.out.println("<<| KERUCUT TERPANCUNG |>>");
                            try {
                                System.out.print("Jejari alas: ");
                                r1 = sc.nextDouble();
                                System.out.print("Jejari atas: ");
                                r2 = sc.nextDouble();
                                System.out.print("Tinggi bawah: ");
                                t1 = sc.nextDouble();
                                System.out.print("Tinggi atas: ");
                                t2 = sc.nextDouble();
                                System.out.println("");
                                kT = new KerucutTerpancung(r1, r2, t1, t2);
                            } catch (Exception e) {
                                System.out.println("Kosong jadi Kami isi otomatis");
                                kT = new KerucutTerpancung();
                                sc.next();
                            }
                            System.out.println("==[ Hasil ]==");
                            System.out.println("Luas: " + kT.hitungLuas());
                            System.out.println("Volume: " + kT.hitungVolume());
                            System.out.println("\n");
                            break;
                        }
                        case '4': {
                            double r;
                            Bola bola;
                            System.out.println("<<| BOLA |>>");
                            System.out.print("Jejari: ");
                            try {
                                r = sc.nextDouble();
                                bola = new Bola(r);
                            } catch (Exception e) {
                                System.out.println("Kosong jadi Kami isi otomatis");
                                bola = new Bola();
                                sc.next();
                            }
                            System.out.println("");
                            System.out.println("==[ Hasil ]==");
                            System.out.println("Luas: " + bola.hitungLuas());
                            System.out.println("Volume: " + bola.hitungVolume());
                            System.out.println("\n");
                            break;
                        }
                        case '5': {
                            double r,r2, t;
                            TemberengBola TBola;
                            System.out.println("<<| TEMBERENG BOLA |>>");
                            try {
                                System.out.print("Jejari tengah: ");
                                r = sc.nextDouble();
                                System.out.print("Jejari dasar: ");
                                r2 = sc.nextDouble();
                                System.out.print("Tinggi: ");
                                t = sc.nextDouble();
                                System.out.println("");
                                TBola = new TemberengBola(r, r2, t);
                            } catch (Exception e) {
                                System.out.println("Kosong jadi Kami isi otomatis");
                                TBola = new TemberengBola();
                                sc.next();
                            }
                            System.out.println("==[ Hasil ]==");
                            System.out.println("Luas: " + TBola.hitungLuas());
                            System.out.println("Volume: " + TBola.hitungVolume());
                            System.out.println("\n");
                            break;
                        }
                        case '6': {
                            double r, r1, r2, t;
                            KeratanBola KBola;
                            System.out.println("<<| KERATAN BOLA |>>");
                            try {
                                System.out.print("Jejari tengah: ");
                                r = sc.nextDouble();
                                System.out.print("Jejari atas: ");
                                r1 = sc.nextDouble();
                                System.out.print("Jejari dasar: ");
                                r2 = sc.nextDouble();
                                System.out.print("Tinggi: ");
                                t = sc.nextDouble();
                                System.out.println("");
                                KBola = new KeratanBola(r, r1, r2, t);
                            } catch (Exception e) {
                                System.out.println("Kosong jadi Kami isi otomatis");
                                KBola = new KeratanBola();
                                sc.next();
                            }
                            System.out.println("==[ Hasil ]==");
                            System.out.println("Luas: " + KBola.hitungLuas());
                            System.out.println("Volume: " + KBola.hitungVolume());
                            System.out.println("\n");
                            break;
                        }
                        case '7': {
                            double r, r1, r2, t, tb;
                            CincinBola cBola;
                            System.out.println("<<| CINCIN BOLA |>>");
                            try {
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
                                cBola = new CincinBola(r, r1, r2, tb, t);
                            } catch (Exception e) {
                                System.out.println("Kosong jadi Kami isi otomatis");
                                cBola = new CincinBola();
                                sc.next();
                            }
                            System.out.println("==[ Hasil ]==");
                            System.out.println("Luas: " + cBola.hitungLuas());
                            System.out.println("Volume: " + cBola.hitungVolume());
                            System.out.println("\n");
                            break;
                        }
                        case '8': {
                            double r, r1, t;
                            JuringBola jBola;
                            System.out.println("<<| JURING BOLA |>>");
                            try {
                                System.out.print("Jejari: ");
                                r = sc.nextDouble();
                                System.out.print("Jejari Dasar:");
                                r1 = sc.nextDouble();
                                System.out.println("Tinggi: ");
                                t = sc.nextDouble();
                                System.out.println("");
                                jBola = new JuringBola(r, r1, t);
                            } catch (Exception e) {
                                System.out.println("Kosong jadi Kami isi otomatis");
                                jBola = new JuringBola();
                                sc.next();
                            }
                            System.out.println("==[ Hasil ]==");
                            System.out.println("Luas: " + jBola.hitungLuas());
                            System.out.println("Volume: " + jBola.hitungVolume());
                            System.out.println("\n");
                            break;
                        }
                    }
                }
            }
            System.out.println("\n");
        } while (menu != '0');
    }
}
