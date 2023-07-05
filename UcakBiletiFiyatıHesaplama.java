package Giris;
import java.util.Scanner;
public class UcakBiletiFiyatHesaplama {
    public static void main(String[] args){
        double mesafe, yas, ntutar, yon, yonindirimi, yasindirimi ,yitutar, finaltutar;
        Scanner inp = new Scanner(System.in);
        System.out.print("Mesafeyi km olarak giriniz? ");
        mesafe = inp.nextDouble();
        if (mesafe>0) {
            System.out.print("Yaşınızı giriniz? ");
            yas = inp.nextDouble();

            System.out.print("Yolculuk tipini giriniz; Tek Yön için 1, Gidiş Dönüş için 2: ");
            yon = inp.nextDouble();

            ntutar = mesafe * 0.10;

            if (yas < 12) {
                yasindirimi = ntutar * 0.5;
            } else if (yas >= 12 && yas <= 24) {
                yasindirimi = ntutar * 0.1;
            } else if (yas > 65) {
                yasindirimi = ntutar * 0.3;
            } else {
                yasindirimi = 0;
            }

            yitutar = ntutar - yasindirimi;

            if (yon == 2) {
                yonindirimi = yitutar * 0.2;
                finaltutar = (yitutar - yonindirimi) * 2;
                System.out.println(finaltutar + "TL");
            } else if (yon == 1) {
                yonindirimi = 0;
                System.out.println(yitutar + "TL");
            } else {
                System.out.println("Hatalı giriş yaptınız. Tekrar deneyiniz.");
            }
        }else {
            System.out.println("Hatalı KM girişi yaptınız. Tekrar deneyiniz.");
        }
    }
}
