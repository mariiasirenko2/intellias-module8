import printer.ShapePrinter;
import shapes.Shape;
import shapes.polygon.IrregularPolygon;
import shapes.polygon.Rectangle;
import shapes.polygon.RegularPolygon;
import shapes.polygon.Triangle;
import shapes.rounded.Circle;
import shapes.rounded.Ellipse;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Shape> shapes = new ArrayList<>();

        shapes.add(new Circle(10));
        shapes.add(new Ellipse(1, 1, 10, 15));
        shapes.add(new Triangle(5, 4, 3));
        shapes.add(new Rectangle(1, 2));
        shapes.add(new RegularPolygon(5, 10, -3, 4));
        shapes.add(new IrregularPolygon(6, 0, 10
                , new int[]{1, 2, 3, 4, 5, 6}
                , new int[]{1, 2, 3, 4, 5, 6}));

        ShapePrinter printer = new ShapePrinter();

        for (Shape s : shapes) {
            printer.print(s);
        }

    }
}

