import java.util.Random;
import java.util.Scanner;

public class Lesson4 {
    public static void main(String[] args) {
        taskFirst();
        taskSecond();
        taskTh();
        taskF();
        printArray();
        System.out.println(operation(1));
        System.out.println(operation(0));
        System.out.println(calculateCountOfOddElementsInMatrix(new int[]{1, 2, 3, 4, 5, 6}));
        countDevs(103);
        countDevs(11);
        foobar(6);
        foobar(10);
        foobar(15);
        printPrimeNumbers();
    }

    /**
     * 1) Задача на оператор switch!
     * Рандомно генерируется число От 1 до 7.
     * Если число равно 1, выводим на консоль “Понедельник”, 2 –”Вторник” и так далее.
     * Если 6 или 7 – “Выходной”.
     */
    private static void taskFirst() {
        System.out.print("Task First \nToday it's a ");

        Random random = new Random();
        int dayOfWeek = random.nextInt(8);
        switch (dayOfWeek) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Sorry it's not day of week");
        }
        System.out.println("------------------------------");
    }

    /**
     * 2) Одноклеточная амеба каждые 3 часа делится на 2 клетки. Определить,
     * сколько амеб будет через 3, 6, 9, 12,..., 24 часа
     */
    private static void taskSecond() {
        System.out.println("Task2");
        int count = 1;
        for (int i = 3; i <= 24; i += 3) {
            count *= 2;
            System.out.printf("%d - часов , амеб %d; \n", i, count);
        }
        System.out.println("---------------------------------");
    }

    /**
     * 3) В переменную записываем число.
     * Надо вывести на экран сколько в этом числе цифр и положительное оно или отрицательное.
     * Например, Введите число: 5
     * "5 - это положительное число, количество цифр = 1"
     */
    private static void taskTh() {
        System.out.println("Task3");
        System.out.println("Ввидите любое число");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number > 0) {
            System.out.printf("%d - число положительное", number);
        } else {
            System.out.printf("%d - число отрицательное", number);
        }
        char[] c = Integer.toString(number).toCharArray();
        System.out.printf(", количество цифр = %d\n", c.length);
        System.out.printf("----------------------------------\n");
    }

    /**
     * 4) Дано 2 числа, день и месяц рождения. Написать программу, которая определяет знак зодиака человека.
     * Некоторые тесты для проверки задач. Можно также написать свои тесты.
     * Овен (21 марта – 20 апреля)
     * Телец (21 апреля – 21 мая) ...
     * Близнецы (22 мая – 21 июня) ...
     * Рак (22 июня – 22 июля) ...
     * Лев (23 июля – 21 августа) ...
     * Дева (22 августа – 23 сентября) ...
     * Весы (24 сентября – 23 октября) ...
     * Скорпион (24 октября – 23 ноября)
     * Стрелец (23 ноября — 22 декабря)
     * Козерог (23 декабря — 20 января)
     * Водолей (21 января — 19 февраля)
     * Рыбы (20 февраля — 20 марта)
     */
    private static void taskF() {
        System.out.println("Task4");
        System.out.println("Ввидите число месяца");
        Scanner scannerMouth = new Scanner(System.in);
        System.out.println("и день");
        Scanner scannerD = new Scanner(System.in);
        switch (scannerMouth.nextInt()) {
            case 1:
                if (scannerD.nextInt() <= 20) {
                    System.out.println("Козерог");
                } else {
                    System.out.println("Водолей");
                }
                break;
            case 2:
                if (scannerD.nextInt() <= 19) {
                    System.out.println("Водолей");
                } else {
                    System.out.println("Рыбы");
                }
                break;
            case 3:
                if (scannerD.nextInt() <= 20) {
                    System.out.println("Рыбы");
                } else {
                    System.out.println("Овен");
                }
                break;
            case 4:
                if (scannerD.nextInt() <= 20) {
                    System.out.println("Овен");
                } else {
                    System.out.println("Телец");
                }
                break;
            case 5:
                if (scannerD.nextInt() <= 21) {
                    System.out.println("Телец");
                } else {
                    System.out.println("Близнецы");
                }
                break;
            case 6:
                if (scannerD.nextInt() <= 21) {
                    System.out.println("Близнецы");
                } else {
                    System.out.println("Рак");
                }
                break;
            case 7:
                if (scannerD.nextInt() <= 22) {
                    System.out.println("Рак");
                } else {
                    System.out.println("Лев");
                }
                break;
            case 8:
                if (scannerD.nextInt() <= 21) {
                    System.out.println("Лев");
                } else {
                    System.out.println("Дева");
                }
                break;
            case 9:
                if (scannerD.nextInt() <= 23) {
                    System.out.println("Дева");
                } else {
                    System.out.println("Весы");
                }
                break;
            case 10:
                if (scannerD.nextInt() <= 23) {
                    System.out.println("Весы");
                } else {
                    System.out.println("Скорпион");
                }
                break;
            case 11:
                if (scannerD.nextInt() <= 24) {
                    System.out.println("Скорпион");
                } else {
                    System.out.println("Стрелец");
                }
                break;
            case 12:
                if (scannerD.nextInt() <= 22) {
                    System.out.println("Стрелец");
                } else {
                    System.out.println("Водолей");
                }
                break;
            default:
                System.out.println("Что-то пошло не так вы ввели число > 12");
        }
    }


    /**
     * Необходимо прочитать с консоли значение числа типа int,
     * сделать проверку что если пользователь ввел не положительное число,
     * то вывести ошибку и отправить пользователя вводить заново новое число!
     * далее создать одномерный массив типа int размера прочитанного с консоли
     * далее заполнить массив случайными значениями
     * далее вывести массив на консоль
     */
    private static void printArray() {
        System.out.println("Task 5");
        System.out.println("Ввидите положительное число");
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        do {
            System.out.println("Ввидите положительное число\nВаше число = " + t);
        } while (t < 0);
        int[] task5 = new int[t];
        Random random = new Random();
        for (int i = 0; i < task5.length; i++) {

            task5[i] = random.nextInt(task5.length);
        }
        System.out.println("На основе вашего числа создан следующий массив");
        for (int i : task5) {
            System.out.println(i);
        }
        System.out.println("-----------");
    }

    /**
     * Метод должен выполнять некоторую операцию с int "number" в зависимости от некоторых условий:
     * - if number положительное число, то необходимо number увеличить на 1
     * - if number отрицательное - уменьшить на 2
     * - if number равно 0 , то замените значение number на 10
     * вернуть number после выполнения операций
     */
    public static int operation(int number) {
        if (number > 0) {
            return number + 1;
        } else if (number < 0) {
            return number - 2;
        } else {
            return 10;
        }
    }

    /**
     * На вход приходит массив целых чисел типа int
     * Необходимо найти количество нечетных элементов в массиве и вернуть значение в метод main,
     * в котором это значение распечатается на консоль.
     */
    public static int calculateCountOfOddElementsInMatrix(int[] ints) {
        int count = 0;
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    /**
     * На вход приходит число.
     * Вывести в консоль фразу из разряда "_COUNT_ программистов",
     * заменить _COUNT_ на число которое пришло на вход в метод и заменить окончание в слове "программистов" на
     * уместное с точки зрения русского языка.
     * Пример: 1 программист, 42 программиста, 50 программистов
     *
     * @param count - количество программистов
     */
    public static void countDevs(int count) {
        if (count == 1 | count == 21 | count == 31 | count == 41 | count == 51 | count == 61 | count == 71
                | count == 81 | count == 91 | count == 101) {
            System.out.printf("%d Программист\n", count);
        }
        if ((count > 1 & count < 5) | (count > 21 & count < 25) | (count > 31 & count < 35) | (count > 41 & count < 45) |
                (count > 51 & count < 55) | (count > 61 & count < 65) | (count > 71 & count < 75) | (count > 81 & count < 85)
                | (count > 91 & count < 95) | (count > 101 & count < 105)) {
            System.out.printf("%d Программиста\n", count);
        }
        if ((count > 4 & count <= 20) | (count > 24 & count <= 30) | (count > 34 & count <= 40) | (count > 44 & count <= 50)
                | (count > 54 & count <= 60) | (count > 64 & count <= 70) | (count > 74 & count <= 80) | (count > 84 & count <= 90)
                | (count > 94 & count <= 100)) {
            System.out.printf("%d Программистов\n", count);
        }
        System.out.println("----------------------------");
    }

    /**
     * Метод должен выводить разные строки в консоли в зависимости от некоторых условий:
     * - если остаток от деления на 3 равен нулю - выведите "foo" (example of number - 6)
     * - если остаток от деления на 5 равен нулю - вывести "bar" (example of number - 10)
     * - если остаток от деления на 3 и 5 равен нулю 0 ,то вывести "foobar" (example of number - 15)
     */
    public static void foobar(int number) {
        // тут пишем логику
        if ((number % 3 == 0) & (number % 5 == 0)) {
            System.out.println("foobar");
        } else if (number % 5 == 0) {
            System.out.println("bar");
        } else {
            System.out.println("foo");
        }
    }

    /**
     * Задача со звездочкой!
     * Метод должен печатать все простые числа <1000
     * что такое просто число (https://www.webmath.ru/poleznoe/formules_18_5.php)
     */
    public static void printPrimeNumbers() {

        System.out.println("Task***");
        for (int i = 1; i < 1000; i++) {
            if (i < 9) {
                if (i % 2 != 0) {
                    System.out.println(i);
                }
            }
            if (i > 10) {
                if ((i % 2 != 0) & (i % 3 != 0) & (i % 5 != 0) & (i % 7 != 0)) {
                    System.out.println(i);
                }
            }
        }
    }
}