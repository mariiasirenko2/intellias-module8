package shapes.rounded;

public class Circle extends Round {
    private static final String SHAPE_NAME = "Circle";
    private double radius;


    public Circle(int centerX, int centerY, double radius) {
        super(SHAPE_NAME, centerX, centerY);
        this.radius = radius;
    }

    public Circle(double radius) {
        this(0, 0, radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


}
