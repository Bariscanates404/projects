package StringManipulations;

public class Substring {
    public static void main(String[] args) {

        String isim="baris can ates";
                  // 0123456789

        System.out.println("baris can ates".substring(10));
        System.out.println(isim.substring(6));
        System.out.println(isim.substring(5));


        String str2="5";

        int sayi2=Integer.valueOf(str2);
        System.out.println(sayi2);


        // 1-48 of 104 results for "nutella"
        // bu arama sonucundaki bulunan sonuc sayisi 100'den cok ise super
        // az ise "az sonuc bulundu"


        String str="1-48 of 100 results for \"java\"";

        int ilkSpace= str.indexOf(" "); // 4
        int ikinciSpace= str.indexOf(" ", ilkSpace+1);
        int ucuncuSpace= str.indexOf(" ",ikinciSpace+1);

        String aramaSonucSayisiStr = str.substring(ikinciSpace+1,ucuncuSpace); //  .734

        int aramaSonucSayisiInt=Integer.valueOf(aramaSonucSayisiStr);

        if (aramaSonucSayisiInt>100){
            System.out.println("Super");
        } else {
            System.out.println("az sonuc bulundu");
        }





    }
}
