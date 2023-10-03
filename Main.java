import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод первого числа
        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();

        // Пример первого числа в двоичном виде (8 бит)
        String binaryNum1 = String.format("%8s", Integer.toBinaryString(num1)).replace(' ', '0');
        System.out.println("Первое число в двоичном виде: " + binaryNum1);

        // Ввод второго числа
        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();

        // Пример второго числа в двоичном виде (8 бит)
        String binaryNum2 = String.format("%8s", Integer.toBinaryString(num2)).replace(' ', '0');
        System.out.println("Второе число в двоичном виде: " + binaryNum2);

        // Выполнение побитовых операций
        int bitwiseAndResult = num1 & num2;
        int bitwiseOrResult = num1 | num2;

        // Вывод результатов операций
        System.out.println("Результат побитового И: " + bitwiseAndResult);
        System.out.println("Результат побитового ИЛИ: " + bitwiseOrResult);

        scanner.close();
    }
}
