package Lesson_4.Computer;

public class Hdd {
    private String name;
    private String volume;
    private String type;

    public Hdd() {
        this.name="Имя Hdd по умолчанию";
        this.volume="Объем Hdd по умолчанию";
        this.type="Тип Hdd по умолчанию";
    }

    public Hdd(String name, String volume, String type) {
        this.name = name;
        this.volume = volume;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getVolume() {
        return volume;
    }

    public String getType() {
        return type;
    }

    public void printAllInformation() {
        System.out.println("Название HDD: " + name);
        System.out.println("Объем HDD: " + volume);
        System.out.println("Тип HDD: " + type);
    }
}
