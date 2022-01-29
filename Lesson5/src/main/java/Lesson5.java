import java.util.Random;
import java.util.Scanner;

public class Lesson5 {
    public static void main(String[] args) {
        summ(5, 10);
        taskSecond();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
//        calculateSumOfDiagonalElements();
        printMatrix();
    }
//        Задачи:

    /**
     * 1) Напишите реализацию метода summ(int a, int b), вычисляющий a*b, не пользуясь операцией
     * умножения, где a и b целые числа, вызовите метод summ  в методе main и распечатайте на консоль.
     */
    private static void summ(int a, int b) {
        System.out.println(Math.multiplyExact(a, b));
    }

//        2) Дан двухмерный массив размерностью 4 на 4, необходимо нарисовать четыре треугольника вида

    //        a)                  b)
//              *        *
//            * *        * *
//          * * *        * * *
//        * * * *        * * * *
//
//        c)                  d)
//        * * * *        * * * *
//          * * *        * * *
//            * *        * *
//              *        *
    private static void taskSecond() {
        char[][] taskA = new char[4][4];
        for (int i = 0; i <= taskA.length - 1; i++) {
            for (int j = 0; j <= i; j++) {
                taskA[i][j] = '*';
            }
        }
        for (int i = 0; i <= taskA.length - 1; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(taskA[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("B");
        char[][] taskB = new char[4][4];
        for (int i = 0; i <= taskB.length - 1; i++) {
            for (int j = taskB[i].length - 1; j >= i; j--) {
                taskB[j][i] = '*';
            }
        }
        for (int i = 0; i <= taskB.length - 1; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(taskB[i][j] + " ");
            }
            System.out.println();
        }
    }


    //        3) Создайте массив из всех нечётных чисел от 1 до 100, выведите его на экран в строку,
//        а затем этот же массив выведите на экран тоже в строку, но в обратном порядке (99 97 95 93 ... 7 5 3 1).
    private static void task3() {
        int count = 0;
        int[] mass = new int[100];

        for (int i = 0; i <= mass.length - 1; i++) {

            if (i % 2 != 0) {
                count++;
                mass[i] += i;
            }
        }
        for (int i = mass.length - 1; i >= 0; i--) {
            if (mass[i] != 0) {
                System.out.print(mass[i] + " ");
            }
        }
        System.out.println("***********");
    }

    //        4) Создайте массив из int[] mass = new int[12]; Рандомно заполните его значениями от 0 до 15.
//        Определите какой элемент является в этом массиве максимальным и сообщите индекс его последнего вхождения в массив.
//        Пример: {3,4,5,62,7,8,4,-5,7,62,5,1} Максимальный элемент 62, индекс его последнего вхождения в массив = 10
    private static void task4() {
        System.out.println("Task4");
        int[] mass = new int[12];
        int max = 0;
        int index = 0;
        Random random = new Random();
        for (int i = 0; i < mass.length; i++) {
            mass[i] = random.nextInt(15);
            if (mass[i] > max) {
                max = mass[i];
                index = i;
            }
        }
        for (int i = 0; i < mass.length; i++) {
            System.out.print(mass[i] + " ");
        }
        System.out.println();
        System.out.printf("Максимальный элемент %d, индекс его последнего вхождения в массив = %d\n", max, index + 1);
        System.out.println("******************");
    }

    //        5) Создайте массив размера 20, заполните его случайными целыми чиселами из отрезка от 0 до 20.
//        Выведите массив на экран в строку. Замените каждый элемент с нечётным индексом на ноль.
//        Снова выведете массив на экран на отдельной строке.
    private static void task5() {
        System.out.println("Task5");
        int[] mass = new int[20];
        Random random = new Random();
        for (int i = 0; i < mass.length; i++) {
            mass[i] = random.nextInt(20);
        }
        for (int i = 0; i < mass.length; i++) {
            System.out.print(mass[i] + " ");
        }
        System.out.println("");
        for (int i = 0; i < mass.length; i++) {
            if (i % 2 != 0) {
                mass[i] = 0;
            }
        }
        for (int i = 0; i < mass.length; i++) {
            System.out.print(mass[i] + " ");
        }
        System.out.println();
        System.out.println("*****************************");
    }

    //        6) Найти максимальный элемент в массиве {4,5,0,23,77,0,8,9,101,2} и поменять его местами с нулевым элементом
    private static void task6() {
        System.out.println("Task6");
        int[] mass = {4, 5, 0, 23, 77, 0, 8, 9, 101, 2};
        int max = 0;
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] > max) {
                max = mass[i];
                mass[0] = max;
            }
        }
        System.out.println("максимальный элемент в массиве = " + max);
        for (int i = 0; i < mass.length; i++) {
            System.out.print(mass[i] + " ");
        }
        System.out.println("");
        System.out.println("********************");
    }

    //        7) Проверить, различны ли все элементы массива, если не различны то вывести элемент повторяющийся
