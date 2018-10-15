package interview.dmh.lidp.geom;

/**
 * The locus of points in a plane that are equidistant from a central point.
 * (The really round 2D shape!)
 */
public class Circle {
    
    //Note to Developers: keep this class immutable.
    
    //IDEA.  Future extensions: Comparable<Circle>, equals(other)
    //IDEA.  Decide if BigDecimal radius is needed for our expected use of this class.

    //Input
    private double radius;
    
    //Derived just-in-time
    private Double circumference;
    private Double area;
    
    /**
     * Creates a new circle whose radius is the given number of units.
     * 
     * @param radius
     *   the radius of this circle.
     *   Must be a positive real number.
     *   
     * @throws IllegalArgumentException
     *   if radius is not positive
     */
    public Circle(double radius) {
        
        if (radius <= 0.0) {
            throw new IllegalArgumentException("Circle may not have radius of " + radius +
                                               " - it must be a positive value.");
        }
        
        //TODO: might want to protect against radius so big that 
        //      other calcs overflow double
        
        this.radius = radius;
    }
    
    /**
     * Returns the radius of this circle.
     * The radius is a line segment running from the center to any
     * point on the circle.
     */
    public double getRadius() {
        return radius;
    }
    
    /**
     * Returns the diameter of this circle.
     * The diameter is a line segment that has both its ends
     * on the circle and passes through the center.
     */
    public double getDiameter() {
        return 2.0 * radius;
    }
    
    /**
     * Returns the circumference of this circle.
     */
    public double getCircumference() {
        //Calculate once and cache
        if (circumference == null) {
            circumference = getRadius() * Math.PI;
        }
        
        return circumference;
    }
    
    /**
     * Returns the area of this circle.
     */
    public double getArea() {
        //Calculate once and cache
        if (area == null) {
            double r = getRadius();
            area = r * r * Math.PI;
        }
        
        return area;
    }
}
