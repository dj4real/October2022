package Java8.lambda_package;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.function.Consumer;

public class AnonymousClass {
    public static void main(String[] args) {
        ArrayList <String> car = new ArrayList<>();
        car.add("Toyota");
        car.add("Honda");
        car.add("Jaguar");
        car.add("Audi");
        car.add("BMW");
        car.add("Mercedes");
        car.add("Lexus");
        car.add("Volkswagen");
        car.add("LandRover");

        //using Anonymous class for each implementation
        car.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
        }



}
