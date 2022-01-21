public class FirstTask {
    public static void main(String[] args) {

        int count = 0;
        for (String arg : args) {
            int pars = Integer.parseInt(arg);

            if (pars > 0) {
                count++;
            }
        }
        System.out.println("Количество положительных целых чисел равно : " + count);

    }
}