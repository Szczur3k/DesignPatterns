package FactoryMethod;

public class IphoneX extends Smartphone{

    private final String smartphoneName = "IphoneX";

    @Override
    public void call() {
        System.out.println("Calling from " + smartphoneName);
    }

    @Override
    public void sendMesseage(String messeage) {
        System.out.println(messeage + " - Send from: " + smartphoneName);
    }

    @Override
    public void playAGame(String nameOfAGame) {
        System.out.println("Playing " + nameOfAGame + " from: " + smartphoneName);
    }
}
