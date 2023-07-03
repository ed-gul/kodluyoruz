package Giris;
import java.util.Scanner;
public class HavaSicEtkinlik {
    public static void main(String [] args) {
        /* videodaki içeriktir.

        int sic;

        Scanner input = new Scanner(System.in);
        System.out.println("Sıcaklık ?");
        sic = input.nextInt();

        if (sic<5) {
            System.out.println("Kayak");
        } else if (sic<=25) {
            if (sic<=15) {
                System.out.println("Sinema");
            }
            if (sic>=10){
                System.out.println("Piknik");
            }
        } else {
            System.out.println("Yüzme");
        }

         Ödev aşağıdadır. */

        int sic;
        Scanner input = new Scanner(System.in);
        System.out.println("sıcaklık?");
        sic=input.nextInt();

        if (sic>25) {
            System.out.println("Yüzme");
        }
        if (sic<5) {
            System.out.println("Kayak");
        }
        else if (sic>=5 && sic<=25) {
            if (sic<=15){
                System.out.println("Sinema");
            }
            else {
                System.out.println("Piknik");
            }
        }
    }
}
