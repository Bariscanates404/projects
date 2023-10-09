package StringManipulations;

import java.util.Scanner;

public class StringManipulationExamples {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // uc farkli sayinin ortalamasini alan bir kod yaziniz.

        double sayi1 = 234234;
        double sayi2 = 2423432;
        double sayi3 = 23234;
        double sayi4 = 23;
        double sayi5 = 2323;

        double toplam = (sayi1 + sayi2 + sayi3 + sayi4 + sayi5) / 5;
        System.out.println("Verilen sayilar toplami: " + toplam);

        //kullanicidan alinan 4 basamaklı bir sayinin her basamagindaki sayilarin toplamini consolda yazdiriniz...

        int sayi = 1989;
        double sayi0 = 1989;
        System.out.println(sayi % 10);
        System.out.println(sayi / 10);
        System.out.println(sayi0 % 10);
        System.out.println(sayi0 / 10);

        int basamaklarToplami = sayi % 10;   //9
        sayi = sayi / 10; //198    9 silindi
        basamaklarToplami = basamaklarToplami + sayi % 10; //17
        sayi = sayi / 10; //19    8 silindi
        basamaklarToplami = basamaklarToplami + sayi % 10; //26
        sayi = sayi / 10; //1    9 silindi
        basamaklarToplami = basamaklarToplami + sayi % 10; //27

        System.out.println("basamaklarToplami: " + basamaklarToplami);


        //galonu litreye litreyi galona çevirebilecegimiz bir kod yazalım.

        System.out.println("galon litre icin \"galon\" yaziniz, litre galon icin \"litre\" yaziniz...");
        String hacimCesidi = scan.next().toLowerCase();
        scan.close();

        //hacim degeri ve hacim cesidinin dogruluguna gore calısan bir nested if else ornegi hazırlayalım

        if (hacimCesidi.equals("galon") && hacimCesidi.equals("litre")) {
            System.out.println("Lutfen hacim degeri giriniz...");
            double hacimDegeri = scan.nextInt();
            if (hacimDegeri <= 0) {
                System.out.println("lutfen rakamsal ve pozitif bir hacim degeri giriniz.");
            } else if (hacimCesidi.equals("galon")) {
                System.out.println("girilen " + hacimDegeri + " galonun litre karşılıgı: " + (hacimDegeri * 3.78) + " litredir.");
            } else if (hacimCesidi.equals("litre")) {
                System.out.println("girilen " + hacimDegeri + " litrenin galon karşılıgı: " + (hacimDegeri / 3.78) + " galondur.");
            }
        } else System.out.println("lutfen gecerli bir hacim cesidi giriniz...");


        //kullanicidan isim ve soyisim girmesini isteyin, girilen stringleri buyuk harflerle yazdırın...
        System.out.println("adiniz ve soyadiniz?");
        String isim = scan.nextLine();
        System.out.println (isim.toUpperCase());


        //kullanıcıdan tek bir islemde isim ve soy isim girmesini isteyin, girilen isim ve soyismi string manipulation methodlarını kullanarak
        //isim: XXX soyisim: XXX şeklinde yazdırınız.
        System.out.println("İsim ve soyisminizi giriniz: ");
        String fullName = scan.nextLine();
        int firstSpace = fullName.indexOf(" ");

        String name1 = fullName.substring(0,firstSpace);
        String lastName1 = fullName.substring(firstSpace+1);
        System.out.println("Name: "+name1+" Last Name: "+lastName1);




    }
}
