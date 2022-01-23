import static java.lang.Integer.MAX_VALUE;

public class Lesson2 {
    public static void main(String[] args) {
        //вывод на консоль
        printLiterals();
        //Некоторые тесты для проверки задач.
        System.out.println(sum(100, 200));
        System.out.println(sum(MAX_VALUE, MAX_VALUE));
        System.out.println(max(56, 349));
        System.out.println(calculateHypotenuse(3, 4));
    }

    private static void printLiterals() {
//        вывести на консоль литералы следующих видов:
//        логический
        boolean myBool = false;
        System.out.println(myBool);

//        строковый
        String myStr = "Artur";
        System.out.println(myStr);

//        символьный
        char mChar = '1';
        System.out.println(mChar);

//        целочисленный 2-й
        int num = 0b101;
        System.out.println(num);

//        целочисленный 8-й
        int numA = 0125;
        System.out.println(numA);

//        целочисленный 10-й
        int numB = 658;
        System.out.println(numB);

//        целочисленный 16-й
        int numD = 0x15F;
        System.out.println(numD);

//        литерал типа float
        float f = 1.2f;
        System.out.println(f);

//        литерал типа double.
        double d = 1.2;
        System.out.println(d);
    }

    /**
     * 1. Метод должен вернуть сумму двух чисел a и b
     * 2. Дополнительно: сделать проверку если сумма a и b больше чем максимальное значение int то вернуть -1
     **/
    public static int sum(int a, int b) {
        long sumLong = (long) a + b;

        System.out.println("A = " + a + "\nB = " + b + "\nSUM A & B = " + sumLong);
        if (sumLong < MAX_VALUE) {
            return a + b;
        }
        return -1;
    }

    /**
     * Метод должен вернуть максимальное значение из двух чисел
     *
     * <p>
     * Example1:
     * a = 4,
     * b = 5
     * <p>
     * Метод должен вернуть 5
     * Example2:
     * a = 10,
     * b = 10
     * <p>
     * Метод должен вернуть 10
     */
    public static int max(int a, int b) {
//        if  (a > b){
//            return a;
//        }else {
//            return b;
//        }
        return Math.max(a, b);
    }

    /**
     * Используя теорему Пифагора, вычислите значение гипотенузы. Квадрат гипотенузы = сумме квадратов катетов
     * <p>
     * Example1:
     * 3
     * 4
     * return 5
     * <p>
     * Example2:
     * 12
     * 16
     * return 20
     */
    public static double calculateHypotenuse(int a, int b) {
        int c = (a * a) + (b * b);

        return Math.sqrt(c);
    }
}

