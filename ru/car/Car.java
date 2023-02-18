package ru.car;

import java.util.ArrayList;
import java.util.List;

//Напишите программу с классом Car.
//- Создайте констуктор класса Car
//- Создайте атрибуты класса Car: color, type, year
//- Напишите 5 методов:
//1. запуск автомобиля
//2. список городов, откуда прибыли авто
//3. присвоение автомобилю год выпуска
//4. присвоение автомобилю тип
//5. присвоение автомобилю цвета
//6. заполнение массива: список владельцев
public class Car {
    private String color = "green";
    String type;
    int year;
    String [] itemOwners = new String[3];
    List<String> arrivedFrom = new ArrayList<>();

    //присвоение автомобилю типа
    public Car(String newType) {
        this.type = newType;
    }
    //присвоение автомобилю типа
    public void setYear(int ourYear) {
        this.year = ourYear;
    }

    //получение цвета по умолчанию
    public String getColor(){
        return color;
    }

    //присвоение цвета
    public void setColor (String newColor) {
        this.color = newColor;
    }

    //запуск автомобиля
    public void startCar (){
        System.out.println("Автомобиль запущен");
    }

    //заполнение массива владельцев
    public void setOwners (String[] owners)  {
        if (owners.length <= itemOwners.length)
            for (int i = 0; i < itemOwners.length; i++)
                //System.out.println(owners[i]);
                itemOwners[i] = i < owners.length ? owners[i] : "";
        else System.out.println("error");
        }

    //заполнение списка элементов список городов, откуда прибыли авто
    public void setArrivedFrom (String[] city) {
        for (int i = 0; i < city.length; i++)
            arrivedFrom.add(city[i]);
    }


}
