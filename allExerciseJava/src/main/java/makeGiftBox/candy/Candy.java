package makeGiftBox.candy;

public class Candy {

    private	String name;
    private double cost;
    private double weight;
    private String type;
    private int sugar;


    public Candy (String name, double cost, double weight, String type,int sugar){
        this.name = name;
        this.cost = cost;
        this.weight = weight;
        this.type = type;
        this.sugar=sugar;
    }

    public String getName() { return name; }

    public double getCost() { return cost; }

    public int getSugar() { return sugar; }

    public double getWeight() { return weight;  }

    public String getType() {   return type;   }

    public void setName(String name) {
        this.name = name;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setSugar(int sugar) { this.sugar = sugar; }
}
