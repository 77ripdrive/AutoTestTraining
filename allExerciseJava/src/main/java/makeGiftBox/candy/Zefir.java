package makeGiftBox.candy;

public class Zefir extends Candy {
    private String flavor;

    public Zefir (String name, double cost, double weight, String type, String flavor,int sugar){
        super(name,cost,weight,type,sugar);
        this.flavor=flavor;
    }

    public String getFlavor() {
        return flavor;
    }
}
