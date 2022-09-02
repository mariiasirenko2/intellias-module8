package printer;

import shapes.Shape;

public class ShapePrinter implements Printer {
    @Override
    public void print(Shape shape) {
        System.out.println(shape.getName());
    }


}
