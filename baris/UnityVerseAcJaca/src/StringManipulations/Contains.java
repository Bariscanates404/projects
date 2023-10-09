package StringManipulations;

public class Contains {
    public static void main(String[] args) {

        String str = "Su an ders dinliyoruz";
        String str2 = "Girmis oldugunuz Email adresiniz gecerli bir email adresi degildir, lutfen gecerli bir email adresi giriniz. ";

        System.out.println(str.contains("An"));  //  stringler case sensitive dir bu nedenle buyuk kucuk harflere dikkat etmeliyiz.
        // "An" ile "an" farkli stringlerdir. bu nedenle methodumuz bize false dondurur.

        System.out.println(str2.contains("Email")); // true

        System.out.println(str2.contains("ders dinleme devam ediyoruz")); //false

        System.out.println(str2.contains("bi")); //true

        System.out.println(str2.contains("e-mail"));  //false


        //kullanıcıdan email adresini girmesini isteyiniz bu emailin sonu @gmail.com ile bitiyormu onu kontrol edin
        //bu email @gmail.com degil ise "lütfen doğru bir @gmail.com hesabi giriniz diyelim."
        //eğer gmail.com eceriyorsa girilen emailin sonu @gmail.com ise "girilen email adresi" basari ile kayit edilmistir.
        //eğer bu emailin sonunda @gmail.com yok ise "lutfen emailinizi kontrol ediniz." yazdiralim.

        String email="bariscanates@gmail.com";
        String arananMetin= "@gmail.com";


        // email.length()-10 burada lenght 1den baslar index 0 dan baslar bunu unutmayalım burada email stringinin
        // lenghtini yani uzunlugunu aldık ve bundan (@gmail.com) -9 (lenght index farki icin) -1 = -10 cikarttik
        // kalanı fromIndex parametresinde kullandık.


        if (!email.contains(arananMetin)){
            System.out.println("lutfen gmail adresi giriniz");
        } else if(email.indexOf(arananMetin)==(email.length()-10)){
            System.out.println("Email adresiniz kaydedildi ");
        } else {
            System.out.println("lutfen yazimi kontol edin");
        }


        if (!email.contains(arananMetin)){
            System.out.println("lutfen gmail adresi giriniz");
        } else if (email.endsWith(arananMetin)){
            System.out.println("Email adresiniz kaydedildi");
        } else {
            System.out.println("lutfen yazimi kontol edin");
        }





    }
}
