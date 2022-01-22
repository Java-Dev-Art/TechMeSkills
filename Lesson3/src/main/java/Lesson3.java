import java.util.Random;
import java.util.Scanner;

public class Lesson3 {
    /**
     * Задачи:
     * Используя тип данных char и операцию инкремента вывести на консоль все буквы английского алфавита
     */
    public static void main(String[] args) {
        alphabet();
        yourNumber();
        task3();
        taskFour();
        taskFive();
        int[] mass = {1, 10, 12, 7};
        System.out.println("Task#6 \nСреднее значение : " + average(mass));
        System.out.println("");
        System.out.println("Task#7 \nMax Value : " + max(mass));
        System.out.println("");
    }

    public static void alphabet() {
        char[] charEng = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't',
                'u', 'v', 'w', 'x', 'y', 'z'};
        System.out.println("Task #1 \n English alphabet");
        int i = 0;
        for (char c : charEng) {
            i++;
            System.out.println(i + " - " + c + ";");
        }
        System.out.println("");
    }

    /**
     * 2)Проверка четности числа
     * Создать программу, которая будет сообщать, является ли целое число, введённое пользователем,
     * чётным или нет. Ввод числа осуществлять с помощью класса Scanner.
     * Если пользователь введёт не целое число, то сообщать ему об ошибке.
     */

    public static void yourNumber() {

        System.out.println("Task#2");
        System.out.println("Please enter even number !");
        Scanner scanner = new Scanner(System.in);
        int scN = scanner.nextInt();
        if ((scN % 2) == 0) {
            System.out.println("You enter " + scN + "\n Your number is even");

        } else {
            System.out.println("Sorry Please repeat your number is not even");
        }
        System.out.println("");
    }

    /**
     * 3) Меньшее по модулю число
     * Cоздать программу, которая будет выводить на экран меньшее по модулю из трёх введённых
     * пользователем вещественных чисел с консоли.
     */

    public static void task3() {
        System.out.println("Task#3");
        System.out.println("Ввидите три числа");
        System.out.println("first");
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        System.out.println("second");
        Scanner scanner2 = new Scanner(System.in);
        int second = scanner2.nextInt();
        System.out.println("third");
        Scanner scanner3 = new Scanner(System.in);
        int third = scanner3.nextInt();
        System.out.print("Наименьшим числом из трех является : ");
        if (first < second & first < third) {
            System.out.println(first);
        }
        if (second < first & second < third) {
            System.out.println(second);
        }
        if (third < first & third < second) {
            System.out.println(third);
        }
        System.out.println("");
        System.out.println("Наименьшее число по модулю");
        int firstMod = Math.abs(first);
        int secM = Math.abs(second);
        int thirdM = Math.abs(third);

        if (secM < firstMod & secM < thirdM) {
            System.out.println("mod " + secM);
        }
        if (thirdM < firstMod & thirdM < secM) {
            System.out.println("mod " + thirdM);
        }
        if (firstMod < secM & firstMod < thirdM) {
            System.out.println("mod " + firstMod);
        }
    }

    /**
     * 4) На некотором предприятии инженер Петров создал устройство, на табло которого показывается количество секунд,
     * оставшихся до конца рабочего дня. Когда рабочий день начинается ровно в 9 часов утра — табло отображает «28800»
     * (т.е. остаётся 8 часов),
     * когда времени 14:30 — на табло «9000» (т.е. остаётся два с половиной часа), а когда наступает 17 часов — на табло отображается «0»
     * (т.е. рабочий день закончился).
     * Программист Иванов заметил, как страдают офисные сотрудницы — им неудобно оценивать остаток рабочего дня в секундах.
     * Иванов вызвался помочь сотрудницам и написать программу, которая вместо секунд будет выводить на табло понятные фразы
     * с информацией о том,
     * сколько полных часов осталось до конца рабочего дня. Например: «осталось 7 часов», «осталось 4 часа», «остался 1 час»,
     * «осталось менее часа».
     * Итак, в переменную n должно записываться случайное (на время тестирования программы) целое число из [0;28800],
     * далее оно должно выводиться на экран (для Петрова) и на следующей строке (для сотрудниц) должна
     * выводиться фраза о количестве полных часов, содержащихся в n секундах.
     */

    public static void taskFour() {
        System.out.println("Task#4");
        Random random = new Random();
        int endsWork = random.nextInt(28801);
        System.out.println("For Petrov " + endsWork);
        System.out.println(endsWork / 3600 + " hours left until the end of work");
        System.out.println("");
    }

    /**
     * 5) Необходимо написать программу, которая будет выводить на консоль таблицу приведения типов!
     * byte	short	char	int 	long	float	double	boolean
     * byte
     * short
     * char
     * int
     * long
     * float
     * double
     * boolean
     * <p>
     * На пересечении напишите следующие фразы:
     * ня (неявное) – если преобразование происходит автоматически,
     * я (явное) – если нужно использовать явное преобразование,
     * х – если преобразование невозможно,
     * т  - если преобразование тождественно.
     * Внимание! используйте System.out.printLn
     */
    public static void taskFive() {
        String[][] massValue =
                {{"   ", " byte ", " short", " char", " int", " long", " float", " double", " boolean"},
                        {"byte ", " Т", "    НЯ", "   X", "  НЯ", "  НЯ", "    X", "       X", "        X "},
                        {"short ", "Я", "    Т", "    Х", "   НЯ", "   НЯ", "    Х", "     Х", "      Х"},
                        {"char ", " Я", "    Я", "    Т", "   Я", "    Я", "     Я", "     Я", "      X"},
                        {"int ", "  Я", "    Я", "    Я", "   Т", "    НЯ", "    Х", "     НЯ", "     Х"},
                        {"long ", " Я", "    Я", "    Х", "   Я", "    Т", "     Х", "     Х", "      Х"},
                        {"float ", "X", "    X", "    X", "   Я", "    Я", "     Т", "     НЯ", "     Х"},
                        {"double ", "Я", "   Я", "    Я", "   Я", "    Я", "     Я", "     Т", "      Х"},
                        {"boolean ", "X", "  X", "    X", "   X", "    X", "     X", "     X", "      T"}};
        for (int i = 0; i < massValue.length; i++) {
            for (int j = 0; j < massValue[i].length; j++) {
                System.out.print(massValue[i][j] + "");
            }
            System.out.println("");
        }
        System.out.println("");

    }

    /**
     * 6) Метод должен вернуть среднее значение из массива чисел
     * (необходимо сумму всех элеменов массива разделить на длину массива)
     * <p>
     * Example:
     * array = {1,2,3,4,5}
     * Метод должен return 3.0
     */
    public static double average(int[] array) {
        double aver = 0;
        for (int i = 0; i < array.length; i++) {
            aver += array[i];
        }
        return aver / array.length;

    }

    /**
     * 7) Метод должен вернуть максимальый элемент массива. Пример: array = {1,2,10,3} метод возвращает 10
     **/
    public static int max(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {

                max = array[i];
            }
        }
        return max;
    }
}



