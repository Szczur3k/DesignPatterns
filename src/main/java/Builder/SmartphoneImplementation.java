package Builder;

public class SmartphoneImplementation implements SmartphoneBuilder {

    private final Smartphone smartphone;

    public SmartphoneImplementation() {
        this.smartphone = new Smartphone();
    }

    @Override
    public SmartphoneBuilder setName(String name) {
        smartphone.setName(name);
        return this;
    }

    @Override
    public SmartphoneBuilder setYearOfProduction(int yearOfProduction) {
        smartphone.setYearOfProduction(yearOfProduction);
        return this;
    }

    @Override
    public SmartphoneBuilder setIsNew(boolean isNew) {
        smartphone.setIsNew(isNew);
        return this;
    }

    @Override
    public SmartphoneBuilder setProducent(String producent) {
        smartphone.setProducent(producent);
        return this;
    }

    @Override
    public SmartphoneBuilder setResolution(double resolution) {
        smartphone.setResolution(resolution);
        return this;
    }

    @Override
    public Smartphone build() {
        return smartphone;
    }
}