//        Пример: {0,3,46,3,2,1,2}
//        Массив имеет повторяющиеся элементы 3, 2
//        Пример: {0,34,46,31,20,1,28}
//        Массив не имеет повторяющихся элементов
    private static void task7() {
        System.out.println("Task7");
        int[] mass = {0, 3, 46, 3, 2, 1, 2};

        System.out.print("Массив имеет повторяющиеся элементы ");
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] == mass[i]) {
                System.out.print(mass[i] + " ");
            }
        }
        System.out.println("");
    }


    //        8) Создаём квадратную матрицу, размер вводим с клавиатуры.
//        Заполняем случайными числами в диапазоне от 0 до 50. И выводим на консоль(в виде матрицы).
//        Далее необходимо транспонировать матрицу(1 столбец станет 1-й строкой, 2-й столбец - 2-й строкой и т. д.)
//        Пример:
//          1 2 3 4      1 6 3 1
//          6 7 8 9      2 7 3 5
//          3 3 4 5      3 8 4 6
//          1 5 6 7      4 9 5 7
    private static void task8() {
        System.out.println("Task8");
        Scanner scannerA = new Scanner(System.in);
        int a = scannerA.nextInt();
        Scanner scannerB = new Scanner(System.in);
        int b = scannerB.nextInt();
        int[][] matrix = new int[a][b];
        Random random = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(50);
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("Транспонированая матрица");
        for (int i = 0; i <= matrix.length; i++) {
            for (int j = i + 1; j < matrix.length; j++) {
                matrix[i][j] = matrix[j][i];
            }
        }
        System.out.println("************");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("**********");
    }

    /**
     * заполнить рандомно 2-х мерный массив и посчитать сумму элементов на диагонали
     */
    public static void calculateSumOfDiagonalElements() {
        //пишем логику и выводим результат используя System.out.println
    }


    /**
     * Шаги по реализации:
     * - Прочитать два int из консоли
     * - Создайте двумерный массив int (используйте целые числа, которые вы читаете по высоте и ширине консоли)
     * - Заполнить массив случайными значениями (до 100)
     * - Вывести в консоль матрицу заданного размера, но:
     * - Если остаток от деления элемента массива на 3 равен нулю - выведите знак "+" вместо значения элемента массива.
     * - Если остаток от деления элемента массива на 7 равен нулю - выведите знак "-" вместо значения элемента массива.
     * - В противном случае выведите "*"
     * <p>
     * Example:
     * - Значения с консоли - 2 и 3
     * - Массив будет выглядеть так (значения будут разными, потому что он случайный)
     * 6 11 123
     * 1 14 21
     * - Для этого значения вывод в консоли должен быть:
     * <p>
     * + * *
     * * - +
     * <p>
     * Обратите внимание, что 21% 3 == 0 и 21% 7 = 0, но выводить надо не +-, а +
     */
    public static void printMatrix() {
        System.out.println("Task Matrix");
        Scanner scannerA = new Scanner(System.in);
        int a = scannerA.nextInt();
        Scanner scannerB = new Scanner(System.in);
        int b = scannerB.nextInt();
        int[][] matrix = new int[a][b];
        Random random = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(100);
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if ((matrix[i][j] % 3) == 0) {
                    System.out.print(" + ");
                } else if ((matrix[i][j] % 7) == 0) {
                    System.out.print(" - ");
                } else {
                    System.out.print(" * ");
                }
            }
            System.out.println("");
        }
    }
}
