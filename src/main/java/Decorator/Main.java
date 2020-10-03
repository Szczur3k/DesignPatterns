package Decorator;

public class Main {
    public static void main(String[] args) {
        Pizza pizzaThick = new Pizza();
        System.out.println(pizzaThick.getPrice());
        System.out.println(pizzaThick.toString());

        System.out.println();

        //Musisz zaznaczyć co ma dekorować (jaką pizze)
        WithMozzarella withMozzarella = new WithMozzarella(pizzaThick);
        System.out.println(withMozzarella.getPrice());
        System.out.println(withMozzarella.toString());

        System.out.println();

        WithMozzarella with2Mozzarella = new WithMozzarella(withMozzarella);
        System.out.println(with2Mozzarella.getPrice());
        System.out.println(with2Mozzarella.toString());

        System.out.println();

        WithHam withHamAndMozzarella = new WithHam(withMozzarella);
        System.out.println(withHamAndMozzarella.getPrice());
        System.out.println(withHamAndMozzarella.toString());
    }

}
