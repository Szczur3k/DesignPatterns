package AbstractFactory;

public class Samsung9s extends SmartPhone{

    private final String nameSmartphone = "Samsung9s";
    private final SmartphoneLocation smartphoneProduceLocation;

    protected Samsung9s(SmartphoneLocation smartphoneLocation) {
        super(SmartphoneType.SAMSUNG, smartphoneLocation);
        smartphoneProduceLocation = smartphoneLocation;
    }

    @Override
    public void call() {
        System.out.println("You are calling from: " + nameSmartphone + " produce in: " + smartphoneProduceLocation);
    }

    @Override
    public void sendMesseage(String messeage) {
        System.out.println(messeage + " - send from: " + nameSmartphone + " produce in: " + smartphoneProduceLocation);
    }

    @Override
    public void playAGame(String nameOfAGame) {
        System.out.println("Playing " + nameOfAGame + " from: " + nameSmartphone + " produce in: " + smartphoneProduceLocation);
    }
}
