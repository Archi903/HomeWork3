public class Main {
    public static void main(String[] args) {
        task1();
        task2();
    }

    public static void task1() {
        System.out.println("Задание 1");
        byte Sheriff = 1;
        System.out.println("Значение переменной Sheriff с типом byte равно " + Sheriff);
        short ants = 32000;
        System.out.println("Значение переменной ants с типом short равно " + ants);
        int redHats = 35000;
        System.out.println("Значение переменной redHats с типом int равно " + redHats);
        long brokenLamps = 30000000000L;
        System.out.println("Значение переменной brokenLamps с типом long равно " + brokenLamps);
        float Mars = 3.6545f;
        System.out.println("Значение переменной Mars с типом float равно " + Mars);
        double Sun = 10;
        double SunShine = Sun / 3;
        System.out.println("Значение переменной SunShine с типом double равно " + SunShine);
    }

    public static void task2() {
        System.out.println("Задание 2");

        float A = 27.12f;
        System.out.println(A + " принадлежит float" );
        long B = 987678965549L;
        System.out.println(B + " принадлежит long" );
        float C = 2.786f;
        System.out.println(C + " принадлежит float" );
        boolean D = C >= 2;
        System.out.println(D + " принадлежит boolean" );
        short E = 569;
        System.out.println(E + " принадлежит short" );
        short G = -159;
        System.out.println(G + " принадлежит short" );
        short F = 27897;
        System.out.println(F + " принадлежит short" );
        byte J = 67;
        System.out.println(J + " принадлежит byte" );
    }
}