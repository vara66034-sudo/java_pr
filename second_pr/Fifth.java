import java.util.Scanner;
import java.util.InputMismatchException;
public class Fifth {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean isRunning = true;

        while (isRunning) {
            showMenu();
            int choice = getValidMenuChoice();

            switch (choice) {
                case 1:
                    calculate();
                    break;
                case 2:
                    showProgramInfo();
                    break;
                case 3:
                    showDeveloperInfo();
                    break;
                case 4:
                    System.out.println("Программа завершена.");
                    isRunning = false;
                    break;
            }
        }
    }

    static void showMenu() {
        System.out.println("\nГлавное меню:");
        System.out.println("1. Вычислить площадь треугольника");
        System.out.println("2. Информация о программе");
        System.out.println("3. Информация о разработчике");
        System.out.println("4. Выход");
        System.out.print("Выберите пункт: ");
    }

    static int getValidMenuChoice() {
        while (true) {
            try {
                int choice = scanner.nextInt();
                if (choice >= 1 && choice <= 4) {
                    return choice;
                } else {
                    System.out.print("Введите число от 1 до 4: ");
                }

            } catch (InputMismatchException e) {
                System.out.print("Ошибка! Введите число от 1 до 4: ");
                scanner.nextLine();
            }
        }
    }

    static void calculate() {
        System.out.println("\nРасчет площади по формуле Герона.");

        while (true) {
            double a = getValidPositiveDouble("Введите сторону a: ");
            double b = getValidPositiveDouble("Введите сторону b: ");
            double c = getValidPositiveDouble("Введите сторону c: ");

            if (a + b <= c || a + c <= b || b + c <= a) {
                System.out.println("Ошибка: такого треугольника не существует.");
                System.out.println("Повторите ввод сторон.");
                continue;
            }

            double area = heron(a, b, c);
            System.out.println("Площадь треугольника: " + area);
            break;
        }
    }

    static double getValidPositiveDouble(String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                double value = scanner.nextDouble();

                if (Double.isFinite(value) && value > 0) {
                    return value;
                } else {
                    System.out.println("Ошибка! Сторона должна быть положительным числом.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Ошибка! Введите корректное число.");
                scanner.nextLine();
            }
        }
    }

    static double heron(double a, double b, double c) {
        double p = (a + b + c) / 2;
        double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return area;
    }

    static void showProgramInfo() {
        System.out.println("\nО программе");
        System.out.println("Программа вычисляет площадь треугольника");
        System.out.println("по трем сторонам с помощью формулы Герона.");
    }

    static void showDeveloperInfo() {
        System.out.println("\nО разработчике");
        System.out.println("Разработчик: Андреева Варвара");
        System.out.println("Группа: РИ-250931");
    }
}
