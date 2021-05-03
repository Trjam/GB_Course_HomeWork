import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;


import static org.junit.jupiter.params.provider.Arguments.arguments;
import static ru.gbcourse.java.trjamich.Main.getArrAfter4;
import static ru.gbcourse.java.trjamich.Main.only1and4;

public class Tests {

    @ParameterizedTest
    @MethodSource("dataForGetArrAfter4")
    public void testGetArrAfter4(int[] array, int[] result) {
        Assertions.assertArrayEquals(result, getArrAfter4(array));
    }

    @ParameterizedTest
    @MethodSource("dataForGetArrAfter4Exception")
    public void testGetArrAfter4Exception(int[] array) {
        Assertions.assertThrows(RuntimeException.class,()->getArrAfter4(array));
    }

    public static Stream<Arguments> dataForGetArrAfter4() {
        return Stream.of(
                arguments(new int[] {1,4,1,34,1}, new int[]{1,34,1}),
                arguments(new int[] {1,4}, new int[]{}),
                arguments(new int[] {4,1,4,1}, new int[]{1}),
                arguments(new int[] {1,4,1,44,1}, new int[]{1,44,1})
        );
    }

    public static Stream<Arguments> dataForGetArrAfter4Exception() {
        return Stream.of(
                arguments(new int[] {1,3,5,34,1}),
                arguments(new int[] {1,2,5,6,7,8,9,44})
        );
    }

    @ParameterizedTest
    @MethodSource("dataOnly1and4")
    public void testOnly1and4(int[] array, boolean result) {
        Assertions.assertEquals(result, only1and4(array));
    }

    public static Stream<Arguments> dataOnly1and4() {
        return Stream.of(
                arguments(new int[] {1,4,1,34,1}, false),
                arguments(new int[] {1,4}, true),
                arguments(new int[] {1,1,1,1}, false),
                arguments(new int[] {}, false)
        );
    }
}
