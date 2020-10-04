package AbstractFactory;

public class SpainSmartphoneFactory implements SmartphoneFactory {
    @Override
    public SmartPhone createPhone(SmartphoneType smartphoneType) {
        switch (smartphoneType){
            case SAMSUNG:
                return new Samsung9s(SmartphoneLocation.SPAIN);
            case XIAOMI:
                return new XiaomiMi10(SmartphoneLocation.SPAIN);
            case IPHONE:
                return new IphoneX(SmartphoneLocation.SPAIN);
            default:
                throw new IllegalArgumentException("We don't have that type: " + smartphoneType + " of smartphones");
        }
    }
}
