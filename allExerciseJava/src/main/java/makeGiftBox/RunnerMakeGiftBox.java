package makeGiftBox;


import makeGiftBox.giftBox.Gift;

import java.io.IOException;

public class RunnerMakeGiftBox {

        public static void main(String[] args) {

            try {
                Gift.createBox();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
}
