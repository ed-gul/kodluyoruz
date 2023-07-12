package Giris;
import java.util.Scanner;
public class CiftSayiBulma {
    public static void main (String[] args){
       /*
       int k;
       Scanner inp = new Scanner(System.in);
       System.out.print("Sayı giriniz: ");
       k=inp.nextInt();


       for (int i=1; i<=k; i++){
           if (i%2==0) {
               System.out.println(i);
           }
       }

       İki farklı ödev var.
       !!! ÖDEV 1. Yukardakinin aynısını while ile yazmak,
       !!! ÖDEV 2. Ödev girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazmak.
       */

       /*
       # ÖDEV 1

       int k, i=0;
       Scanner inp = new Scanner(System.in);
       System.out.print("Sayı giriniz: ");
       k=inp.nextInt();
       while (i <= k){
           i++;
           if (i%2==0){
               System.out.println(i);
           }
       }
       */

       // # ÖDEV 2

        int k, sayac=0, toplam=0;
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        k=inp.nextInt();

        for (int i=1; i<=k; i++){
            if (i%3==0 && i%4==0) {
                sayac ++;
                toplam += i;
            }
        }
        System.out.println("3'e ve 4'e bölünen sayıların toplamı:" +toplam);
        if (sayac > 0) {
            double ort = toplam / sayac;
            System.out.println("3'e ve 4'e bölünen sayıların ortalaması: " + ort);
        } else {
            System.out.println("Farklı bir sayı deneyiniz.");
        }
    }
}
