package AbstractFactory;

public class PolandSmartphoneFactory implements SmartphoneFactory {
    @Override
    public SmartPhone createPhone(SmartphoneType smartphoneType) {
        switch (smartphoneType){
            case SAMSUNG:
                return new Samsung9s(SmartphoneLocation.POLAND);
            case XIAOMI:
                return new XiaomiMi10(SmartphoneLocation.POLAND);
            case IPHONE:
                return new IphoneX(SmartphoneLocation.POLAND);
            default:
                throw new IllegalArgumentException("We don't have that type: " + smartphoneType + " of smartphones");
        }
    }
}
