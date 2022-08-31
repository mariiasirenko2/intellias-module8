package shapes;

public abstract class Shape {
    private final String SHAPE_NAME;

    public Shape(String SHAPE_NAME) {
        this.SHAPE_NAME = SHAPE_NAME;
    }

    public String getName() {
        return SHAPE_NAME;
    }

}
