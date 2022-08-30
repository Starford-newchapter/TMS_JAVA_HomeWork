package Lesson_6.RegisterTask;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        PostavkaTovarov postavkaTovarov = new PostavkaTovarov(111, "Мышь", 25, new Date());
        ContractWithEmployer contractWithEmployer = new ContractWithEmployer(222, new Date(), new Date(), "Aslan");
        FinanceInvoice financeInvoice = new FinanceInvoice(333, new Date(), 2456.56, 99);

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

