package StringManipulations;

public class EndsWith {
    public static void main(String[] args) {

        String str = "Su an ders dinliyoruz";

        System.out.println(str.endsWith("ruz"));
        System.out.println(str.endsWith("dinliyoruz"));
        System.out.println(str.endsWith("zzZ"));





        String email="bariscanates@gmail.com";
        String arananMetin= "@gmail.com";



        // email.length()-10 burada lenght 1den baslar index 0 dan baslar bunu unutmayalım burada email stringinin
        // lenghtini yani uzunlugunu aldık ve bundan (@gmail.com) -9 (lenght index farki icin) -1 = -10 cikarttik
        // kalanı fromIndex parametresinde kullandık.



        if (!email.contains(arananMetin)){
            System.out.println("lutfen gmail adresi giriniz");
        } else if (email.endsWith(arananMetin)){
            System.out.println("Email adresiniz kaydedildi");
        } else {
            System.out.println("lutfen yazimi kontol edin");
        }






    }
}
