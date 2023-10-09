package StringManipulations;

import java.util.Scanner;

public class IndexOf {
    public static void main(String[] args) {

        String str1 = "Java ogrenmek cok ama cok guzel ve kolay";

        System.out.println(str1.indexOf("X"));  //verilen degerin bulunamaması durumunda indexof methodu -1 doner bu bulunamadi demektir.

        System.out.println(str1.indexOf('J'));  //indexler 0dan baslar J ilk karakterimiz oldugu icin 0 dondu.
        System.out.println(str1.indexOf("J"));

        System.out.println(str1.indexOf("c")); // birinci c nin indexi 14. ikinci kullanilan c ye bakmiyoruz henüz.
        System.out.println(str1.indexOf("y")); // y nin ilk kullanildigi yerin indexi 39.
        System.out.println(str1.length() - 1);   // (lenght()-1) bize index numarasını verir cunku length saymaya 1 den baslar index 0 dan baslar.
        System.out.println(str1.indexOf("guzel")); //burada verilen bir kelimenin ilk baslangıc karakterinin indexini verdi.

        //aynı karakterden birden fazla varsa ikinciyi nasil buluruz?
        System.out.println(str1.indexOf("c", 16)); // bu kodu kullanarak bir string icerisinde birden fazla bulunan bir karakterin ikincisini bulduk
        //bu islemi yaparken neye dikakt etmeliyiz, fromindex argumanına en az birinci karakterin indexi+1 sayısını vermeliyiz.


        //FromIndex nedir: indexof methodu sifirinci indexten baslayarak ilk buldugu benzerligin indexini bize dondurur bu sebepten dolayi
        //eger birden fazla ayni benzer char string ve benzerleri varsa digelerine ulasmak icin fromindex argumaninin kullaniriz. Bu argumana
        //verdigimiz int degeri o stringde aramaya baslangic noktasi alir ve oradan itibaren aramaya baslar.
        int ilkIndexOfC = str1.indexOf("c");    // int bir degisken olusturduk ve bu degiskenin icerisine str1 stringinin icerisinde bukunan
        // ilk c harfinin index numarasını aldık ve atama yaptık.
        int ikinciIndexOfC = str1.indexOf("c", ilkIndexOfC + 1); //bu satirda int ikinci bir degisken olusturduk ve buna mantıklı bir
        // isim vermeye calistik, ikinciIndexOfC ismini verdik ve atamay yaptıgımız kısımda str1 stringi icerisinde bulunan ikinci c harfinin
        //indexini bize donen bir kod yazdık ve bunu atadik.
        System.out.println(ikinciIndexOfC);

        //kullanicidan bir email girmesini isteyin ve bu email @gmail.com yada @yahoo.com dışında bir email ise yanlis bir email girilmistir diyelim.
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir email giriniz...");
        String email = scan.next().toLowerCase();

        if (email.indexOf("@yahoo.com") == -1 && email.indexOf("@gmail.com") == -1) {
            System.out.println("Yanlis bir email girdiniz... Lutfen tekrar deneyiniz!");
        } else if (email.indexOf("@yahoo.com") != -1) {
            System.out.println("@yahoo.com bir email girdiniz!");
        } else if (email.indexOf("@gmail.com") != -1) {
            System.out.println("Dogru bir email girdiniz!");
        }


        // Odev :)
        // verilen email Stringi "@" içeriyorsa gecerli icermiyorsa gecersiz bir email yazdıralım.


        // Odev :)
        // Kullanicidan bir cumle ve bir kelime isteyin, kelimenin cumledeki kullanimina bakarak asagidaki 3 cumleden uygun olani yazdirin
        //		- Girilen kelime cumlede kullanilmamis.
        //		- Girilen kelime cumlede 1 kere kullanilmis.
        //		- Girilen kelime cumlede 1’den fazla kullanilmis.



        String cumle = "Java ogren,yeni program ile yeni bir sayfa ac";
        String kelime= "yeni";

        int ilkKullanim=cumle.indexOf(kelime); // -1 veya index  12
        int ikinciKullanim= cumle.indexOf(kelime, ilkKullanim+1);

        if (ilkKullanim==(-1)){
            System.out.println("Girilen kelime cumlede kullanilmamis.");

        } else if(ikinciKullanim==(-1)){
            System.out.println("Girilen kelime cumlede 1 kere kullanilmis.");

        } else{
            System.out.println("Girilen kelime cumlede 1’den fazla kullanilmis.");
        }




    }
}
