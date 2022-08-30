package Lesson_4.Computer;

public class Ram {
    private String name;
    private String volume;

    public Ram() {
        this.name="Имя Ram по умолчанию";
        this.volume="Объем Ram по умолчанию";
    }

    public Ram(String name, String volume) {
        this.name = name;
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public String getVolume() {
        return volume;
    }

    public void printAllInformation() {
        System.out.println("Название RAM: " + name);
        System.out.println("Объем RAM: " + volume);
    }
}
