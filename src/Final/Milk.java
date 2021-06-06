package Final;

public class Milk extends AddOnDecorator{
    Coffee coffee;

    public Milk(Coffee coffee){
        this.coffee=coffee;
    }

    public String getDescription(){
        return coffee.getDescription()+ ", Milk";
    }



    public double cost(){
        return 15+coffee.cost();
    }
}