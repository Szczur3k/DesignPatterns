package Builder;

public class Smartphone {

    String name;
    int yearOfProduction;
    boolean isNew;
    String producent;
    double resolution;

    public void setName(String name) {
        this.name = name;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public void setIsNew(boolean aNew) {
        this.isNew = aNew;
    }

    public void setProducent(String producent) {
        this.producent = producent;
    }

    public void setResolution(double resolution) {
        this.resolution = resolution;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "name='" + name + '\'' +
                ", yearOfProduction='" + yearOfProduction + '\'' +
                ", isNew=" + isNew +
                ", producent='" + producent + '\'' +
                ", resolution=" + resolution +
                '}';
    }
}
