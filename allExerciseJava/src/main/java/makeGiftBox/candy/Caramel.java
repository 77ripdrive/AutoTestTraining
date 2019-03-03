package makeGiftBox.candy;

public class Caramel extends Candy {
    private String filling;

    public Caramel (String name, double cost, double weight, String type, String filling,int sugar){
        super ( name,cost,weight,type,sugar);
        this.filling=filling;
    }

    public String getFilling() { return filling; }
}


