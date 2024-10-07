public class circle extends shape{
    private final double pie = 3.14;
    private  double  radius;

    public circle(int x, int y, double radius) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return pie*radius*radius;
    }
}

