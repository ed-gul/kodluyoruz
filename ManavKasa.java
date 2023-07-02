package Giris;
import java.util.Scanner;
public class ManavKasa {
    public static void main (String[] args){
        /*
        Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.
    Meyveler ve KG Fiyatları
    Armut : 2,14 TL
    Elma : 3,67 TL
    Domates : 1,11 TL
    Muz: 0,95 TL
    Patlıcan : 5,00 TL
         */
        double armut, elma, domates, muz, patlican, total;

        System.out.print("Kaç kilo elma aldınız?");
        Scanner bir = new Scanner(System.in);
        elma = bir.nextDouble();

        System.out.print("Kaç kilo armut aldınız?");
        Scanner iki = new Scanner(System.in);
        armut = iki.nextDouble();

        System.out.print("Kaç kilo domates aldınız?");
        Scanner uc = new Scanner(System.in);
        domates = uc.nextDouble();

        System.out.print("Kaç kilo muz aldınız?");
        Scanner dort = new Scanner(System.in);
        muz = dort.nextDouble();

        System.out.print("Kaç kilo patlıcan aldınız?");
        Scanner bes = new Scanner(System.in);
        patlican = bes.nextDouble();

        total=(elma*3.67)+(armut*2.14)+(domates*1.11)+(muz*0.95)+(patlican*5);
        System.out.print("Toplam Tutar: "+total);

    }
}
