package shapes.polygon;

public class RegularPolygon extends Polygon {
    private static final String SHAPE_NAME = "Regular Polygon";

    private double sideLength;

    public RegularPolygon(int vertexQuantity, int startPointX, int startPointY, double sideLength) {
        super(SHAPE_NAME, vertexQuantity, startPointX, startPointY);
        this.sideLength = sideLength;
    }

    public RegularPolygon(int vertexQuantity, double sideLength) {
        this(vertexQuantity, 0, 0, sideLength);
    }

    public double getSideLength() {
        return sideLength;
    }

    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }

}
