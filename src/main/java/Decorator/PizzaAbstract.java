package Decorator;

import java.math.BigDecimal;

public abstract class PizzaAbstract {

    private static final BigDecimal BASE_PRICE = new BigDecimal(12);

    public BigDecimal getPrice(){
        System.out.print("Price: ");
        return BASE_PRICE;
    }

    @Override
    public String toString(){
        return "Pizza";
    }

}