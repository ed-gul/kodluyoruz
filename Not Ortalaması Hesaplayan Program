

package Giris;

import java.util.Scanner;

public class Not_Ort_Hesaplama {
    public static void main(String[] args) {
    // Değişkenleri oluştur.
        int mat,fizik,kimya,turkce,muzik;
        Scanner inp = new Scanner(System.in);
    //Scanner sınıfı tanımlandı.
    //kullanıcıdan değerleri al.

        System.out.println("Matematik Notunuz: ");
        mat = inp.nextInt();

        System.out.println("Türkçe Notunuz: ");
        turkce=inp.nextInt();

        System.out.println("Fizik Notunuz: ");
        fizik= inp.nextInt();

        System.out.println("Kimya Notnuz: ");
        kimya=inp.nextInt();

        System.out.println("Müzik Notunuz: ");
        muzik=inp.nextInt();

        int toplam = (mat+turkce+fizik+kimya+muzik);
        double sonuc=toplam/5.0;
        System.out.println("Not Ortalamanız: "+sonuc);
        //ortalama 60'dan yüksekse geçtiniz düşükse kaldınız yazısı çıkartacağız.
        int gecernot = 60;
        boolean a = sonuc >= gecernot;
        String sonuc2 = a ? "Tebrikler Ortalama Üstündesiniz." : "Maalesef Ortalama Altındasınız.";
        System.out.println(sonuc2);


    }
}

