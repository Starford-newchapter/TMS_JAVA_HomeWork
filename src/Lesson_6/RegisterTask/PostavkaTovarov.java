package Lesson_6.RegisterTask;

import java.util.Date;

public class PostavkaTovarov extends Register {
    String typeOfItems;
    int countOfItems;


    public PostavkaTovarov(int numberOfDocument, String typeOfItems, int countOfItems, Date dateOfDocument) {
        super(numberOfDocument, dateOfDocument);
        this.typeOfItems = typeOfItems;
        this.countOfItems = countOfItems;
    }


    @Override
    public String toString() {
        return "PostavkaTovarov{" +
                "typeOfItems='" + typeOfItems + '\'' +
                ", countOfItems=" + countOfItems +
                ", numberOfDocument=" + numberOfDocument +
                ", dateOfDocument=" + dateOfDocument +
                '}';
    }

}
