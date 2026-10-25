import java.util.Scanner;

public class as4a {

    // 1. Задание Полоска из символов
    public static void printStrip(int n, char symbol) {
        for (int i = 0; i < n; i++) {
            System.out.print(symbol);
        }
        System.out.println();
    }

    // 2. Задание Полый квадрат NxN
    public static void printHollowSquare(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    // 3. Задание  Перевернутая пирамида высотой N
    public static void printInvertedPyramid(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * (n - i) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 4. Задание Матрица N x M с последовательными числами
    public static void printMatrix(int n, int m) {
        int current = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(current + " ");
                current++;
            }
            System.out.println();
        }
    }

    // 5. Задание: Проверка на простое число
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // 6. Задание: Подсчет простых чисел в диапазоне [A, B]
    public static int countPrimesInRange(int a, int b) {
        int count = 0;
        for (int i = a; i <= b; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        return count;
    }

    // 7. Задание: Расчет факториала числа N
    public static long factorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // 8. Задание: Перевод из десятичной системы в двоичную строку
    public static String decimalToBinary(int n) {
        if (n == 0) return "0";
        String binary = "";
        while (n > 0) {
            binary = (n % 2) + binary;
            n = n / 2;
        }
        return binary;
    }

    // 9. Задание: Поиск и вывод чисел Армстронга от 100 до 999
    public static boolean isArmstrong(int n) {
        int original = n;
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit * digit;
            n /= 10;
        }
        return sum == original;
    }

    public static void printArmstrongNumbers() {
        for (int i = 100; i <= 999; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    // 10. Задание: Наибольший общий делитель (НОД / GCD)
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // 11. Задание: Наименьшее общее кратное (НОК / LCM)
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    // 12. Задание: Переворот цифр числа
    public static int reverseNumber(int n) {
        int reversed = 0;
        while (n > 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }
        return reversed;
    }

    // 13. Задание: Вывод X-образного паттерна
    public static void printXPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || i + j == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    // 14. Задание: Преобразование цифр (+1 к четным, -1 к нечетным)
    public static int transformDigits(int n) {
        if (n == 0) return 1;
        int result = 0;
        int place = 1;
        while (n > 0) {
            int digit = n % 10;
            if (digit % 2 == 0) {
                digit += 1;
            } else {
                digit -= 1;
            }
            result = digit * place + result;
            place *= 10;
            n /= 10;
        }
        return result;
    }

    // 15. Задание: Проверка на палиндром
    public static boolean isPalindrome(int n) {
        return n == reverseNumber(n);
    }

    public static void main(String[] args) {
        // Вызовы всех функций для демонстрации работы согласно условиям задач

        System.out.println("--- Task 1: printStrip(7, '#') ---");
        printStrip(7, '#');

        System.out.println("\n--- Task 2: printHollowSquare(4) ---");
        printHollowSquare(4);

        System.out.println("\n--- Task 3: printInvertedPyramid(3) ---");
        printInvertedPyramid(3);

        System.out.println("\n--- Task 4: printMatrix(2, 3) ---");
        printMatrix(2, 3);

        System.out.println("\n--- Task 5: isPrime(29) ---");
        System.out.println(isPrime(29) ? "Prime" : "Not Prime");

        System.out.println("\n--- Task 6: countPrimesInRange(10, 30) ---");
        System.out.println("Prime Count = " + countPrimesInRange(10, 30));

        System.out.println("\n--- Task 7: factorial(5) ---");
        System.out.println("Factorial = " + factorial(5));

        System.out.println("\n--- Task 8: decimalToBinary(13) ---");
        System.out.println("Binary = " + decimalToBinary(13));

        System.out.println("\n--- Task 9: Armstrong numbers ---");
        printArmstrongNumbers();

        System.out.println("\n--- Task 10: gcd(24, 36) ---");
        System.out.println("GCD = " + gcd(24, 36));

        System.out.println("\n--- Task 11: lcm(6, 8) ---");
        System.out.println("LCM = " + lcm(6, 8));

        System.out.println("\n--- Task 12: reverseNumber(1234) ---");
        System.out.println("Output: " + reverseNumber(1234));

        System.out.println("\n--- Task 13: printXPattern(5) ---");
        printXPattern(5);

        System.out.println("\n--- Task 14: transformDigits(983210) ---");
        System.out.println("Output: " + transformDigits(983210));

        System.out.println("\n--- Task 15: isPalindrome(121) ---");
        System.out.println(isPalindrome(121) ? "Palindrome" : "Not Palindrome");
    }
}