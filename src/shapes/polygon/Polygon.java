package shapes.polygon;

import shapes.Shape;

public abstract class Polygon extends Shape {

    private final int VERTEX_QUANTITY;
    private int startPointX;
    private int startPointY;


    public Polygon(String shapeName, int vertexQuantity, int startPointX, int startPointY) {
        super(shapeName);
        this.VERTEX_QUANTITY = vertexQuantity;
        this.startPointX = startPointX;
        this.startPointY = startPointY;
    }

    public int getVERTEX_QUANTITY() {
        return VERTEX_QUANTITY;
    }

    public int getStartPointX() {
        return startPointX;
    }

    public void setStartPointX(int startPointX) {
        this.startPointX = startPointX;
    }

    public int getStartPointY() {
        return startPointY;
    }

    public void setStartPointY(int startPointY) {
        this.startPointY = startPointY;
    }
}
