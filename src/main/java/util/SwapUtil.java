package util;

public class SwapUtil {

    public static Object[] swapElements(Object[] array, int firstIndex, int secondIndex) {
        Object[] copyOfArray = new Object[array.length];
        System.arraycopy(array, 0, copyOfArray, 0, array.length);

        copyOfArray[firstIndex] = array[secondIndex];
        copyOfArray[secondIndex] = array[firstIndex];

        return copyOfArray;
    }
}
