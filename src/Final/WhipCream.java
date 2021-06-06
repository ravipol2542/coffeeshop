package Final;

public class WhipCream extends AddOnDecorator{
    Coffee coffee;

    public WhipCream(Coffee coffee){
        this.coffee=coffee;
    }

    public String getDescription(){
        return coffee.getDescription()+ ", WhipCream";
    }

    public double cost(){
        return 25+coffee.cost();
    }
}