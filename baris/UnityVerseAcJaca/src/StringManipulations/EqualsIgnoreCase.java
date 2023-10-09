package StringManipulations;

import java.util.Scanner;

public class EqualsIgnoreCase {
    public static void main(String[] args) {

        // basit bir banka uygulamasında işlem yapmaya devam etmek istiyormusunuz sorusuna evet yada hayır ile cevap verildiginde
        // calisacak bir kod yaziniz. evet der ise kullanicinin cevabı + devam etme isteginiz onaylanmistir yazdiralim Hayir icin
        // tam tersini yazdiralim. --- .equalsIgnoreCase() ---


        Scanner scan = new Scanner(System.in);
        System.out.println("Isleme devam etmek istiyor musunuz, evet yada hayir ile cevap veriniz...");
        String cevap=scan.next();

        if (cevap.equalsIgnoreCase("evet")){
            System.out.println("Cevabınız: "+cevap.toLowerCase()+" islem yapmaya devam edebilirsiniz.");
        }else if (cevap.equalsIgnoreCase("hayir")){
            System.out.println("Cevabınız: "+cevap.toLowerCase()+" isleminizi sonlandırıyorum iyi günler.");
        }
        else System.out.println("Hatali bir giris yaptiniz lutfen tekrar deneyiniz...");








    }
}
