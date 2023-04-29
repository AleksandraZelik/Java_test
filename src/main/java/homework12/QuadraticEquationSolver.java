package homework12;
    public class QuadraticEquationSolver {
        final private double a;
        final private double b;
        final private double c;

        public QuadraticEquationSolver(double a, double b, double c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
        public double[] solve() {
            double[] roots;
            double discriminant = b * b - 4 * a * c;
            if (discriminant > 0) {
                roots = new double[2];
                roots[0] = (-b + Math.sqrt(discriminant)) / (2 * a);
                roots[1] = (-b - Math.sqrt(discriminant)) / (2 * a);
            } else if (discriminant == 0) {
                roots = new double[1];
                roots[0] = -b / (2 * a);
            } else {
                roots = new double[0];
            }
            return roots;
        }
    }