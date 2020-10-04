package Builder;

public interface SmartphoneBuilder {

    SmartphoneBuilder setName(String name);
    SmartphoneBuilder setYearOfProduction(int yearOfProduction);
    SmartphoneBuilder setIsNew(boolean isNew);
    SmartphoneBuilder setProducent(String producent);
    SmartphoneBuilder setResolution(double resolution);

    Smartphone build();

}
