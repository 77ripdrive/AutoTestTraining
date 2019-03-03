package taskClassesBankCustomer;

import static taskClassesBankCustomer.Customer.*;

public class CustomerRunner {
    public static void main(String[] args) {


        Customer[] customers = new Customer[4];
        long[] interval = {4141_0001_0000_0000L, 9112_0000_0000_0000L};

        customers[0] = new Customer(1, "Alexrander", "Firsr","Alexs",
                "Moskow",5450_8800_0000_6543L, 3131_0000_0000_5L, 40_000);
        customers[1] = new Customer(2, "Alexsander", "Second","Aleks",
                "Brest",4200_0001_0000_7654L, 3013_9987_0981_1L, 15_000);
        customers[2] = new Customer(3, "Nicolaj", "Second","Van",
                "New Vasjuki",9112_0000_0987_5432L, 3013_9876_4321_1L, 120_000);
        customers[3] = new Customer (4,"Tom","Jerry","Tomovich",
                "NY",9876_6785_7676_0000L,3012_0000_0000_5L,1_000);

        for (Customer number : customers) {
            System.out.println(number.toString());
            System.out.println("***************");
        }

        alfabetSort(customers);
        // Список клиентов, у которых номер кредитной карточки находится в заданном интервале:
        cardInterval(interval, customers);
        //Сортировка по оборуту за период
        sortByFieldTurnover(customers);


    }

}



