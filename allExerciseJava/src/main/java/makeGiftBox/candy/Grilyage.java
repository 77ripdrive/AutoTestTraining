package makeGiftBox.candy;

public class Grilyage extends Candy {
    private String filling;

    public Grilyage (String name, double cost, double weight, String type, String filling,int sugar){
        super(name,cost,weight,type,sugar);
        this.filling=filling;
    }

    public String getFilling() {  return filling;    }
}
