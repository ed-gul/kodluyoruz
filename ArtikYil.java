package Giris;

import java.util.Scanner;

public class ArtikYil {
    public static void main (String [] args){
        int sene;
        Scanner inp = new Scanner(System.in);
        System.out.print("Sene giriniz? ");
        sene = inp.nextInt();
        /*
        Genel bir kural olarak, artık yıllar 4 rakamının katı olan yıllardır:
        1988, 1992, 1996, 2000, 2004, 2008, 2012, 2016, 2020, 2024 gibi.
        100'ün katı olan yıllardan sadece 400'e kalansız olarak bölünebilenler artık yıldır:
        Örneğin 1200, 1600, 2000 yılları artık yıldır ancak 1700, 1800 ve 1900 artık yıl değildir.
         */

        if (sene%4==0 && sene%100!=0 || sene%400==0){
            System.out.println("Artık yıldır!");
        } else {
            System.out.println("Artık yıl değildir!");
        }
    }
}
