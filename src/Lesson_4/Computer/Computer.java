package Lesson_4.Computer;

public class Computer {
    private double cost;
    private String model;
    private Ram RAM;
    private Hdd HDD;
    public  Type type;


    public Computer(double cost, String model,Type type) {
        this.cost = cost;
        this.model = model;
        this.type=type;
    }

    public Computer(double cost, String model,Type type, Ram RAM, Hdd HDD) {
        this.cost = cost;
        this.model = model;
        this.RAM = RAM;
        this.HDD = HDD;
        this.type=type;
    }

    public void printAllInformation() {
        System.out.println("Стоимость компьютера: " + cost);
        System.out.println("Модель компьютера: " + model);
        System.out.println("Тип: "+type);
        System.out.println("Название RAM: " + RAM.getName());
        System.out.println("Объем RAM: " + RAM.getVolume());

        System.out.println("Название HDD: " + HDD.getName());
        System.out.println("Объем HDD: " + HDD.getVolume());
        System.out.println("Тип HDD: " + HDD.getType());

    }

}
