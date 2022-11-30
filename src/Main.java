public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
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
    public static void task3() {
        System.out.println("Задание 3");
byte LP = 23;
byte AS = 27;
byte EA = 30;
int allStudents = LP + AS + EA;
short sheetsOfPaper = 480;
int PaperForStudent = sheetsOfPaper / allStudents;
System.out.println("На каждого ученика рассчитано " + PaperForStudent + " листов бумаги");
    }
    public static void task4() {
        System.out.println("Задание 4");
        byte battles2m = 16;
        byte timeProduct = 2;
        int production1Minute = battles2m / timeProduct;

        int For20Minutes = production1Minute * 20;
        System.out.println("За 20 минут работы машины произвела бутылок " + For20Minutes + " штук");

        byte hourDay = 24;
        byte minuteHour = 60;
        int minutesDay = hourDay * minuteHour;
        int ForDay = minutesDay * production1Minute;
        System.out.println("За день работы машины произвела бутылок " + ForDay + " штук");

        byte day3 = 3;
        int ForHolidays = minutesDay * day3 * production1Minute;
        System.out.println("За 3 дня работы машины произвела бутылок " + ForHolidays + " штук");

        byte month = 30;
        int forMonth = minutesDay * month * production1Minute;
        System.out.println("За 1 месяц работы машины произвела бутылок " + forMonth + " штук");
    }
}
