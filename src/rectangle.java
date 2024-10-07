public class rectangle extends shape {
    private int height;
    private  int width;

    public rectangle(int x, int y, int height, int width) {
        super(x, y);
        this.height = height;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return height*width;
    }
}
