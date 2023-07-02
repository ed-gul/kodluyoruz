
package Giris;
import java.util.Scanner;
public class VucutKitleIndeksiHesaplama {
public static void main(String[] args){
/*
Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın. Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.
Formül: Kilo (kg) / Boy(m) * Boy(m)
Çıktısı:
Lütfen boyunuzu (metre cinsinde) giriniz : 1,72
Lütfen kilonuzu giriniz : 105
Vücut Kitle İndeksiniz : 35.49215792320173
 */
double boy, kilo, indeks;

System.out.print("Lütfen boyunuzu metre cinsinden giriniz? ");
Scanner inp = new Scanner(System.in);
boy = inp.nextDouble();

System.out.print("Lütfen kilonuzu giriniz? ");
Scanner iki = new Scanner(System.in);
kilo = iki.nextDouble();

indeks= kilo / (boy*boy);
System.out.print("Vücut Kitle İndeksiniz: "+indeks);

}
}
