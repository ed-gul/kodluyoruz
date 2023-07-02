package Giris;

import java.util.Scanner;

public class DaireDilimiAlaniBulma {
    public static void main(String[] args){
    /*
    Ödev
    Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız. 𝜋 sayısını = 3.14 alınız.
    Formül : (𝜋 * (r*r) * 𝛼) / 360
     */
        double r, pi=3.14, alfa, dilimAlan;
        System.out.print("r değerini giriniz (cm): ");
        Scanner inp = new Scanner(System.in);
        r=inp.nextDouble();

        System.out.print("alfa açısının değerini giriniz: ");
        Scanner inps = new Scanner(System.in);
        alfa=inps.nextDouble();

        dilimAlan= ((pi * (r*r) * alfa) / 360);
        System.out.println("Daire diliminin alanı: "+dilimAlan+" santimetrekare");
    }
}
