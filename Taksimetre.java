package Giris;

import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        /*
        Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.
    Taksimetre KM başına 2.20 TL tutmaktadır.
    Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
    Taksimetre açılış ücreti 10 TL'dir.
         */

        double km, perKm=2.2, totalPrice, startPrice=10, realTotal;
        Scanner input = new Scanner(System.in);
        System.out.println("Gidilen km? ");
        km = input.nextInt();

        totalPrice=km*perKm;
        realTotal=startPrice+totalPrice;
        
        //double rTot = realTotal<20 ? 20 : realTotal;
        //System.out.println("Ödenecek Ücret " +rTot);
        //veya
        
        realTotal = (realTotal < 20) ? 20 :realTotal;
        System.out.println("Ödenecek Ücret " +realTotal);


    }
}
