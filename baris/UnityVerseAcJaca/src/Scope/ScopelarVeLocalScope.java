package Scope;

public class ScopelarVeLocalScope {
    //burası instance scope yani class scope
    //static olmayan degisken olsutur ve her scopedan ona ulas ve yazdir.

    public static void main(String[] args) {
        //method scope


        for (int i = 0; i < 6; i++) {

            int localScopeSayi1 = 99;
            //Block scope yani Locak scope

        }

        //  localScopeSayi1 ulaşılamıyor. kucuk scopedan buyuk scope'a ulasamayiz.


    }

    public static void scopeMethod() {
        //Method scope

    }

    public void scopeMethod2() {
        //Method scope


    }

}
