import jdk.nashorn.internal.runtime.regexp.joni.constants.Arguments;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

class lesson14Test {

    private final lesson14 lesson14 = new lesson14();

    @ParameterizedTest
    @MethodSource
    void getValuesAfterLastFour(int[] originalArray, int[] expectedResultArray, Assert Assertion) {
        int[] actualResultArray = lesson14.getValuesAfterLastFour(originalArray);

        Assertions.assertArrayEquals(expectedResultArray, actualResultArray);
    }

    private static Stream<Arguments> dataForSuccessGettingValuesAfterLastFour() {
        List<Arguments> arguments = new ArrayList<Arguments>() {{
            add(Arguments.arguments(new int[]{1, 2, 3, 4, 5}, new int[]{5}));
            add(Arguments.arguments(new int[]{1, 2, 3, 4}, new int[]{}));
            add(Arguments.arguments(new int[]{4, 1, 2, 4, 3, 4, 5}, new int[]{5}));
            add(Arguments.arguments(new int[]{4, 1, 2, 3, 5}, new int[]{1, 2, 3, 5}));
        }};
        return arguments.stream();
    }

@ParameterizedTest
@MethodSource
    void checkArray(int[] array, boolean expectedResult, Object expectedResultArray, Object actualResultArray) {
        boolean actualResult = lesson14.checkArray(array);

    Assertions.assertEquals(expectedResult, actualResult);
    }
    private static Stream<Arguments> dataForCheckArray() {
        List<Arguments> arguments = new ArrayList<Arguments>() {{
        add(Arguments.arguments(new int[] { 1, 1, 1, 4, 4, 1, 4, 4, }, true));
        add(Arguments.arguments(new int[] { 1, 1, 1, 1, 1, 1 }, false));
        add(Arguments.arguments(new int[] { 4, 4, 4, 4, }, false));
        add(Arguments.arguments(new int[] { 1, 4, 4, 1, 1, 4, 3 }, false));
        }};

        return arguments.stream();
    }

}