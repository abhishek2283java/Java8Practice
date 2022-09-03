package functionalInterface.function.myimpl;

import java.util.function.Function;

/**
 * Created by sca820 on 04 juni, 2022
 */
public class Main {
    public static void main(String[] args) {
        Function<Long, Long> squareFunc = new PerformSquare();
        Long apply = squareFunc.apply(6L);
        System.out.println("apply = " + apply);

        Function<Long, String> stringResult = (num) -> num + " is the result";

        final String apply1 = squareFunc.andThen(stringResult).apply(6L);
        System.out.println("apply1 = " + apply1);

        final String apply2 = stringResult.compose(squareFunc).apply(6L);
        System.out.println("apply2 = " + apply2);
    }

}
