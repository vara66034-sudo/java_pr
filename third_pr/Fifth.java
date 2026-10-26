import java.util.Scanner;

public class Fifth {
    static Scanner scanner = new Scanner(System.in);

    static void main() {
        int choice = -1;

        while (choice != 0) {
            System.out.println("\nГлавное меню:");
            System.out.println("1. Вычислить площадь треугольника");
            System.out.println("2. Информация о программе");
            System.out.println("3. Информация о разработчике");
            System.out.println("0. Выход");
            System.out.print("Выберите пункт: ");

            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
            } else {
                System.out.println("Ошибка: введите номер пункта.");
                scanner.next();
                continue;
            }

            if (choice == 1) {
                calculate();
            } else if (choice == 2) {
                info();
            } else if (choice == 3) {
                developer();
            } else if (choice == 0) {
                System.out.println("Программа завершена.");
            } else {
                System.out.println("Ошибка: такого пункта нет.");
            }
        }

        scanner.close();
    }

    static void calculate() {
        System.out.println("Расчет площади по формуле Герона.");
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

        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("Ошибка: стороны должны быть больше нуля.");
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

    static void info() {
        System.out.println("Программа вычисляет площадь треугольника");
        System.out.println("по трем сторонам с помощью формулы Герона.");
    }

    static void developer() {
        System.out.println("Разработчик: Андреева Варвара");
    }
}
