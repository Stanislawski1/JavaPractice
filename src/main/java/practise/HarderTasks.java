package practise;

import incapsulation.Car;
import incapsulation.Product;
import utils.DrawImage;

import java.util.*;
import java.util.stream.Stream;

import static utils.DrawImage.drawImageAsAscii;

public class HarderTasks {

    public static void main(String[] args) {
        printResult();
        isNumPositive();
        useArray();
        sumStrings("hello, ", "world!");
        checkAccess("20");
        containsTool(new String[]{"Selenium", "Cucumber", "JUnit", "TestNG", "Appium"}, "JUnit");
        useStringBuilder(new String[]{"Selenium", "Cucumber", "JUnit", "TestNG", "Appium"});
        safeDivide(14,0);
        manageWishList();
        userDataBase();
        printCarInformation("Chevrolet Impala", "Black", 1967);
        useStreamAPI();
        printAnything(Car.class);
        drawImageAsAscii("src/main/resources/images/car.jpg");
        useProductFiltration();
        waitTillLoadingComplete();
    }

    //TODO: Реализовать метод по сложению двух чисел и выводу результата в консоль
    public static void printResult() {
        System.out.println("Enter two integers: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int result = a + b;
        System.out.println("Result: " + result);
    }

    //TODO: Реализовать метод проверки, является ли число положительным, либо отрицательным
    public static void isNumPositive() {
        System.out.println("Enter your number: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if(num >=0) {
            System.out.println("Your number is positive!");
        }else {
            System.out.println("Your number is negative!");
        }
    }

    //TODO: Реализовать метод использования массива строк и вывода их в консоль с сообщением
    public static void useArray() {
        String[] tools = {"Selenium", "Cucumber", "JUnit", "TestNG", "Appium"};
        for(String tool : tools) {
            System.out.println("I will automate using " + tool);
        }
    }

    //TODO: Реализовать метод по сложению двух строк (конкатенация) и выводу результата в консоль в верхнем регистре
    public static void sumStrings(String word1, String word2) {
        System.out.println("Enter two word's: ");
        String result = word1 + word2;
        result = result.toUpperCase();
        System.out.println("Result: " + result);
    }

    //TODO: Реализовать метод по проверке, имеет ли пользователь доступ к ресурсу в зависимости от возраста
    public static void checkAccess(String age) {
        int userAge = Integer.parseInt(age);
        if(userAge >= 18) {
            System.out.println("Access granted");
        }else {
            System.out.println("Access denied");
        }
    }

    //TODO: Реализовать метод по проверке, содержит ли массив строк указанную строку (независимо от регистра)
    public static void containsTool(String[] tools, String toolName) {
        boolean contains = false;
        for (String tool : tools) {
            if (tool.equalsIgnoreCase(toolName)) {
                contains = true;
                break;
            }
        }
        if (contains) {
            System.out.println("The array contains the tool: " + toolName);
        } else {
            System.out.println("The array does not contain the tool: " + toolName);
        }
    }

    //TODO: Реализовать метод использования StringBuilder для объединения элементов массива в одну строку
    // с разделителями
    public static void  useStringBuilder(String[] tools) {
        StringBuilder sb = new StringBuilder();
        for (String tool : tools) {
            sb.append(tool).append(", ");
        }
        System.out.println("Tools: " + sb.toString().trim());
    }

    //TODO: Реализовать метод безопасного деления, который обрабатывает возможное исключение при делении на ноль
    public static void safeDivide(int a, int b) {
        try {
            int result = a/b;
            System.out.println("Result is: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed!");
        }
    }

    //TODO: Реализовать метод по управлению списком желаний (Wish List) с использованием ArrayList
    // и выполнением операций добавления, удаления и проверки содержания элементов
    public static void manageWishList() {
        ArrayList<String> wishList = new ArrayList<>();
        wishList.add("New Tattoo");
        wishList.add("Trip to the sea");
        wishList.add("Chevrolet Impala 1967");
        wishList.add("MacBook Pro");
        wishList.removeFirst();
        System.out.println("Is New Tattoo in my wish list? " + wishList.contains("New Tattoo"));
        System.out.println("My wish list: " + wishList);
    }

    //TODO: Реализовать метод создания базы данных пользователей (HashMap) и выполнения операций с ней
    public static void userDataBase() {
        Map<String, String> users = new HashMap<>();
        users.put("user1", "password1");
        users.put("user2", "password2");
        users.put("user3", "password3");
        users.put("user4", "password4");
        users.put("user5", "password5");
        System.out.println("User database: " + users);
        System.out.println("Total users: " + users.size());
        System.out.println("What is user3's password? " + users.get("user3"));
    }

    //TODO: Реализовать метод по созданию экземпляра класса Car и выводу его информации
    // в консоль с использованием сеттеров и геттеров
    public static void printCarInformation(String model, String color, int year) {
        Car myCar = new Car(model, color, year);
        System.out.println("Car Model: " + myCar.getModel());
        System.out.println("Car Color: " + myCar.getColor());
        System.out.println("Car Year: " + myCar.getYear());
    }

    //TODO: Реализовать метод использования Stream API для фильтрации и преобразования массива строк
    public static void useStreamAPI() {
        String[] tools = {"Selenium", "Cucumber", "JUnit", "TestNG", "Appium"};
        long count = Arrays.stream(tools)
                .filter(tool -> tool.length() > 5)
                .map(String::toLowerCase)
                .peek(System.out::println)
                .count();
        System.out.println("Total tools with length > 5: " + count);
    }

    //TODO: Реализовать метод, который может принять любой тип данных и вывести его в консоль
    public static<T> void printAnything(T item) {
        System.out.println("Item: " + item);
    }

    //TODO: Реализовать метод по фильтрации списка продуктов по цене с использованием Stream API
    public static void useProductFiltration() {
        List<Product> products = new ArrayList<>();
        products.add(new Product("IPhone", 999.99));
        products.add(new Product("Apple Watch", 399.99));
        products.add(new Product("Sony Headphones", 199.99));
        products.add(new Product("Samsung Galaxy", 899.99));
        Stream<Product> expensiveProducts = products.stream()
                .filter(product -> product.getPrice() > 500);
        expensiveProducts.forEach(product -> System.out.println("Expensive Product: "
                + product.getName() + " - $" + product.getPrice()));
    }

    //TODO: Реализовать метод по ожиданию завершения загрузки страницы
    // с использованием цикла и механизма ожидания
    public static void waitTillLoadingComplete() {
        String status = "loading";
        int attempts = 0;
        while (status.equals("loading")) {
            attempts++;
            if (attempts > 15) {
                status = "failed";
                System.out.println("Loading failed!");
                return;
            }
            System.out.println("Loading...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
    }   }
        status = "complete";
        System.out.println("Loading complete!");
    }
}
