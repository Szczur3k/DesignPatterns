package Decorator;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new Pizza();
        System.out.println(pizza.getPrice());
        System.out.println(pizza.toString());

        System.out.println();

        //Musisz zaznaczyć co ma dekorować (jaką pizze)
        WithMozzarella withMozzarella = new WithMozzarella(pizza);
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

        System.out.println();

        PizzaThick pizzaThick = new PizzaThick();
        WithHam pizzaTcickWithHam = new WithHam(pizzaThick);
        System.out.println(pizzaTcickWithHam.getPrice());
        System.out.println(pizzaTcickWithHam.toString());

    }
}

/*
• zapewnia większą elastyczność niż statyczne dziedziczenie
• pozwala uniknąć tworzenia przeładowanych funkcjami klas na wysokich poziomach hierarchii
• dekorator i powiązany z nim komponent nie są identyczne
• powstawanie wielu małych obiektów
 */
