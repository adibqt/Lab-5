public abstract class shape {
    protected  int x;
    protected int y;

    public shape(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public abstract double calculateArea();

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
