package Java8.lambda_package;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8streamApi {
    //@Test
    public void noJava8() {
        ArrayList<String> car = new ArrayList<>();
        car.add("Toyota");
        car.add("Honda");
        car.add("Jaguar");
        car.add("Audi");
        car.add("BMW");
        car.add("Mercedes");
        car.add("Lexus");
        car.add("Tesla");
        car.add("Volkswagen");
        car.add("LandRover");
// find the number of cars that start with letter "t" without using java8
        int count = 0;
        for (int i = 0; i < car.size(); i++) {
            String aCars = car.get(i);
            if (aCars.startsWith("T")) {
                count++;
            }
        }
        System.out.println(count);

    }

    @Test
    public void Java8Streams1() {
        ArrayList<String> car = new ArrayList<>();
        car.add("Toyota");
        car.add("Honda");
        car.add("Jaguar");
        car.add("TAudi");
        car.add("TBMW");
        car.add("Mercedes");
        car.add("Lexus");
        car.add("Tesla");
        car.add("Volkswagen");
        car.add("LandRover");
        //Using streams API
        //long a = car.stream().filter(s -> s.startsWith("T")).count();
        //System.out.println(a);
        //print all cars with more than 5 characters
        //car.stream().filter(s->s.length()>5).forEach(System.out::println);
        //print out only one car from the list above
        //car.stream().filter(s->s.length()>5).limit(1).forEach(System.out::println);
        //sorting the list
        //car.stream().sorted().forEach(System.out::println);

        //using  Map
        //car.stream().filter(s-> s.startsWith("T")).map(s-> s.toUpperCase()).forEach(System.out::println);
        //  car.stream().filter(s-> s.startsWith("T")).map(String::toUpperCase).forEach(System.out::println);

    }

     //@Test
    public void java8Streams2(){
    //   using stream directly
    long countB = Stream.of("Honda", "Jaguar", "LandRover", "Lexus", "Mercedes", "TAudi", "TAudi").filter(s -> s.endsWith("i")).count();
    System.out.println(countB);

    //more Maps
        Stream.of("Honda","Jaguar","LandRover","Lexus","Mercedes","TAudi","TAudi").filter(s-> s.endsWith("i")).map(String::toUpperCase).forEach(System.out::println);

    }


    @Test
        public void java8Streams3() {
        // printing unique items directly
        //  List<String> cars = Arrays.asList("Honda","Jaguar","TAudi","LandRover","Lexus","Mercedes","Lexus","Mercedes","LandRover","Lexus","Mercedes");
//cars.stream().distinct().forEach(System.out::println);
        //Converting back to list after manipulation
        List<String> list = Stream.of("Honda", "Jaguar", "LandRover", "Lexus", "Mercedes", "TAudi", "TAudi").filter(s -> s.endsWith("s")).map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(list);

        //get the value of a particular index in a list of numbers after sorting the list
        List<Integer> nums = Arrays.asList(1,2,4,7,19,30,21,34,2,4);
        List<Integer> l = nums.stream().distinct().sorted().collect(Collectors.toList());
        System.out.println(l.size());
        System.out.println(l.get(0));
    }
        }
