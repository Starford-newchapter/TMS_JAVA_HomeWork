package Lesson_6.RegisterTask;

import java.util.ArrayList;
import java.util.Date;

public abstract class Register{
    int numberOfDocument;
    Date dateOfDocument;
     static  ArrayList<Register> listOfDocuments = new ArrayList<>(10);


    public Register(int numberOfDocument, Date dateOfDocument) {
        this.numberOfDocument = numberOfDocument;
        this.dateOfDocument = dateOfDocument;
    }

    public static  void saveDocuments(Register register) {
        listOfDocuments.add(register);
    }

    public  static void printInformation(Register register) {
        System.out.println(register);
    }
}






