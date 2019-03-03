package taskClassesBankCustomer;

import java.util.Comparator;

public class SortByFild implements Comparator <Customer> {
    @Override
    public int compare(Customer firstPlayer,Customer secondPlayer) {
        return (firstPlayer.getTurnover() - secondPlayer.getTurnover());
    }


 }




