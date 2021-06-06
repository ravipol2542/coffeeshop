package Final;

public abstract class Coffee{
    String description="Unknown Coffee";

    public String getDescription(){       //getDescription method already implemented here will give basic description of Coffee
        return description;
    }
    public abstract double cost();
}
