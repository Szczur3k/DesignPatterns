package AbstractFactory;

public abstract class SmartPhone {

    private final SmartphoneType smartphoneType;
    private final SmartphoneLocation smartphoneLocation;

    protected SmartPhone(SmartphoneType smartphoneType, SmartphoneLocation smartphoneLocation) {
        this.smartphoneType = smartphoneType;
        this.smartphoneLocation = smartphoneLocation;
    }

    public abstract void call();
    public abstract void sendMesseage(String messeage);
    public abstract void playAGame(String nameOfAGame);
}