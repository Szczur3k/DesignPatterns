package FactoryMethod;

public class SmartphoneFactory {

    public static Smartphone createSmartphonne (SmartphoneType smartphoneType){
        switch (smartphoneType){
            case IPHONE:
                return new IphoneX();
            case XIAOMI:
                return new XiaomiMi10();
            case SAMSUNG:
                return new Samsung9s();
            default:
                throw new IllegalArgumentException("I don't have that type: " + smartphoneType + " of smartphone. Sorry.");
        }
    }

}
