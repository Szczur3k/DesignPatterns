package AbstractFactory;

public class GermanySmartphoneFactory implements SmartphoneFactory {
    @Override
    public SmartPhone createPhone(SmartphoneType smartphoneType) {
        switch (smartphoneType){
            case SAMSUNG:
                return new Samsung9s(SmartphoneLocation.GERMANY);
            case XIAOMI:
                return new XiaomiMi10(SmartphoneLocation.GERMANY);
            case IPHONE:
                return new IphoneX(SmartphoneLocation.GERMANY);
            default:
                throw new IllegalArgumentException("We don't have that type: " + smartphoneType + " of smartphones");
        }
    }
}
