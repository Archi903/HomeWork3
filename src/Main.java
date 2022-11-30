public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
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
        float mars = 3.6545f;
        System.out.println("Значение переменной Mars с типом float равно " + mars);
        double sun = 10;
        double sunShine = sun / 3;
        System.out.println("Значение переменной SunShine с типом double равно " + sunShine);
    }

    public static void task2() {
        System.out.println("Задание 2");

        float a = 27.12f;
        System.out.println(a + " принадлежит float" );
        long b = 987678965549L;
        System.out.println(b + " принадлежит long" );
        float c = 2.786f;
        System.out.println(c + " принадлежит float" );
        boolean d = c >= 2;
        System.out.println(d + " принадлежит boolean" );
        short e = 569;
        System.out.println(e + " принадлежит short" );
        short g = -159;
        System.out.println(g + " принадлежит short" );
        short f = 27897;
        System.out.println(f + " принадлежит short" );
        byte j = 67;
        System.out.println(j + " принадлежит byte" );
    }
    public static void task3() {
        System.out.println("Задание 3");
byte lP = 23;
byte aS = 27;
byte eA = 30;
byte allStudents = (byte) (lP + aS + eA);
short sheetsOfPaper = 480;
short paperForStudent = (short) (sheetsOfPaper / allStudents);
System.out.println("На каждого ученика рассчитано " + paperForStudent + " листов бумаги");
    }
    public static void task4() {
        System.out.println("Задание 4");
        byte battles2m = 16;
        byte timeProduct = 2;
        int production1Minute = (battles2m / timeProduct);

        short for20Minutes = (short) (production1Minute * 20);
        System.out.println("За 20 минут работы машины произвела бутылок " + for20Minutes + " штук");

        byte hourDay = 24;
        byte minuteHour = 60;
        short minutesDay = (short) (hourDay * minuteHour);
        short forDay = (short) (minutesDay * production1Minute);
        System.out.println("За день работы машины произвела бутылок " + forDay + " штук");

        byte day3 = 3;
        int forHolidays = (minutesDay * day3 * production1Minute);
        System.out.println("За 3 дня работы машины произвела бутылок " + forHolidays + " штук");

        byte month = 30;
        int forMonth = (minutesDay * month * production1Minute);
        System.out.println("За 1 месяц работы машины произвела бутылок " + forMonth + " штук");
    }
    public static void task5() {
        System.out.println("Задание 5");

        byte cans = 120;
        byte whiteCons = 2;
        byte brownCons = 4;
        byte cons1Class = (byte) (whiteCons + brownCons);
        byte classes = (byte) (cans / cons1Class);
        byte amountWHite = (byte) (whiteCons * classes);
        byte amountBrown = (byte) (brownCons * classes);
        System.out.println("В школе, где " + classes + " классов, нужно " + amountWHite +
                " банок белой краски и " + amountBrown + " банок коричневой краски");

    }
    public static void task6() {
        System.out.println("Задание 6");

        byte bananas = 5;
        byte bananaWeight = 80;
        short totalBanana = (short) (bananas * bananaWeight);

        byte milk = 2;
        byte amountGram = 105;
        short totalMilk = (short) (milk * amountGram);

        byte IceCream = 2;
        byte weight = 100;
        short totalIce = (short) (IceCream * weight);

        byte eggs = 4;
        byte eggsWeight = 70;
        short totalEggs = (short) (eggs * eggsWeight);

        System.out.println("Такой спорт завтрак весит " + (totalBanana + totalMilk +
                totalIce + totalEggs) + " грамм");


    }
    public static void task7() {
        System.out.println("Задание 7");

        byte goal = 7;
        short gram = (short) (goal * 1000);

        short shortWay = 500;
        short shortCount = (short) (gram / shortWay);

        short longWay = 250;
        short longCount = (short) (gram / longWay);

        byte average = (byte) ((shortCount + longCount) / 2);

        System.out.println ("Итоги всех подсчетов сброса веса: Быстрый - " + shortCount +
                ", средний - " + average + ", долгий - " + longCount);
    }
    public static void task8() {
        System.out.println("Задание 8");

        int mashaSalary = 67760;
        float mashaChange = (float) (mashaSalary * 0.1);
        float mashaGrow = mashaSalary + mashaChange;
        System.out.println("Маша теперь получает " + mashaGrow + " рублей. Годовой доход вырос на " + mashaChange + " рублей");

        int denisSalary = 83690;
        float denChange = (float) (denisSalary * 0.1);
        float denGrow = denisSalary + denChange;
        System.out.println("Денис теперь получает " + denGrow + " рублей. Годовой доход вырос на " + denChange + " рублей");

        int kristinaSalary = 76230;
        float kristinaChange = (float) (kristinaSalary * 0.1);
        float kristinaGrow = kristinaSalary + kristinaChange;
        System.out.println("Кристина теперь получает " + kristinaGrow + " рублей. Годовой доход вырос на " + kristinaChange + " рублей");
    }

}
