package AbstractFactory;

public class XiaomiMi10 extends SmartPhone{

    private final String nameSmartphone = "XiaomiMi10";
    private final SmartphoneLocation smartphoneProduceLocation;

    protected XiaomiMi10(SmartphoneLocation smartphoneLocation) {
        super(SmartphoneType.XIAOMI, smartphoneLocation);
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
