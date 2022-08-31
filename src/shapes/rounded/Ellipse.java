package shapes.rounded;

public class Ellipse extends Round {

    private static final String SHAPE_NAME = "Ellipse";
    private double radiusX;
    private double radiusY;

    public Ellipse(int centerX, int centerY, double radiusX, double radiusY) {
        super(SHAPE_NAME, centerX, centerY);
        this.radiusX = radiusX;
        this.radiusY = radiusY;
    }


    public Ellipse(double radiusX, double radiusY) {
        this(0, 0, radiusX, radiusY);
    }

    public double getRadiusX() {
        return radiusX;
    }

    public double getRadiusY() {
        return radiusY;
    }

    public void setRadiusX(double radiusX) {
        this.radiusX = radiusX;
    }

    public void setRadiusY(double radiusY) {
        this.radiusY = radiusY;
    }


}
