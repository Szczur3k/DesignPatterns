package Decorator;

import java.math.BigDecimal;

public class Pizza {
    private static final BigDecimal BASE_PRICE = new BigDecimal(11);

    public static BigDecimal getBasePrice() {
        return BASE_PRICE;
    }

    @Override
    public String toString(){
        return "Pizza";
    }

}
