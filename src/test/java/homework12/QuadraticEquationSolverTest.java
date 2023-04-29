package homework12;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QuadraticEquationSolverTest {

    @Test
    public void testTwoRealRoots() {
        QuadraticEquationSolver solver = new QuadraticEquationSolver(1, -5, 6);
        double[] roots = solver.solve();
        double[] expectedRoots = new double[]{3.0,2.0};
        Assertions.assertArrayEquals(expectedRoots, roots);
    }

    @Test
    public void testOneRealRoot() {
        QuadraticEquationSolver solver = new QuadraticEquationSolver(1, -4, 4);
        double[] roots = solver.solve();
        double[] expectedRoots = new double[]{2.0};
        Assertions.assertArrayEquals(expectedRoots, roots);
    }

    @Test
    public void testNoRealRoots() {
        QuadraticEquationSolver solver = new QuadraticEquationSolver(1, 2, 3);
        double[] roots = solver.solve();
        double[] expectedRoots = new double[]{};
        Assertions.assertArrayEquals(expectedRoots, roots);
    }
}