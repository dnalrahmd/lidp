package interview.dmh.lidp.geom;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;

/**
 * Tests the methods of {@link Circle}.
 */
public class CircleTest {

    private final long   seed   = System.currentTimeMillis();
    private final Random random = new Random(seed);

    /**
     * Test the getArea method indirectly by making sure that if
     * the ratio of two radii is x, then the ratio of the areas
     * of those circles is x^2.
     */
    @Test
    public void testRadiusAreaRatio() {
        
        final double epsilon = 1e-10;
        
        for (int trial = 1; trial <= 1000; trial++) {
            
            int multiplier = 1 + random.nextInt(10);
            
            double r1 = randomRadius(100);
            double r2 = r1 * multiplier;
            
            Circle c1 = new Circle(r1);
            Circle c2 = new Circle(r2);
            
            double area1 = c1.getArea();
            double area2 = c2.getArea();
            
            double areaRatio     = area2 / area1;
            double expectedRatio = multiplier * multiplier;
            
            //TODO put seed value and trial # into message for easier debugging
            assertEquals("Radius ratio of " + multiplier + " should have given area ratio of " + expectedRatio,
                         expectedRatio, areaRatio, epsilon);
        }
    }
    
    /* Return a positive, random, radius no larger than max. */
    private double randomRadius(int max) {
        double r = 0.0;
        
        while (r == 0.0) {
            r = random.nextDouble();
        }
        
        return r * (1.0 + random.nextInt(max));
    }
}
