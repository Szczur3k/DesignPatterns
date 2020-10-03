package Decorator;

import java.math.BigDecimal;

public class PizzaThick extends PizzaAbstract {
    private final BigDecimal thick = new BigDecimal(2);

    @Override
    public BigDecimal getPrice() {
        return super.getPrice().add(thick);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
