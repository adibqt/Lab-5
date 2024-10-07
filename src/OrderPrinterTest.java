import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
public class OrderPrinterTest {
    @Test
    public void testSquareAreaCalculation() {
        square square = new square(0, 0, 4);
        assertEquals(16.01, square.calculateArea(), 0.01);
    }
    @Test
    public void testRectangleAreaCalculation() {
        rectangle rectangle = new rectangle(0, 0, 4, 5);
        assertEquals(20, rectangle.calculateArea(), 0.01);
    }

    @Test
    public void testCircleAreaCalculation() {
        circle circle = new circle(0, 0, 3);
        assertEquals(28.26, circle.calculateArea(), 0.01);
    }

    @Test
    public void testSortingByArea() {
        List<shape> shapes = new ArrayList<>();
        shapes.add(new square(0, 0, 1));
        shapes.add(new circle(0, 0, 1));
        shapes.add(new rectangle(0, 0, 1, 5));

        OrderPrinter printer = new OrderPrinter();
        List<shape> sortedShapes = printer.sortShapes(shapes);

        assertEquals(3.14, sortedShapes.get(1).calculateArea(), 0.01);
        assertEquals(5, sortedShapes.get(2).calculateArea(), 0.01);
        assertEquals(1, sortedShapes.get(0).calculateArea(), 0.01);
    }

    @Test
    public void testSortingByXPositionWhenAreasAreEqual() {
        List<shape> shapes = new ArrayList<>();
        shapes.add(new square(2, 0, 2));  // Area = 4, x = 2
        shapes.add(new square(1, 0, 2));  // Area = 4, x = 1

        OrderPrinter printer = new OrderPrinter();
        List<shape> sortedShapes = printer.sortShapes(shapes);

        assertEquals(1, sortedShapes.get(0).getX());
        assertEquals(2, sortedShapes.get(1).getX());
    }
    @Test

    public void testSortingByYPositionWhenAreasAndXAreEqual() {
        List<shape> shapes = new ArrayList<>();
        shapes.add(new square(1, 2, 2));  // Area = 4, x = 1, y = 2
        shapes.add(new square(1, 1, 2));  // Area = 4, x = 1, y = 1

        OrderPrinter printer = new OrderPrinter();
        List<shape> sortedShapes = printer.sortShapes(shapes);

        assertEquals(1, sortedShapes.get(0).getY());
        assertEquals(2, sortedShapes.get(1).getY());
    }
    @Test
    public void testNegativeCoordinates() {
        circle circle = new circle(-3, -3, 2);
        assertEquals(12.57, circle.calculateArea(), 0.01);
    }

    @Test
    public void testDifferentShapeOrdering() {
        List<shape> shapes = new ArrayList<>();
        shapes.add(new circle(1, 1, 2));  // Area = 12.57
        shapes.add(new rectangle(1, 1, 2, 6)); // Area = 12

        OrderPrinter printer = new OrderPrinter();
        List<shape> sortedShapes = printer.sortShapes(shapes);

        assertEquals(12, sortedShapes.get(0).calculateArea(), 0.01);
        assertEquals(12.57, sortedShapes.get(1).calculateArea(), 0.01);
    }
    @Test
    public void testSortingWithSameCoordinates() {
        List<shape> shapes = new ArrayList<>();
        shapes.add(new circle(0, 0, 1)); // Area = 3.14
        shapes.add(new circle(0, 0, 2)); // Area = 12.57

        OrderPrinter printer = new OrderPrinter();
        List<shape> sortedShapes = printer.sortShapes(shapes);

        assertEquals(3.14, sortedShapes.get(0).calculateArea(), 0.01);
        assertEquals(12.57, sortedShapes.get(1).calculateArea(), 0.01);
    }
    @Test
    public void testShapeWithZeroArea() {
        square square = new square(0, 0, 0);
        assertEquals(0, square.calculateArea(), 0.01);
    }




}
