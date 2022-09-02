package shapes.rounded;

import shapes.Shape;

public abstract class Round extends Shape {
    public static final double PI = 3.14159265359;
    private int centerX;
    private int centerY;

    public Round(String shapeName, int centerX, int centerY) {
        super(shapeName);
        this.centerX = centerX;
        this.centerY = centerY;
    }

    public int getCenterX() {
        return centerX;
    }

    public int getCenterY() {
        return centerY;
    }

    public void setCenterX(int centerX) {
        this.centerX = centerX;
    }

    public void setCenterY(int centerY) {
        this.centerY = centerY;
    }
}
