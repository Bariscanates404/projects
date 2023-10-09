package MethodCreation;

import java.util.Scanner;

import static MethodCreation.ReusableMethods.galonLiterConverter;
import static MethodCreation.ReusableMethods.harfleriTersineCevir;

public class MethodCreationExamples {
    public static void main(String[] args) {


        //galonu litreye litreyi galona çevirebilecegimiz bir kod yazalım.
        Scanner scan = new Scanner(System.in);
        System.out.println("galon litre icin \"galon\" yaziniz, litre galon icin \"litre\" yaziniz...");
        String hacimCesidi = scan.next().toLowerCase();
        System.out.println("Lutfen hacim degeri giriniz...");
        int hacimDegeri = scan.nextInt();
        galonLiterConverter(hacimCesidi, hacimDegeri);

        System.out.println("Lutfen bir kelime giriniz");
        String kelime=scan.next();

        harfleriTersineCevir(kelime);


        //verilen iki rakamı toplayıp 2 ile carpan bir method olusturunuz ve sonucu konsola yazdırınız.

        //verilen iki stringi concatinate ederek consola yazdırınız.

        //haftanın gununu string olarak vereceginiz bir method olusuturunuz bu method haftaici mi haftasonu mu oldugunu consola yazdırsın.



        verilenRakamlariToplaVeIkiIleCarp(33,456);


    }

    public static void verilenRakamlariToplaVeIkiIleCarp(int rakam1,int rakam2){
        System.out.println((rakam1+rakam2)*2);
    }




}
