package StringManipulations;

public class IndexOf_practice {
    public static void main(String[] args) {

        String cumleninTamami = "Ali ata bak";
                            //   012345678910


        System.out.println(cumleninTamami.indexOf("at")); //4
        System.out.println(cumleninTamami.indexOf("ba")); //8
        System.out.println(cumleninTamami.indexOf("At")); //-1   cunku aranan metin verilen metin icerisinde yoktur.
        ///////////////////////
        System.out.println(cumleninTamami.indexOf("a",9));  //bak metinindeki a harfi 9. indextir biz fromindex 9 dan itibaren
        //aradigimizda ayni a harfine direkt olarak ulasir ve bize sonuc olarak a nin bulundugunu doner index olarakta en son verdigimiz 9 olur.


        int ilkStrIndex = cumleninTamami.indexOf("ata");  //ilkStrIndex = 4
        System.out.println(cumleninTamami.indexOf("a",ilkStrIndex+1));  //6
        int ikinciStrIndex=cumleninTamami.indexOf("a",ilkStrIndex+1);  //ikinciStrIndex = 6
        System.out.println(cumleninTamami.indexOf("a",ikinciStrIndex+1));  //9









    }
}
