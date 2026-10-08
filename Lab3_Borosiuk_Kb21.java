import java.text.MessageFormat;
import java.util.Scanner;

public class Lab3_Borosiuk_Kb21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть ціле число:");
        int number = Integer.parseInt(scanner.nextLine());

        System.out.println("Введіть дробове число через крапку:");
        double decimal = Double.parseDouble(scanner.nextLine());

        System.out.println("Введіть текст:");
        String text = scanner.nextLine();

        System.out.println("Введіть логічне значення (true або false):");
        boolean logical = Boolean.parseBoolean(scanner.nextLine());

        System.out.println("1. Ціле: " + number + "; дробове: " + decimal
                + "; текст: " + text + "; логічне: " + logical);

        System.out.println(MessageFormat.format(
                "2. [{0}] [{1}] [{2}] [{3}]",
                number, decimal, text, logical));

        System.out.println(MessageFormat.format(
                "3. Ціле: {0}; відсотки: {1,number,percent}; текст: {2}; логічне: {3}",
                number, decimal, text, logical));

        System.out.println(MessageFormat.format(
                "4. Ціле: {0}; дробове як ціле: {1,number,integer}; текст: {2}; логічне: {3}",
                number, decimal, text, logical));

        System.out.format("5. Ціле: %d; дробове: %.2f; текст: %s; логічне: %b%n",
                number, decimal, text, logical);

        System.out.format("6. Вісімкове: %o; дробове: %.3f; текст: %s; логічне: %b%n",
                number, decimal, text, logical);

        System.out.format("7. Шістнадцяткове: %x; дробове: %e; текст: %s; логічне: %b%n",
                number, decimal, text, logical);

        System.out.format("8. Ціле: %06d; дробове: %+.2f; текст: |%15s|; логічне: %b%n",
                number, decimal, text, logical);

        System.out.format("9. Ціле: %+d; дробове: |%10.2f|; текст: |%-15s|; логічне: %b%n",
                number, decimal, text, logical);

        System.out.format("10. Ціле: %d; дробове: %.1f; текст: |%15.5s|; логічне: %b%n",
                number, decimal, text, logical);

        scanner.close();
    }
}