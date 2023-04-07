package homework12;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QuadraticEquationSolverTest {

    @Test
    public void testTwoRealRoots() {
        QuadraticEquationSolver solver = new QuadraticEquationSolver(1, -5, 6);
        double[] roots = solver.solve();
        Assertions.assertEquals(2, roots.length);
        Assertions.assertEquals(3.0, roots[0]);
        Assertions.assertEquals(2.0, roots[1]);
    }

    @Test
    public void testOneRealRoot() {
        QuadraticEquationSolver solver = new QuadraticEquationSolver(1, -4, 4);
        double[] roots = solver.solve();
        Assertions.assertEquals(1, roots.length);
        Assertions.assertEquals(2.0, roots[0]);
    }

    @Test
    public void testNoRealRoots() {
        QuadraticEquationSolver solver = new QuadraticEquationSolver(1, 2, 3);
        double[] roots = solver.solve();
        Assertions.assertEquals(0, roots.length);
    }
}