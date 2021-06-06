package Final;

public class Honey extends AddOnDecorator{
    Coffee coffee;

    public Honey(Coffee coffee){
        this.coffee=coffee;
    }

    public String getDescription(){
        return coffee.getDescription()+ ", Honey";
    }

    public double cost() {
        return 40 + coffee.cost();
    }
}