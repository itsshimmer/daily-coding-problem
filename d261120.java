public class d261120 {
    /*
     * This problem was asked by Uber. [Hard]
     * 
     * Given an array of integers, return a new array such that each element at
     * index i of the new array is the product of all the numbers in the original
     * array except the one at i.
     * 
     * For example, if our input was [1, 2, 3, 4, 5], the expected output would be
     * [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output would
     * be [2, 3, 6].
     * 
     * Follow-up: what if you can't use division?
     */

    public static int[] multiProduct(int[] array) {
        int[] newArray = new int[array.length];
        for(int i = 0; i<array.length; i++) {
            newArray[i] = 1;
            for(int i2 = 0; i2<array.length; i2++) {
                if(i != i2) {
                    newArray[i] = newArray[i] * array[i2];
                }
            }
        }
        return newArray;
    }

    public static void main(String[] args) {
        int[] array = new int[5];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;

        array = multiProduct(array);
        for (int i : array) {
            System.out.println(i);
        }

        // Follow-up: Ué, mas eu nem usei divisão KK
    }
}