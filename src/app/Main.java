package app;

public class Main {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Введіть ціле число: ");
        int number = scanner.nextInt();
        int square = squareNumber(number);
        System.out.println("Квадрат числа " + number + " дорівнює " + square + ".");

        System.out.print("Введіть радіус циліндра: ");
        double radius = scanner.nextDouble();
        System.out.print("Введіть висоту циліндра: ");
        double height = scanner.nextDouble();
        double volume = calculateCylinderVolume(radius, height);
        System.out.println("Об'єм циліндра з радіусом " + radius + " і висотою " + height + " дорівнює " + volume + ".");

        System.out.print("Введіть масив чисел (розділяючи елементи комою): ");
        scanner.nextLine();
        String arrayInput = scanner.nextLine();
        int[] array = parseArray(arrayInput);
        int sum = calculateArraySum(array);
        System.out.println("Сума всіх елементів масиву дорівнює " + sum + ".");

        System.out.print("Введіть рядок: ");
        String inputString = scanner.nextLine();
        String reversedString = reverseString(inputString);
        System.out.println("Рядок в зворотньому порядку: " + reversedString + ".");

        System.out.print("Введіть a: ");
        int a = scanner.nextInt();
        System.out.print("Введіть b: ");
        int b = scanner.nextInt();
        int result = powerOf(a, b);
        System.out.println("Результат " + a + "^" + b + " дорівнює " + result + ".");

        System.out.print("Введіть ціле число n: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Введіть текстовий рядок: ");
        String text = scanner.nextLine();
        printTextMultipleTimes(text, n);
    }

    public static int squareNumber(int number) {
        return number * number;
    }

    public static double calculateCylinderVolume(double radius, double height) {
        return Math.PI * radius * radius * height;
    }

    public static int[] parseArray(String input) {
        String[] elements = input.split(",");
        int[] array = new int[elements.length];
        for (int i = 0; i < elements.length; i++) {
            array[i] = Integer.parseInt(elements[i].trim());
        }
        return array;
    }

    public static int calculateArraySum(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    public static String reverseString(String input) {
        StringBuilder reversed = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }
        return reversed.toString();
    }

    public static int powerOf(int a, int b) {
        return (int) Math.pow(a, b);
    }

    public static void printTextMultipleTimes(String text, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(text);
        }
    }
}