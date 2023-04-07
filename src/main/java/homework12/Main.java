package homework12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть коефіцієнт a: ");
        double a = scanner.nextDouble();
        System.out.print("Введіть коефіцієнт b: ");
        double b = scanner.nextDouble();
        System.out.print("Введіть коефіцієнт c: ");
        double c = scanner.nextDouble();

        QuadraticEquationSolver solver = new QuadraticEquationSolver(a,b,c);
        double[] roots = solver.solve();

        System.out.println("Рівняння " + solver + " має корені:");

        if (roots.length == 0) {
            System.out.println("Корені відсутні");
        } else {
            for (int i = 0; i < roots.length; i++) {
                System.out.println("x" + (i + 1) + " = " + roots[i]);
            }
        }
    }
}

