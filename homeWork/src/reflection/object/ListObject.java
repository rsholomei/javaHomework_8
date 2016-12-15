package reflection.object;

import java.util.ArrayList;
import java.util.List;

public class ListObject {
    public static List<Car> listCar()
    {
        List<Car> list = new ArrayList<>();

        Car car = new Car();
        car.setBrand("BMV");
        car.setModel("X5");
        car.setColor("Red");
        car.setNumberOfDoors(4);
        car.setMaximumSpeed(320);
        car.setWeight(1500);
        car.setPrice(100000);
        list.add(car);

        Car car1 = new Car();
        car1.setBrand("BMV");
        car1.setModel("X6");
        car1.setColor("White");
        car1.setNumberOfDoors(4);
        car1.setMaximumSpeed(320);
        car1.setWeight(1000);
        car1.setPrice(200000);
        list.add(car1);
        return list;
    }

    public static List<Cat> listCat()
    {
        List<Cat> list = new ArrayList<>();
        Cat cat = new Cat();
        cat.setName("Vaska");
        cat.setBreed("Siamese");
        cat.setColor("Grey");
        cat.setEyeColour("Blue");
        cat.setAge(3);
        cat.setWeight(6);
        list.add(cat);

        Cat cat1 = new Cat();
        cat1.setName("Cat");
        cat1.setBreed("Siamese");
        cat1.setColor("Black");
        cat1.setEyeColour("Blue");
        cat1.setAge(2);
        cat1.setWeight(5);
        list.add(cat1);
        return list;
    }

    public static List<Human> listHuman()
    {
        List<Human> list = new ArrayList<>();

        Human human = new Human();
        human.setName("Alexander");
        human.setAge(20);
        human.setGender("man");
        human.setWeight(80);
        human.setHobby("football");
        human.setSpecialty("student");
        list.add(human);

        Human human1 = new Human();
        human1.setName("Vova");
        human1.setAge(20);
        human1.setGender("man");
        human1.setWeight(85);
        human1.setHobby("fitness");
        human1.setSpecialty("student");
        list.add(human1);
        return list;
    }
}
