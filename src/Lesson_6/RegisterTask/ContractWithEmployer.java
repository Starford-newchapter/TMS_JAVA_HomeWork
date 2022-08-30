package Lesson_6.RegisterTask;

import java.util.Date;

public class ContractWithEmployer extends Register {
    Date dateEndOfContract;
    String nameOfEmployer;

    public ContractWithEmployer(int numberOfDocument, Date dateOfDocument, Date dateEndOfContract, String nameOfEmployer) {
        super(numberOfDocument, dateOfDocument);
        this.dateEndOfContract = dateEndOfContract;
        this.nameOfEmployer = nameOfEmployer;
    }

    @Override
    public String toString() {
        return "ContractWithEmployer{" +
                "dateEndOfContract=" + dateEndOfContract +
                ", nameOfEmployer='" + nameOfEmployer + '\'' +
                ", numberOfDocument=" + numberOfDocument +
                ", dateOfDocument=" + dateOfDocument +
                '}';
    }
}
