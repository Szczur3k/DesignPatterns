package FactoryMethod;

public class Main {
    public static void main(String[] args) {

        Smartphone xiaomiMi10 = SmartphoneFactory.createSmartphonne(SmartphoneType.XIAOMI);
        Smartphone iphone = SmartphoneFactory.createSmartphonne(SmartphoneType.IPHONE);
        Smartphone samsung9s = SmartphoneFactory.createSmartphonne(SmartphoneType.SAMSUNG);

        xiaomiMi10.call();
        iphone.sendMesseage("Apple is shit");
        samsung9s.playAGame("Mario Bross");
        System.out.println();

        for (SmartphoneType smartphoneType : SmartphoneType.values()) {
            SmartphoneFactory.createSmartphonne(smartphoneType).sendMesseage("messeage from all smartphones");
        }

    }
}
