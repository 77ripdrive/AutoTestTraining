package taskClassesBankCustomer;


import java.util.ArrayList;
import java.util.Collections;

public  class Customer {

        private  int id;
        private String name;
        private String surname;
        private String secondName;
        private String town;
        private long creditCardNumber;
        private long accountNumber;
        private int turnover;

        public Customer( int id,String name, String surname,String secondName,
                         String town, long creditCardNumber, long accountNumber, int turnover) {
            this.id = id;
            this.name = name;
            this.surname = surname;
            this.secondName = secondName;
            this.town = town;
            this.creditCardNumber = creditCardNumber;
            this.accountNumber = accountNumber;
            this.turnover=turnover;
        }

        public static void alfabetSort(Customer[] customers) {
            for (int i = 0; i < customers.length - 1; i++) {
                for (int j = 0; j < customers.length - i - 1; j++) {
                    if (customers[j].getName().compareTo(customers[j + 1].getName()) > 0) {
                        Customer customerItem = customers[j];
                        customers[j] = customers[j + 1];
                        customers[j + 1] = customerItem;
                    }
                }
            }
            System.out.println("Список клиентов, отсортированный по имени:");
            for (Customer elem : customers) {
                System.out.println(elem.getName() + " " + elem.getSurname());
            }
        }

        public static void cardInterval(long[] interval, Customer[] customers) {
            System.out.println("Список клиентов, у которых номер кредитной карточки находится в заданном интервале:");
            for (Customer customer : customers) {
                if (customer.getCreditCardNumber() >= interval[0] && customer.getCreditCardNumber() <= interval[1]) {
                    System.out.println(customer.getName() + " " + customer.getSurname());
                }
            }
        }

          public static void sortByFieldTurnover(Customer[] customers) {
            ArrayList <Customer> arrCustomers = new ArrayList <Customer>();
            for (int i = 0; i < customers.length; i++) {
                arrCustomers.add(customers[i]);
            }
            SortByFild sortByFild = new SortByFild();
            Collections.sort(arrCustomers, sortByFild);
            System.out.println("\n После сортировки по полю turnover по обороту , от меньшего к большему :");
            for (int i = 0; i < ( arrCustomers ).size(); i++) {
                System.out.println(arrCustomers.get(i));
            }

          }
            public String getName ( ) {   return name; }

            public String getSurname ( ) { return surname;  }

            public long getCreditCardNumber ( ) { return creditCardNumber; }

            public int getTurnover ( ) {  return turnover; }

            @Override
            public String toString ( ) {
                return "Customer{" +
                        "id=" + id +
                        ", name='" + name + '\'' +
                        ", surname='" + surname + '\'' +
                        ", secondName='" + secondName + '\'' +
                        ", Town='" + town + '\'' +
                        ", creditCard=" + creditCardNumber +
                        ", accountNumber=" + accountNumber +
                        ", Turnover=" + turnover +
                        '}';
            }
        }
