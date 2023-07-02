package Giris;
import java.util.Scanner;
public class HesapMakinesi {
    public static void main(String [] args) {
        int n1,n2,select;

        Scanner input = new Scanner(System.in);
        System.out.print("ilk tam sayıyı giriniz? ");
        n1=input.nextInt();

        Scanner inp = new Scanner(System.in);
        System.out.print("İkinci tam sayıyı giriniz? ");
        n2=inp.nextInt();

        System.out.println("Yapılacak işlemi için seçiniz:\n 1-Toplama\n 2-Çıkarma\n 3-Çarpma\n 4-Bölme");
        select =input.nextInt();

        switch (select){
            case 1:
                System.out.println("Toplam: "+ (n1+n2));
                break;
            case 2:
                System.out.println("Çıkarma: "+ (n1-n2));
                break;
            case 3:
                System.out.println("Çarpma: "+ (n1*n2));
                break;
            case 4:
                if (n2==0){
                    System.out.println("Hata! Bir sayı sıfıra bölünemez.");
                }
                else{
                    System.out.println("Bölme: "+ (n1/n2));
                }
                break;
            default:
                System.out.println("Hatalı giriş yaptınız. Lütfen tekrar deneyiniz.");
        }
    }
}
