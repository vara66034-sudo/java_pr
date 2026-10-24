import java.util.Scanner;

public class Fourth {
    static double distance(double x1, double y1, double z1,
                           double x2, double y2, double z2) {
        double d = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) + Math.pow(z2 - z1, 2));
        return d;
    }

    static void main() {
        Scanner scanner = new Scanner(System.in);
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double z1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        double z2 = scanner.nextDouble();

        double result = distance(x1, y1, z1, x2, y2, z2);

        System.out.println("Расстояние: " + result);
    }
}
