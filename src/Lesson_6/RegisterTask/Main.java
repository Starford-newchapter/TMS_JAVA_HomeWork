package Lesson_6.RegisterTask;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws ParseException {
        PostavkaTovarov postavkaTovarov = new PostavkaTovarov(111, "Мышь", 25,new SimpleDateFormat("dd-MM-yyyy").parse("10-06-2020"));
        ContractWithEmployer contractWithEmployer = new ContractWithEmployer(222, new SimpleDateFormat("dd.MM.yyyy").parse("02.04.2014"), new SimpleDateFormat("dd.MM.yyyy").parse("25.11.2017"), "Aslan");
        FinanceInvoice financeInvoice = new FinanceInvoice(333, new SimpleDateFormat("dd.MM.yyyy").parse("10.06.2020"), 2456.56, 99);

        Register.printInformation(postavkaTovarov);
        Register.printInformation(contractWithEmployer);
        Register.printInformation(financeInvoice);

        System.out.println();

        Register.saveDocuments(postavkaTovarov);
        Register.saveDocuments(contractWithEmployer);
        Register.saveDocuments(financeInvoice);

        System.out.println(Register.listOfDocuments);


    }


}

