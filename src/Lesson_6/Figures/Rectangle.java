package Lesson_6.Figures;

public class Rectangle extends Figure {
    private int a;
    private int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }



    @Override
    double countSquare() {
        return a * b;
    }

    @Override
    double countPerimeter() {
        return  (2 * (a + b));
    }
}
