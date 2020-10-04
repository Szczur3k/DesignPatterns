package AbstractFactory;

public class ChinaSmartphoneFactory implements SmartphoneFactory {
    @Override
    public SmartPhone createPhone(SmartphoneType smartphoneType) {
        switch (smartphoneType){
            case SAMSUNG:
                return new Samsung9s(SmartphoneLocation.CHINA);
            case XIAOMI:
                return new XiaomiMi10(SmartphoneLocation.CHINA);
            case IPHONE:
                return new IphoneX(SmartphoneLocation.CHINA);
            default:
                throw new IllegalArgumentException("We don't have that type: " + smartphoneType + " of smartphones");
        }
    }
}
