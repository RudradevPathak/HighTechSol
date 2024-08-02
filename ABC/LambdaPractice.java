import java.util.Collection;
import java.util.Date;
import java.util.function.*;

public class LambdaPractice {


    public static void main(String[] args) {
       Supplier<Date> dubleNumberFunction = () -> {
               return  new Date();
       };
        System.out.println(dubleNumberFunction.get());
        Predicate<Integer> printFunction = (a) -> a > 10 ?true:false;
        System.out.println( printFunction.test(10));

        Function<String , Boolean> func = (s) -> s.equals("10");
        System.out.println(func.apply("10"));

        BinaryOperator<Integer> bi = (Integer a, Integer b) -> a*b; // or (a, b) -> a+ b;
        System.out.println(bi.apply(20,11));

        Comparable<Integer> comparable = (a) -> a.compareTo(10);
        System.out.println(comparable.compareTo(1));
         String test = "abcdrf";
        Consumer<String> consumer = (a) -> a.length();
        consumer.accept(test);


    }
}
