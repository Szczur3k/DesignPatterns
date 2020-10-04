package AbstractFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<SmartPhone> listOfSmartPhoneXiaomi = new ArrayList<>();
        List<SmartPhone> listOfSmartPhonesWorld = new ArrayList<>();
        SmartPhone smartphoneXiaomiFromPoland = SmartphoneFactoryProducer.getSmartphoneFactory(SmartphoneLocation.POLAND).createPhone(SmartphoneType.XIAOMI);

        for (int i = 0; i<10; i++){
            listOfSmartPhoneXiaomi.add(smartphoneXiaomiFromPoland);
        }

        listOfSmartPhoneXiaomi.forEach(smartPhone -> smartPhone.sendMesseage("it's send from 10 smartphones"));
    }
}
