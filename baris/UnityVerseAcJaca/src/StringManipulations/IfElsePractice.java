package StringManipulations;

import java.util.Scanner;

public class IfElsePractice {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.println("Lutfen hava durumunu yaziniz...");
        String havaDurumu = scan.next();
            //  berbat.
        if (havaDurumu.equals("guzel")){
            System.out.println("Ozaman parka gidelim xD");
        }else if (havaDurumu.equals("kotu")){
            System.out.println("O zaman baris hocayla yazilim calisalım!");
        }else {
            System.out.println("Lutfen guzel yada kotu degerini giriniz yanlis deger girmeyiniz...");
        }








    }
}
