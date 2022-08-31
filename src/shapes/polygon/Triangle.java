package shapes.polygon;

public class Triangle extends Polygon {

    private static final String SHAPE_NAME = "Triangle";
    private static final int VERTEX_COUNT = 3;

    private double sideAB;
    private double sideBC;
    private double sideCA;

    public Triangle(int startPointX, int startPointY, double sideAB, double sideBC, double sideCA) {
        super(SHAPE_NAME, VERTEX_COUNT, startPointX, startPointY);
        this.sideAB = sideAB;
        this.sideBC = sideBC;
        this.sideCA = sideCA;
    }

    public Triangle(double sideAB, double sideBC, double sideCA) {
        this(0, 0, sideAB, sideBC, sideCA);
    }

    public double getSideAB() {
        return sideAB;
    }

    public void setSideAB(double sideAB) {
        this.sideAB = sideAB;
    }

    public double getSideBC() {
        return sideBC;
    }

    public void setSideBC(double sideBC) {
        this.sideBC = sideBC;
    }

    public double getSideCA() {
        return sideCA;
    }

    public void setSideCA(double sideCA) {
        this.sideCA = sideCA;
    }

}
