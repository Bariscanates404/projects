package Scope;

public class InstanceVariables {
    int sayi;
    String instructorName="baris can ates";
    boolean ogrendikMi;


    public static void main(String[] args) {

        //Instance Variablelarina diger bir degisle class scopundaki variablelara ulaşmak için obje oluşmak zorundayız.
        //bu obje "classin tam adi" "objeye verecegimiz isim" = new "classin tam adi"; Syntaxı kullanilarak olusuturulur.
        InstanceVariables classObj = new InstanceVariables();

        System.out.println(classObj.sayi);
        classObj.sayi = 5;
        System.out.println(classObj.sayi);

        System.out.println( classObj.instructorName);

        System.out.println(classObj.ogrendikMi);
        classObj.ogrendikMi=true;
        System.out.println(classObj.ogrendikMi);

        classObj.staticOlmayanMethod();

    }

    public void staticOlmayanMethod() {
        System.out.println(sayi);

        for (int i = 0; i < sayi; i++) {
            System.out.println(sayi);

        }



    }

}
