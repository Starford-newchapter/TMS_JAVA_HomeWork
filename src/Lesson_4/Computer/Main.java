package Lesson_4.Computer;

import Lesson_4.Computer.Computer;
import Lesson_4.Computer.Hdd;
import Lesson_4.Computer.Ram;
import Lesson_4.Computer.Type;

public class Main {

    public static void main(String[] args) {
        /*CreditCard visa = new CreditCard("4420 2220 3345 5678", 0);
        CreditCard masterCard = new CreditCard("1111 2222 3333 4444", 20000);
        CreditCard belCard = new CreditCard("1000 2000 3000 4000", 10000);


        visa.printInformationAboutCard();
        masterCard.printInformationAboutCard();
        belCard.printInformationAboutCard();

        visa.addMoneyOnCard(1234.56);
        masterCard.addMoneyOnCard(5000);
        belCard.withdrawMoneyFromCard(3754.28);

        System.out.println();

        visa.printInformationAboutCard();
        masterCard.printInformationAboutCard();
        belCard.printInformationAboutCard();

        System.out.println();

        masterCard.withdrawMoneyFromCard(25001);
        masterCard.printInformationAboutCard();

         */

        Computer computer1 = new Computer(2000, "Lenovo", Type.Ноутбук, new Ram(), new Hdd());
        Computer computer2 = new Computer(10000, "ASUS", Type.Декстоп, new Ram("Ram2", "3500"), new Hdd("Hdd2", "5000", "Внешний"));

        computer1.printAllInformation();
        System.out.println();

        computer2.printAllInformation();


    }
}
