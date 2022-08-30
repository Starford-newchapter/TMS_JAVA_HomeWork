package Lesson_6.Figures;

public class Triangle extends Figure {
    private int a;
    private int h;
    private int b;
    private int c;


    public Triangle(int a, int b, int c,int h) {
        this.a = a;
        this.h = h;
        this.b = b;
        this.c = c;
    }
    double countSquare(){
        return  Math.round(0.5 * a * h);
    }

    @Override
    double countPerimeter() {
        return (a + b + c);
    }

}

