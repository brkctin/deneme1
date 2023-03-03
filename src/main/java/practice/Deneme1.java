package practice;

public class Deneme1 {

    public static void main(String[] args) {
        System.out.println(toplama(5,10));

        System.out.println(cikarma(8,5));
        System.out.println(kelimeBirlestirme("ali","can"));

        int x = 50;
        int y = 27;
        System.out.println(x+y);

        String name = "Burak";
        String lastName = "Cetin";
        int age = 22;
        int dateOfBirth = 2000;

        System.out.println(name);
        System.out.println(lastName);
        System.out.println(age);


    }

    public static int toplama(int a,int b){
        return a+b;
    }
    public static int cikarma(int a,int b){
        return a-b;
    }

    public static String kelimeBirlestirme(String a, String b){
        return a+b;

    }


}
