package shapes.polygon;

public class IrregularPolygon extends Polygon {
    private static final String SHAPE_NAME = "Irregular Polygon";
    private int[] xCoordinates;
    private int[] yCoordinates;

    public IrregularPolygon(int vertexQuantity, int startPointX, int startPointY, int[] xCoordinates, int[] yCoordinates) {
        super(SHAPE_NAME, vertexQuantity, startPointX, startPointY);
        this.xCoordinates = xCoordinates;
        this.yCoordinates = yCoordinates;
    }

    public IrregularPolygon(int vertexQuantity, int[] xCoords, int[] yCoords) {
        this(vertexQuantity, 0, 0, xCoords, yCoords);
    }

    public int[] getxCoordinates() {
        return xCoordinates;
    }

    public void setxCoordinates(int[] xCoordinates) {
        this.xCoordinates = xCoordinates;
    }

    public int[] getyCoordinates() {
        return yCoordinates;
    }

    public void setyCoordinates(int[] yCoordinates) {
        this.yCoordinates = yCoordinates;
    }
}
