package Giris;
import java.util.Scanner;
public class SinifGecmeDurumu {
    public static void main(String[] args)
    {
        /*
        #Videodaki kısım aşağıdadır.

        int mat,fizik, turkce, kimya, muzik;

        Scanner input = new Scanner(System.in);
        System.out.println("Mat. notunuz?");
        mat = input.nextInt();
        System.out.println("Turkce notunuz?");
        turkce = input.nextInt();
        System.out.println("Fizik notunuz?");
        fizik = input.nextInt();
        System.out.println("Kimya notunuz?");
        kimya = input.nextInt();
        System.out.println("Müzik notunuz?");
        muzik = input.nextInt();

        double ort = (mat+turkce+fizik+kimya+muzik)/5;
        System.out.println("Ortalamanız :" +ort);

        if (ort<=55)
        {
            System.out.println("Sınıfta kaldınız. Seneye tekrar görüşmek üzere.");
        }
        else
        {
            System.out.println("Tebrikler sınıfı geçtiniz!");
        }

        #Ödev:Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.
        */

        int mat,fizik, turkce, kimya, muzik;
        Scanner input = new Scanner(System.in);

        System.out.println("Mat. notunuz?");
        mat = input.nextInt();
        if (mat<0 || mat>100)
        {
            System.out.println("Geçersiz bir değer girdiniz. Tekrar giriniz.");
            mat = input.nextInt();
        }

        System.out.println("Türkçe notunuz?");
        turkce = input.nextInt();
        if (turkce<0 || turkce>100)
        {
            System.out.println("Geçersiz bir değer girdiniz. Tekrar giriniz.");
            turkce = input.nextInt();
        }

        System.out.println("Fizik notunuz?");
        fizik = input.nextInt();
        if (fizik<0 || fizik>100)
        {
            System.out.println("Geçersiz bir değer girdiniz. Tekrar giriniz.");
            fizik = input.nextInt();
        }

        System.out.println("Kimya notunuz?");
        kimya = input.nextInt();
        if (kimya<0 || kimya>100)
        {
            System.out.println("Geçersiz bir değer girdiniz. Tekrar giriniz.");
            kimya = input.nextInt();
        }

        System.out.println("Müzik notunuz?");
        muzik = input.nextInt();
        if (muzik<0 || muzik >100)
        {
            System.out.println("Geçersiz bir değer girdiniz. Tekrar giriniz.");
            muzik = input.nextInt();
        }

        double ort = (mat+turkce+fizik+kimya+muzik)/5;
        System.out.println("Ortalamanız :" +ort);

        if (ort<=55)
        {
            System.out.println("Sınıfta kaldınız. Seneye tekrar görüşmek üzere.");
        }
        else
        {
            System.out.println("Tebrikler sınıfı geçtiniz!");
        }

    }
}
