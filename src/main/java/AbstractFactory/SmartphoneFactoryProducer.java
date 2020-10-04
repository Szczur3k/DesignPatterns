package AbstractFactory;

public class SmartphoneFactoryProducer {

    public static SmartphoneFactory getSmartphoneFactory(SmartphoneLocation smartphoneLocation) {
        switch (smartphoneLocation){
            case POLAND:
                return new PolandSmartphoneFactory();
            case GERMANY:
                return new GermanySmartphoneFactory();
            case CHINA:
                return new ChinaSmartphoneFactory();
            case JAPAN:
                return new JapanSmartphoneFactory();
            case SPAIN:
                return new SpainSmartphoneFactory();
            case USA:
                return new USASmartphoneFactory();
            default:
                throw new IllegalArgumentException("We don't have that location: " + smartphoneLocation + " on our program");
        }
    }
}
