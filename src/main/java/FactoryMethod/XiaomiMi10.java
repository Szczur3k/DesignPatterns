package FactoryMethod;

public class XiaomiMi10 extends Smartphone {

    private final String smartphoneName = "XiaomiMi10";

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
