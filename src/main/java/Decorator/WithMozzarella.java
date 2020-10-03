package Decorator;

import java.math.BigDecimal;

public class WithMozzarella extends AddingToPizza {
    private final static BigDecimal MOZZARELLA_PRICE = new BigDecimal(6);
    private final PizzaAbstract pizza;

    public WithMozzarella(PizzaAbstract pizza){
        this.pizza = pizza;
    }


    @Override
    public BigDecimal getPrice() {
        return pizza.getPrice().add(MOZZARELLA_PRICE);
    }

    @Override
    public String toString() {
        return pizza.toString() + " with Mozarella";
    }
}
