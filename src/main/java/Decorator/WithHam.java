package Decorator;

import java.math.BigDecimal;

public class WithHam extends AddingToPizza {
    private final static BigDecimal HAM_PRICE = new BigDecimal(3);
    private final PizzaAbstract pizza;

    public WithHam(PizzaAbstract pizza) {
        this.pizza = pizza;
    }


    @Override
    public BigDecimal getPrice() {
        return pizza.getPrice().add(HAM_PRICE);
    }

    @Override
    public String toString() {
        return pizza.toString() + " with Ham";
    }
}
