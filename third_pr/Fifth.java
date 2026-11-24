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
        scanner.close();
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
            double[] sides = input();
            if (check(sides)) {
                double area = heron(sides);
                output(area);
                break;
            }
            System.out.println("Повторите ввод сторон.");
        }
    }

    static double[] input() {
        double[] sides = new double[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Введите сторону " + (i + 1) + ": ");

            while (!scanner.hasNextDouble()) {
                System.out.println("Ошибка: введите число.");
                scanner.next();
                System.out.print("Повторите ввод: ");
            }
            sides[i] = scanner.nextDouble();
        }
        return sides;
    }

    static boolean check(double[] sides) {
        double a = sides[0];
        double b = sides[1];
        double c = sides[2];

        if (!Double.isFinite(a) || !Double.isFinite(b) || !Double.isFinite(c)
                || a <= 0 || b <= 0 || c <= 0) {
            System.out.println("Ошибка: стороны должны быть положительными конечными числами.");
            return false;
        }

        if (a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("Ошибка: такого треугольника не существует.");
            return false;
        }
        return true;
    }

    static double heron(double[] sides) {
        double a = sides[0];
        double b = sides[1];
        double c = sides[2];
        double p = (a + b + c) / 2;
        double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return area;
    }

    static void output(double area) {
        System.out.println("Площадь треугольника: " + area);
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
