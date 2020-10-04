package AbstractFactory;

public class IphoneX extends SmartPhone{

    private final String nameSmartphone = "IphoneX";
    private final SmartphoneLocation smartphoneProduceLocation;

    protected IphoneX(SmartphoneLocation smartphoneLocation) {
        super(SmartphoneType.IPHONE, smartphoneLocation);
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
