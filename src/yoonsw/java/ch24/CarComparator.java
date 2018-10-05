package yoonsw.java.ch24;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CarComparator {
    public static void main(String[] args) {
        List<Car> clist = new ArrayList<>();
        clist.add(new Car(1800));
        clist.add(new Car(1200));
        clist.add(new Car(3000));

        List<ECar> elist = new ArrayList<>();
        elist.add(new ECar(3000, 55));
        elist.add(new ECar(1800, 87));
        elist.add(new ECar(1200, 99));

        CarComp comp = new CarComp();

        clist.sort(comp);
        elist.sort(comp);

        for (Car c : clist)
            System.out.println(c.toString() + '\t');
        System.out.println();

        for (ECar e : elist)
            System.out.println(e.toString() + '\t');
        System.out.println();
    }
}

class Car {
    protected int disp;

    public Car(int disp) {
        this.disp = disp;
    }

    @Override
    public String toString() {
        return "cc: " + disp;
    }
}

// Car의 정렬을 위한 클래스
class CarComp implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        return o1.disp - o2.disp;
    }
}

class ECar extends Car {
    private int battery;

    public ECar(int disp, int battery) {
        super(disp);
        this.battery = battery;
    }

    @Override
    public String toString() {
        return "cc: " + disp + ", ba: " + battery;
    }
}