package decorator;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CoffeCreamDecoratorTest {

    @DisplayName("Black Coffe with cream should cost 5")
    @Test
    void decoratorPriceTest() {
        // given
        CoffeInterface blackCoffe = new BlackCoffee();
        CoffeInterface blackCoffeWithCream = new CoffeeCreamDecorator(blackCoffe) ;
        int expectedPrice = 5;
        // when
        int resultPrice = blackCoffeWithCream.getPrice();
        // then
        Assertions.assertThat(resultPrice).isEqualTo(expectedPrice);
    }

    @DisplayName("White Coffe with cream should have name 'White coffee with cream'")
    @Test
    void decoratorNameTest() {
        // given
        CoffeInterface whiteCoffe = new WhiteCoffee();
        CoffeInterface whiteCoffeWithCream = new CoffeeCreamDecorator(whiteCoffe);
        String expectedName = "White coffee with cream";
        // when

        String resultName = whiteCoffeWithCream.getName();
        // then
        Assertions.assertThat(resultName).isEqualTo(expectedName);
    }
}