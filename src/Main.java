//в телеге Trjam aka Саша, ютуб - Alien.Trjam

public class Main {
    // 1 пункт
    public static void main (String[] args) {

        //2 пункт, вроде ничего не забыл
        int a = 4;
        byte b = 1;
        short s = 2;
        long l = 8;

        float f = 4.4f;
        double d = 8.8;

        char c = '2';
        boolean v = true;

        //3 пункт
        System.out.println("Результат выражени: " + result(1.5f, 2.5f, 3.5f, 4.0f));

        //4 пункт
        System.out.println("Сумма чисел между 10 и 20? " + isResultBetween10and20(5,10));

        //5 пункт
        negativeOrPositive(0);

        //6 пункт
        System.out.println("Число отрицательное? " + isNegative(-4));

        //7 пункт
        welcomeMassage("Саня");

        //8 пункт
        isLeapYear(2021);
    }

    //3 пункт
    static float result (float a, float b, float c, float d) {
        return (a * (b + (c / d)));
    }

    //4 пункт
    static boolean isResultBetween10and20 (int a, int b) {
        if (10<=a+b||a+b<=20)
            return true;
        return false;
    }

    //5 пункт
    static  void negativeOrPositive (int a) {
        if (a>=0)
            System.out.println("Число положительное");
        else
            System.out.println("Число отрицательное");
    }

    //6 пункт
    static boolean isNegative (int a) {
        if (a<0)
            return true;
        return false;
        //а вообще идея так предложила "return a < 0;", и не только тут, пользуемся подсказками идеи или только авторский код?
    }

    //7 пункт
    static void welcomeMassage (String name) {
        System.out.println("Привет, " + name + "!");
    }

    //8 пункт
    static void isLeapYear (int year) {
        String isLeap = " - високосный год";
        String isnotLeap = " - обычный год";
        if (year%400==0)
            System.out.println(year+isLeap);
        else if (year%100==0)
            System.out.println(year+isnotLeap);
        else if (year%4==0)
            System.out.println(year+isLeap);
        else
            System.out.println(year+isnotLeap);
    }
}
