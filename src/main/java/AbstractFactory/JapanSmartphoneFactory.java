package AbstractFactory;

public class JapanSmartphoneFactory implements SmartphoneFactory {
    @Override
    public SmartPhone createPhone(SmartphoneType smartphoneType) {
        switch (smartphoneType){
            case SAMSUNG:
                return new Samsung9s(SmartphoneLocation.JAPAN);
            case XIAOMI:
                return new XiaomiMi10(SmartphoneLocation.JAPAN);
            case IPHONE:
                return new IphoneX(SmartphoneLocation.JAPAN);
            default:
                throw new IllegalArgumentException("We don't have that type: " + smartphoneType + " of smartphones");
        }
    }
}
