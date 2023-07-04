package Giris;

import java.util.Scanner;

public class BurcBulanProgram {
    public static void main (String [] args){
        /*
        Koç Burcu : 21 Mart - 20 Nisan
        Boğa Burcu : 21 Nisan - 21 Mayıs
        İkizler Burcu : 22 Mayıs - 22 Haziran
        Yengeç Burcu : 23 Haziran - 22 Temmuz
        Aslan Burcu : 23 Temmuz - 22 Ağustos
        Başak Burcu : 23 Ağustos - 22 Eylül
        Terazi Burcu : 23 Eylül - 22 Ekim
        Akrep Burcu : 23 Ekim - 21 Kasım
        Yay Burcu : 22 Kasım - 21 Aralık
        Oğlak Burcu : 22 Aralık - 21 Ocak
        Kova Burcu : 22 Ocak - 19 Şubat
        Balık Burcu : 20 Şubat - 20 Mart
        Switch-case kullanmadan yapılacak.
         */
        int month,day,ocak,subat,mart,nisan,mayis,haziran,temmuz,agustos,eylul,ekim,kasim,aralik;
        String burc = "";
        Scanner input = new Scanner(System.in);

        System.out.print("Kaçıncı ay? ");
        month = input.nextInt();
        System.out.println("Gün?");
        day = input.nextInt();

        if (month<13 && month>0 && day<32 && day>0){
            if (month == 1) {
                if (day < 22) {
                    burc = "Oğlak";
                } else {
                    burc = "Kova";
                }
            } else if (month == 2) {
                if (day < 20) {
                    burc = "Kova";
                } else {
                    burc = "Balık";
                }
            } else if (month == 3) {
                if (day < 21) {
                    burc = "Balık";
                } else {
                    burc = "Koç";
                }
            } else if (month == 4) {
                if (day<21){
                    burc = "Koç";
            } else {
                    burc = "Boğa";
                }
            }
            System.out.println("Burcunuz: "+burc);
            // diye diye gidiyor...
        } else {
            System.out.println("Hatalı giriş yaptınız. Tekrar deneyiniz.");
        }
    }
}
