import java.util.*;
public class OrderPrinter {
    public  List<shape> sortShapes(List<shape> shapes){
        shapes.sort(Comparator.comparingDouble(shape::calculateArea)
                .thenComparingInt(shape:: getX)
                .thenComparingInt(shape::getY));
        return shapes;


    }
}
