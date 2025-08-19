import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Car {
    String name;
    String color;
    int price;
    int wheel;
    boolean power;

    void Power() {
        power = !power;
        System.out.println("부르릉~!");
    };

}

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();

        car1.name = "따릉이";
        car2.name = "부릉이";

        car1.color = "blue";
        car2.color = "black";

        car1.wheel = 6;
        car2.wheel = 4;

        System.out.println("car1 name : " + car1.name);
        System.out.println("car1 color : " + car1.color);
        System.out.println("car1 wheel : " + car1.wheel);
        car1.Power();

        System.out.println("car2 name : " + car2.name);
        System.out.println("car2 color : " + car2.color);
        System.out.println("car2 wheel : " + car2.wheel);
        car2.Power();
    }
}