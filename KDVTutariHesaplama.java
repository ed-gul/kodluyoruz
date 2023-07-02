import java.util.Scanner;

public class KdvTutariHesaplama {
    public static void main(String[] args) {
    /*
    Fiyatı girilen ürünün KDV hariç fiyatını ve kdv oranını yazdıracağız.(kdv %18, kdvsiz 10, kdvli 11.8)
     */
        Scanner inp = new Scanner(System.in);
        System.out.print("Satın aldığınız ürünün fiyatını giriniz: ");
        Double para = inp.nextDouble();

        double kdv = para >= 1000 ? 0.08 : 0.18;
        double kdvTutar = para * kdv;
        double kdvliTutar = para + kdvTutar;

        System.out.println("kdv oranı "+ kdv);
        System.out.println("kdv tutarı "+ kdvTutar);
        System.out.println("kdv dahil ücret "+ kdvliTutar);
        System.out.println("kdv hariç ücret "+ para);


    }
}
