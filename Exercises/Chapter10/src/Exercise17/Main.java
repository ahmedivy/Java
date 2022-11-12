package Exercise17;

import java.util.ArrayList;

public interface Main {
    public static void main(String[] args) {

        ArrayList<CarbonFootprint> elements = new ArrayList<CarbonFootprint>();

        elements.add(new Building(100, 200, 300));
        elements.add(new Car(100, 200));
        elements.add(new Bicycle(100));

        for (CarbonFootprint element : elements) {
            System.out.println(element.getCarbonFootprint());
        }
    }
}
