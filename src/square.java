public class square extends shape{
    private double sideLenth;

    public square(int x, int y, double sideLenth) {
        super(x, y);
        this.sideLenth = sideLenth;
    }

    @Override
    public double calculateArea() {
        return sideLenth*sideLenth;
    }
}
