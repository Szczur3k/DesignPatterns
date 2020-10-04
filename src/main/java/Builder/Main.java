package Builder;

public class Main {
    public static void main(String[] args) {

        Smartphone smartphone = new SmartphoneImplementation()
                .setYearOfProduction(2020)
                .setIsNew(true)
                .setProducent("Huwaei")
                .setName("Huwaei p30 lite")
                .build();

        System.out.println(smartphone.toString());

    }
}
