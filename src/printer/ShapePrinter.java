package printer;

import shapes.Shape;

public class ShapePrinter implements Printable<Shape> {
    @Override
    public void print(Shape shape) {
        System.out.println(shape.getName());
    }


}
