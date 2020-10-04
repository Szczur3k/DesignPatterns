package AbstractFactory;

public class USASmartphoneFactory implements SmartphoneFactory {
    @Override
    public SmartPhone createPhone(SmartphoneType smartphoneType) {
        switch (smartphoneType){
            case SAMSUNG:
                return new Samsung9s(SmartphoneLocation.USA);
            case XIAOMI:
                return new XiaomiMi10(SmartphoneLocation.USA);
            case IPHONE:
                return new IphoneX(SmartphoneLocation.USA);
            default:
                throw new IllegalArgumentException("We don't have that type: " + smartphoneType + " of smartphones");
        }
    }
}
