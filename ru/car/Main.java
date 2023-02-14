package ru.car;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("van");
        Car car2 = new Car("mini");

        car2.setColor("black");
        System.out.println(car1.getColor());
        System.out.println(car2.getColor());

        System.out.println(car1.type);
        System.out.println(car2.type);

        car1.setYear(1998);
        System.out.println("Год выпуска авто " + car1.year);
        car2.startCar();
        String[] owners = new String[] {"Иванов", "Петров", "Сидоров"};
        car1.setOwners(owners);
        System.out.println(Arrays.toString(car1.itemOwners));

        String[] city = new String[] {"London", "Sochi", "LA", "Samara", "Milan"};
        car2.setArrivedFrom(city);
        System.out.println(car2.arrivedFrom.toString());
    }
}
