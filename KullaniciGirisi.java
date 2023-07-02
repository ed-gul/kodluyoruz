package Giris;
import java.util.Scanner;
public class KullaniciGirisi {
    public static void main(String[] args) {

        /*

        ###Normal giriş ekranı:

        String userName,password;

        Scanner inp= new Scanner(System.in);

        System.out.println("Kullanıcı adınız? ");
        userName=inp.nextLine();

        System.out.println("Şifreniz? ");
        password=inp.nextLine();
        if (userName.equals("patika") && password.equals("123456")){
            System.out.println("Giriş Yaptınız !");
        } else {
            System.out.println("Hatalı giriş yaptınız !");
        }

        ###Ödev aşağıdaki gibidir:(Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun, eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği ve unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip , şifreler aynı ise ekrana "Şifre oluşturulamadı, lütfen başka şifre giriniz." sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.)

         */

        String userName, password, yeniSifre, yes, no, sonuc;
        Scanner inp = new Scanner(System.in);

        System.out.println("Kullanıcı adınız? ");
        userName = inp.nextLine();

        System.out.println("Şifreniz? ");
        password = inp.nextLine();

        if (userName.equals("patika") && password.equals("123456"))
        {
            System.out.println("Giriş Yaptınız !");

        }
        else if (userName.equals("patika") && !password.equals("123456"))
        {
            System.out.println("Şifreniz Hatalı !\nŞifre sıfırlamak için 'yes' programdan çıkmak için 'no' yazarak enter'a basınız.");
            sonuc = inp.nextLine();
            if (sonuc.equals("yes"))
            {
                System.out.println("Yeni şifrenizi yazınız: ");
                yeniSifre = inp.nextLine();


                if (yeniSifre.equals(password))
                {
                    System.out.println("Şifre oluşurulamadı, lütfen başka şifre giriniz. ");
                    yeniSifre = inp.nextLine();
                }

                else
                {
                    System.out.println("Şifre oluşturuldu.");
                }
            }
            else System.out.println("Çıkış yaptınız.");
        }

    }
}
