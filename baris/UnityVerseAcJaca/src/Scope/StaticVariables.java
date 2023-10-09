package Scope;

public class StaticVariables {

    static String instructorName = "baris can";
    static int dersSaatimiz = 30;
    static boolean ogrendikMi = true;




    public static void main(String[] args) {
        StaticVariables obj=new StaticVariables();


        instructorName="baris can ates";
        dersSaatimiz=33;
        ogrendikMi=true;

        staticMethod();


    }

    public static void staticMethod(){
        System.out.println("staticMethod"+instructorName + dersSaatimiz + ogrendikMi);

    }

}
