package Lesson_7_8;

public abstract class BaseVector {
    protected int x;
    protected  int y;

    abstract double getLengthVector();

    @Override
    public String toString() {
        return "BaseVector{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public BaseVector(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
