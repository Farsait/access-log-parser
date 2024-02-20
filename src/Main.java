import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите первое число:");
        int number1 = new Scanner(System.in).nextInt();
        System.out.println("Введите второе число:");
        int number2 = new Scanner(System.in).nextInt();
        int result1 = (int) number1 + number2;
        int result2 = (int) number1 - number2;
        int result3 = (int) number1 * number2;
        double result4 = (double) number1 / number2;
        System.out.println("Сложение " + (number1 + number2));
        System.out.println("Вычитание " + (number1 - number2));
        System.out.println("Умножение " + (number1 * number2));
        System.out.println("Деление " + (number1 / number2));
    }
}