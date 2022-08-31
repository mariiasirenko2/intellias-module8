package shapes.polygon;

public class Rectangle extends Polygon {
    private static final String SHAPE_NAME = "Rectangle";
    private static final int RECTANGLE_VERTEX_COUNT = 4;

    private double height;
    private double width;

    public Rectangle(int startPointX, int startPointY, double height, double width) {
        super(SHAPE_NAME, RECTANGLE_VERTEX_COUNT, startPointX, startPointY);
        this.height = height;
        this.width = width;
    }

    public Rectangle(double height, double width) {
        this(0, 0, height, width);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

}
