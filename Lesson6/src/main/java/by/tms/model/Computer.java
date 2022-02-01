package by.tms.model;

import java.util.Random;
import java.util.Scanner;

/**
 * в папке src/main/java создать пакет by.tms.model
 * в пакете создать класс Computer
 * 1) класс Computer будет содержать следующие поля:
 * - процессор
 * - оперативка
 * - жесткий диск
 * - ресурс полных циклов работы (включился выключился это один цикл)
 * <p>
 * 2) класс Computer будет содержать следующие методы:
 * - метод описание(вывод всех полей)
 * - метод включить (on())
 * - при включении может произойти сбой, поэтому при вызове метода on() необходимо написать следующую логику:
 * на консоль вывести сообщение (Внимание! Введите 0 или 1)
 * создать экземпляр класса Random, который будет генерировать число 0 или 1.
 * если введенное вами число совпадет с рандомным, то компьютер выключается.
 * если введенное вами число не совпадет с рандомным, то компьютер сгорает.
 * - при повторном включении компьютера, если он сгорел необходимо выдать сообщение "Компьютер сгорел!"
 * - выключить (off()) Проверяем если компьютер не сгорел то пишем "Выключение компьютера" и уменьшаем счетчик
 * ресурса полных циклов работы
 * - при превышении лимита ресурса комп сгорает. Пишем сообщение "Компьютер сгорел!"
 * <p>
 * 3) создать пакет by.tms.service
 * создать класс Main создать метод main
 * создать экземпляр класса Computer или реальный объект, через конструктор передать значение полей класса,
 * т.е необходимо сгенерировать конструктор с полями класса перечисленными в 1 пункте
 * Далее у объекта Computer вызвать его методы, в которых будет реализована логика по включению, выключению
 * и выводу информации про него.
 */

public class Computer {
    private final String processor;
    private final int memory;
    private final int hardDisc;
    private boolean onOrOff;
    int loop = 10;

    public Computer(String processor, int memory, int hardDisc) {
        this.processor = processor;
        this.memory = memory;
        this.hardDisc = hardDisc;
    }

    public void on() {
        System.out.println("Внимание! Введите 0 или 1");
        Scanner scanner = new Scanner(System.in);
        int onComp = scanner.nextInt();
        Random random = new Random();
        int rand = random.nextInt(2);
        if (onComp == rand) {
            System.out.println("Kомпьютер выключается......");
            setOnOrOff(true);
        } else {
            on();
            System.out.println("Компьютер сгорел!");
            setOnOrOff(false);
        }

    }

    public void off() {
        if (isOnOrOff()) {
            System.out.println("Выключение компьютера");
        } else {
            System.out.println("Компьютер сгорел!");
            this.loop -= 1;
            if (this.loop == 0) {
                System.out.println("Bye----------------");
            }
        }
    }

    public String getProcessor() {
        return processor;
    }

    public int getMemory() {
        return memory;
    }

    public int getHardDisc() {
        return hardDisc;
    }

    public void setOnOrOff(boolean onOrOff) {
        this.onOrOff = onOrOff;
    }


    public boolean isOnOrOff() {
        return onOrOff;
    }

    public int getLoop() {
        return loop;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "processor='" + processor + '\'' +
                ", memory='" + memory + '\'' +
                ", hardDisc=" + hardDisc +
                '}';
    }
}