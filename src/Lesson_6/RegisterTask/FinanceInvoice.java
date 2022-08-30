package Lesson_6.RegisterTask;

import java.util.Date;

public class FinanceInvoice extends Register {
    double allSumForMonth;
    int codeOfDepartment;

    public FinanceInvoice(int numberOfDocument, Date dateOfDocument, double allSumForMonth, int codeOfDepartment) {
        super(numberOfDocument, dateOfDocument);
        this.allSumForMonth = allSumForMonth;
        this.codeOfDepartment = codeOfDepartment;
    }

    @Override
    public String toString() {
        return "FinanceInvoice{" +
                "allSumForMonth=" + allSumForMonth +
                ", codeOfDepartment=" + codeOfDepartment +
                ", numberOfDocument=" + numberOfDocument +
                ", dateOfDocument=" + dateOfDocument +
                '}';
    }
}
