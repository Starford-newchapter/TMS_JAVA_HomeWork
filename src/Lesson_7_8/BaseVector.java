package Lesson_7_8;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BaseVector that = (BaseVector) o;
        return x == that.x && y == that.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
