package makeGiftBox.giftBox;


import makeGiftBox.candy.Candy;


import java.util.Comparator;

public class SortBySugar implements Comparator <Candy> {

        @Override
        public int compare(Candy firstCandy,Candy secondCandy) {
            return (firstCandy.getSugar() - secondCandy.getSugar());
        }
    }


