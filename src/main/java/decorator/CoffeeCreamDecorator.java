package decorator;

public class CoffeeCreamDecorator implements CoffeInterface {
    private CoffeInterface coffe;
    private String name;
    private int price;

    CoffeeCreamDecorator(CoffeInterface coffee) {
        this.coffe = coffee;
    }

    @Override
    public int getPrice() {
        return coffe.getPrice()+2;
    }

    @Override
    public String getName() {
        return coffe.getName() +" with cream";
    }


}
