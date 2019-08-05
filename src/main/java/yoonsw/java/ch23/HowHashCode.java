package yoonsw.java.ch23;

import java.util.HashSet;
import java.util.Objects;

public class HowHashCode {
    public static void main(String[] args) {
        HashSet<Car> set = new HashSet<>();
        set.add(new Car("301", "RED"));
        set.add(new Car("301", "BLACK"));
        set.add(new Car("302", "RED"));
        set.add(new Car("302", "WHITE"));
        set.add(new Car("301", "BLACK"));

        System.out.println("size: " + set.size());

        for (Car car : set)
            System.out.println(car.toString() + '\t');
    }
}

class Car {
    private String model;
    private String color;

    public Car(String m, String c) {
        model = m;
        color = c;
    }

    @Override
    public String toString() {
        return model + " : " + color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, color);
    }

    @Override
    public boolean equals(Object obj) {
        String m = ((Car)obj).model;
        String c = ((Car)obj).color;

        return model.equals(m) && color.equals(c);
    }
}