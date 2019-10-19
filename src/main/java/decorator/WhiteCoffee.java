package decorator;

import lombok.Data;

@Data
public class WhiteCoffee implements CoffeInterface {

    @Override
    public int getPrice() {

        return 4;
    }

    @Override
    public String getName() {
        return  "White coffee";
    }
}
