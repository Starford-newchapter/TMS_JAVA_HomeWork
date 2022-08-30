package Lesson_6.Figures;

public class Circle extends Figure {
    private double r;

    public Circle(double r) {
        this.r = r;
    }


    @Override
    double countSquare() {
        return Math.round(3.14 * Math.pow(r, 2));
    }

    @Override
    double countPerimeter() {
        return Math.round(2 * 3.14 * r);
    }
}
