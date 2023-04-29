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

        if (roots.length == 0) {
            System.out.println("Рівняння "+ a + "x^2 +" + b + "x +" + c + " = 0 не має коренів");
        } else if (roots.length == 1) {
            System.out.println("Рівняння "+ a + "x^2 +" + b + "x +" + c + " = 0 має корінь:");
            System.out.println("x="+roots[0]);
        } else if (roots.length == 2) {
            System.out.println("Рівняння "+ a + "x^2 +" + b + "x +" + c + " = 0 має корені:");
            System.out.println("x1="+roots[0]);
            System.out.println("x2="+roots[1]);
        }
    }
}

