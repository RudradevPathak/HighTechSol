import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaExp {

    public static void main(String[] args) {
                List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Abc");

                // Using lambda expression with Predicate
                Predicate<String> startsWithA = s -> s.startsWith("A");
                names.stream().filter(startsWithA).forEach(a->System.out.println(a));

            //names.forEach(a -> System.out.println(a));

        Consumer<String> namesCosumer = name -> System.out.println(name);
        System.out.println("consumner:" +namesCosumer);
        names.forEach(namesCosumer);

            Function<String, Integer> lengthOfString = s -> s.length();
            System.out.println(lengthOfString.apply("Rudra"));

        Supplier<LocalDateTime> supplyCurrentDate = () -> LocalDateTime.now();
        System.out.println(supplyCurrentDate.get());
        try{
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("after 3 second date and time"+supplyCurrentDate.get());


    }
}
