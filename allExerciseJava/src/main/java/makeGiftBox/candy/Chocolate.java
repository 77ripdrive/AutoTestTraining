package makeGiftBox.candy;

public class Chocolate extends Candy {
    private String color;

    public Chocolate (String name, double cost, double weight, String type, String color,int sugar){
        super ( name,cost,weight,type,sugar);
        this.color=color;
    }

    public String getFilling() { return color; }
}
