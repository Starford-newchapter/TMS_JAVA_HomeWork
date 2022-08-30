package Lesson_6.Figures;

public class Main {

    public static void main(String[] args) {
        Triangle triangle = new Triangle(5, 2, 3, 2);
        Rectangle rectangle = new Rectangle(4, 6);
        Circle circle = new Circle(12);
        Triangle triangle2 = new Triangle(3, 5, 4, 2);
        Rectangle rectangle2 = new Rectangle(6, 10);

        Figure[] figuresArray = new Figure[]{triangle, triangle2, circle, rectangle, rectangle2};

        int sum = 0;
        for (Figure figure : figuresArray) {
            System.out.println(figure.countPerimeter());
            sum += figure.countPerimeter();
        }

        System.out.println("Периметр всех фигур равен: " + sum);


        {

        }
    }
}

