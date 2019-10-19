package decorator;

import lombok.Data;

import java.awt.*;

@Data
public class BlackCoffee implements CoffeInterface {

    @Override
    public int getPrice() {
        return  3;
    }

    @Override
    public String getName() {
        return  "Black Coffee";
    }

}
