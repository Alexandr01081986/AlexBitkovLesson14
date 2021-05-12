import java.util.Arrays;

public class lesson14 {

    public int[] getValuesAfterLastFour(int[] originalArray) {
        for (int i = originalArray.length - 1; i >= 0; i--) {
            if (originalArray[i] == 4) {
                return getSliceArray(i + 1, originalArray);
            }
        }
        throw new RuntimeException();
    }

    private int[] getSliceArray(int fromIndex, int[] originalArray) {
        int[] resultArray = new int[originalArray.length - fromIndex];

        for (int i = fromIndex, j = 0; i < originalArray.length; i++, j++) {
            resultArray[j] = originalArray[i];
        }
        return resultArray;
    }

    public boolean checkArray(int[] array) {
        boolean hasOne = false;
        boolean hasFour = false;
        for (int element : array) {
            if (element == 1) {
                hasOne = true;
            } else if (element == 4) {
                hasFour = true;
            }
        }
        return hasOne && hasFour;
    }

    public class Main {

        public void main(String[] args) {
            int[] array = {1, 2, 4, 4, 2, 3, 4, 1, 7};
            int value1 = 1;
            int value2 = 4;
            System.out.println("Массив: " + Arrays.toString(array));
            boolean result = checkArray(array);
            System.out.println("Есть ли " + value1 + " и " + value2 + " в данном массиве: " + result);
        }
    }
}
