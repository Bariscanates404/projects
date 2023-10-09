package MethodCreation;

public class ReusableMethods {


    public static void galonLiterConverter(String hacimCesidi, int hacimDegeri) {

        if (hacimCesidi.equals("galon") || hacimCesidi.equals("litre")) {
            if (hacimDegeri <= 0) {
                System.out.println("lutfen rakamsal ve pozitif bir hacim degeri giriniz.");
            } else if (hacimCesidi.equals("galon")) {
                System.out.println("girilen " + hacimDegeri + " galonun litre karşılıgı: " + (hacimDegeri * 3.78) + " litredir.");
            } else if (hacimCesidi.equals("litre")) {
                System.out.println("girilen " + hacimDegeri + " litrenin galon karşılıgı: " + (hacimDegeri / 3.78) + " galondur.");
            }
        } else System.out.println("lutfen gecerli bir hacim cesidi giriniz...");


    }

    public static void harfleriTersineCevir(String kelime){
        String tersKelime="";

        if (kelime.length()<3){
            System.out.println("kelime cok kisa");
        }else if (kelime.length()<=5){
            if (kelime.length()==3){
                tersKelime=kelime.substring(2)+
                        kelime.substring(1,2)+
                        kelime.substring(0,1);
            }else if(kelime.length()==4){
                tersKelime=kelime.substring(3)+
                        kelime.substring(2,3)+
                        kelime.substring(1,2)+
                        kelime.substring(0,1);
            }else {
                tersKelime=kelime.substring(4)+
                        kelime.substring(3,4)+
                        kelime.substring(2,3)+
                        kelime.substring(1,2)+
                        kelime.substring(0,1);
            }
            System.out.println("girdiginiz kelimedeki harf sayisi : " + kelime.length());
            System.out.println("kelimenin tersten yazilisi : " + tersKelime);

        } else {
            System.out.println("kelime cok uzun");
        }
    }


    /**
     * toplama
     * <pre>
     *            verilen iki sayinin toplamibi consola bastirir.
     * </pre>
     *
     * @param args1 birinci int
     * @param args2 ikinci int
     * @author Baris Can Ates
     */
    public static void toplama(int args1, int args2) {
        System.out.println(args1 + args2);
    }


    public static boolean verifyURLorText(String actualURL, String expectedURL) {
        boolean result = false;
        if (actualURL.equals(expectedURL)) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }







}
