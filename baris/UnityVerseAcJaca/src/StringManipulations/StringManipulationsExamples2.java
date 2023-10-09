package StringManipulations;

import java.sql.SQLOutput;
import java.util.Scanner;

public class StringManipulationsExamples2 {
    public static void main(String[] args) {


        // $13.73  $10.97 verilen rakamları toplayınız... double sayi1= Double.parseDouble(str1); ile stryi double a donusturebilirsiniz.
        // sonuc: $24.7

        String dolar1="$13.73";
        String dolar2="$10.97";

        dolar1=dolar1.replace("$", "");
        dolar2=dolar2.replace("$", "");

        double sayi1=Double.parseDouble(dolar1);
        double sayi2=Double.parseDouble(dolar2);


        double sayilarToplami = sayi1+sayi2;  //24.7

        String sonuc="$"+sayilarToplami;
        System.out.println(sonuc);



        // kullanicidan bir kelime isteyin, eger kelime 3 veya daha fazla harften olusuyorsa son iki harfini 3 kere yanyana
        // string olarak yazdirin. degil ise girilen kelimeyi yazdirin.
        //kelime: baris sonuc: risrisris

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir string giriniz...");
        String str1 = scan.next();
        String strSonIkiHarf= str1.substring(str1.length()-2);

        if (str1.length() >= 3){
            System.out.println(strSonIkiHarf+strSonIkiHarf+strSonIkiHarf);
        }else {
            System.out.println(str1);
        }

        //kullanicidan kelime ayrı ayrı girmesini isteyin, kelimeleri yan yana tek bir string içerisine koyup en sonuna . nokta koyun ve yazdırın.





    }
}
