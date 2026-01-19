package practise;

import java.util.Scanner;

public class Tasks {

        public static void main(String[] args) {

            /*
             * =====================================================
             * 1️⃣ ПЕРЕМЕННЫЕ, ПРИМИТИВНЫЕ И ССЫЛОЧНЫЕ ТИПЫ, ЛОГИЧЕСКИЕ ОПЕРАТОРЫ
             * =====================================================
             */
            System.out.println("=== Задание 1.1 — Простейшие переменные ===");
            // TODO: Создай переменные всех примитивных типов
            byte a = 10;
            short b = 240;
            int c = 120;
            long d = 12345698L;
            float e = 14.2f;
            double f = 12.22;
            boolean g = false;
            char h = 'S';
            String i = "Yo";

            System.out.println(
                    "byte: " + a + "\n" +
                    "short: " + b + "\n" +
                    "int: " + c + "\n" +
                    "long: " + d + "\n" +
                    "float: " + e + "\n" +
                    "double: " + f + "\n" +
                    "boolean: " + g + "\n" +
                    "char: " + h + "\n" +
                    "String: " + i
            );
            // Присвой им значения и выведи в консоль

            System.out.println("\n=== Задание 1.2 — Логические операции ===");
            // TODO: Создай две переменные int a и int b
            int a1 = 10;
            int b1 = 50;
            boolean result = a1 > 0 && b1 < 100;
            System.out.println("Result: " + result);
            // Создай boolean result:
            // true, если a > 0 и b < 100
            // Выведи result в консоль

            System.out.println("\n=== Задание 1.3 — Ссылочные типы ===");
            // TODO: Создай массив из 5 чисел
            int num[] = {1, 2, 3, 4, 69};
            int copyNum[] = num;
            System.out.println("Original num from array is: " + num[4]);
            copyNum[4] = 67;
            System.out.println("Copy and changed num in array is: " + copyNum[4]);

            // Скопируй массив в другую переменную
            // Измени первый элемент копии
            // Выведи оба массива и объясни результат

            System.out.println("\n=== Задание 1.4 — String ===");
            // TODO: Создай две строки s1 и s2
            String s1 = "Yo!";
            String s2 = "Hello!";
            System.out.println("Original first is: " + s1);
            System.out.println("Original second is: " + s2);
            s2 = s1;
            s2 = "Now its little different";
            System.out.println("Changed first is: " + s1);
            System.out.println("Changed second is: " + s2);
            // Присвой s2 = s1
            // Измени s2 на другую строку
            // Выведи s1 и s2
            // Объясни, почему s1 не изменился

            /*
             * =====================================================
             * 2️⃣ ОПЕРАТОРЫ ВЕТВЛЕНИЯ (if / else / switch)
             * =====================================================
             */

            System.out.println("\n=== Задание 2.1 — Оценки ===");
            // TODO: Создай int score (0-100)
            Scanner score = new Scanner(System.in);
            System.out.println("Enter your score: ");
            int score1 = score.nextInt();
            if (score1 >= 90 && score1 <= 100) {
                System.out.println("Excellent");
            } else if (score1 >= 70 && score1 < 90) {
                System.out.println("Good");
            } else if (score1 >= 50 && score1 < 70) {
                System.out.println("Satisfactory");
            } else if (score1 < 50) {
                System.out.println("Not passed");
            }
            // Используя if / else if / else, выведи:
            // 90-100 → "Отлично"
            // 70-89 → "Хорошо"
            // 50-69 → "Удовлетворительно"
            // <50 → "Не сдано"

            System.out.println("\n=== Задание 2.2 — Дни недели ===");
            // TODO: Создай int day (1-7)
            Scanner day = new Scanner(System.in);
            System.out.println("Enter day number (1-7): ");
            int dayNum = day.nextInt();
            switch (dayNum) {
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
                    System.out.println("Incorrect day");
            }
            // Используя switch, выведи день недели
            // Для всех значений, кроме 1–7, вывести "Некорректный день"

            System.out.println("\n=== Задание 2.3 — Проверка числа ===");
            // TODO: Создай int number
            Scanner number = new Scanner(System.in);
            System.out.println("Enter your number: ");
            int numCheck = number.nextInt();
            if (numCheck > 0) {
                System.out.println("Положительное");
            } else if (numCheck < 0) {
                System.out.println("Отрицательное");
            } else {
                System.out.println("Ноль");
            }
            // Если число >0 → "Положительное"
            // Если число <0 → "Отрицательное"
            // Если число ==0 → "Ноль"

            /*
             * =====================================================
             * 3️⃣ ЦИКЛЫ И ИТЕРАЦИИ
             * =====================================================
             */

            System.out.println("\n=== Задание 3.1 — Счётчик (for) ===");
            // TODO: Используя for, выведи числа от 1 до 10
            for (int i1 = 1; i1 <= 10; i1++) {
                System.out.println(i1);
            }

            System.out.println("\n=== Задание 3.2 — Сумма чисел (for) ===");
            // TODO: Используя for, посчитай сумму чисел от 1 до 100 и выведи результат
            for (int i2 = 1; i2 <= 100; i2++) {
                int sum = 0;
                sum += i2;
                System.out.println("Sum is: " + sum);
            }

            System.out.println("\n=== Задание 3.3 — Числа в обратном порядке (while) ===");
            // TODO: Используя while, выводи числа от 10 до 1 в обратном порядке
            int i3 = 10;
            while (i3 >= 1) {
                System.out.println(i3);
                i3--;
            }

            System.out.println("\n=== Задание 3.4 — Ввод числа до >100 (do-while) ===");
            // TODO: Используя do-while, спрашивай пользователя вводить число
            Scanner input = new Scanner(System.in);
            int numberInput;
            do {
                System.out.println("Please enter a number greater than 100: ");
                numberInput = input.nextInt();
            } while (numberInput <= 100);
            // Пока число <=100

            System.out.println("\n=== Задание 3.5 — Массив и итерации ===");
            // TODO: Создай массив из 5 чисел
            int[] numbers = {2, 4, 6, 8, 10};
            for (int num1 : numbers) {
                System.out.println(num1);
            }
            for (int i4 = 0; i4 < numbers.length; i4++) {
                numbers[i4] *= 2;
                System.out.println(numbers[i4]);
            }
            // Используя for-each, выведи все элементы массива
            // Используя for с индексом, умножь каждый элемент на 2 и выведи новый массив
        }

    }


