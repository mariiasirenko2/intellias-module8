package shapes.polygon;

public class IrregularPolygon extends Polygon {

    private static final String SHAPE_NAME = "Irregular Polygon";

    private int[] xCoords;
    private int[] yCoords;

    public IrregularPolygon(int vertexQuantity, int startPointX, int startPointY, int[] xCoords, int[] yCoords) {
        super(SHAPE_NAME, vertexQuantity, startPointX, startPointY);
        this.xCoords = xCoords;
        this.yCoords = yCoords;
    }

    public IrregularPolygon(int vertexQuantity, int[] xCoords, int[] yCoords) {
        this(vertexQuantity, 0, 0, xCoords, yCoords);
    }

    public int[] getxCoords() {
        return xCoords;
    }

    public void setxCoords(int[] xCoords) {
        this.xCoords = xCoords;
    }

    public int[] getyCoords() {
        return yCoords;
    }

    public void setyCoords(int[] yCoords) {
        this.yCoords = yCoords;
    }


}
