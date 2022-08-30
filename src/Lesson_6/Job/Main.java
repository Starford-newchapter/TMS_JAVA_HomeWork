package Lesson_6.Job;

public class Main {
    public static void main(String[] args) {
        Director director=new Director();
        director.printJobTitle();

        Employer employer=new Employer();
        employer.printJobTitle();

        Counter counter=new Counter();
        counter.printJobTitle();
    }
}
