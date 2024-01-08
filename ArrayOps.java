public class ArrayOps {
    public static void main(String[] args) {
        int[] array1 = { 3, -4, 1, 2, 5 };
        int[] array2 = { 2, 3, 1 };
        System.out.println(findMissingInt(array2));

    }

    public static int findMissingInt(int[] array) {
        // Write your code here:
        if (array.length == 1)
            return 0;
        int expected = 0, real = 0;
        for (int i = 0; i < array.length; i++) {
            expected += i;

        }
        for (int j = 0; j < array.length; j++) {
            real += array[j];
        }
        return (expected - real);
    }

    public static int secondMaxValue(int[] array) {

        // Write your code here:
        int count = 0;
        int secondMax = array[0], max = array[0];
        for (int i = 0; i < array.length; i++) {

            if (array[i] > max)
                max = array[i];
        }

        for (int j = 0; j < array.length; j++) {
            if (array[j] > secondMax && array[j] < max)
                secondMax = array[j];
            if (array[j] == max)
                count++;

        }
        if (count > 1)
            return max;

        return secondMax;
    }

    public static boolean exist(int[] array, int x) {
        for (int i = 0; i < array.length; i++) {
            if (x == array[i])
                return true;
        }
        return false;
    }

    public static boolean containsTheSameElements(int[] array1, int[] array2) {
        // Write your code here:

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (!exist(array2, array1[j])) {
                    return false;
                }
                if (!exist(array1, array2[j]))
                    return false;

            }
        }

        return true;
    }

    public static boolean isSorted(int[] array) {
        // Write your code here:

        for (int i = 0; i < array.length - 2; i++) {

            if (array[i] < array[i + 1] && array[i + 1] > array[i + 2])
                return false;
            if (array[i] > array[i + 1] && array[i + 1] < array[i + 2])
                return false;

        }
        return true;
    }

}
