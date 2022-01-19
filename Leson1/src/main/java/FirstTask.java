import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ввидите число");

        int number = scanner.nextInt();
        int count = 0;
        int i ;

        System.out.printf("Целые числа : \n");

       for (i= 1; i < number; i++)
           if (i %2 ==0){
               count++;
               System.out.println("\t" + i);
           }
        System.out.println("Количество положительных целых чисел равно : " + count);
    }
}
