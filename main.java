
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        try {
            int number_one = console.nextInt();
            String znak = console.next();
            int number_two = console.nextInt();

            if (znak.equals("+")) {
                System.out.println(number_one + number_two);
            } else if (znak.equals("-")) {
                System.out.println(number_one - number_two);
            } else if (znak.equals("*")) {
                System.out.println(number_one * number_two);
            } else if (znak.equals("/")) {
                System.out.println(number_one / number_two);
            }
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: нельзя делить на ноль.");
        } finally {
            System.out.println("Программа выполнена");
        }
    }
}
