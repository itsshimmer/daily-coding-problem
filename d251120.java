public class d251120 {
    /*
     * This problem was recently asked by Google. [Easy]
     * 
     * Given a list of numbers and a number k, return whether any two numbers from
     * the list add up to k.
     * 
     * For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is
     * 17.
     * 
     * Bonus: Can you do this in one pass?
     */

    public static boolean isSumPresentSinglePass(int[] array, int k) {
        // ?
        return false;
    }

    public static boolean isSumPresent(int[] array, int k) {
        for(int i = 0; i<array.length; i++) {
            for(int i2 = 0; i2<array.length; i2++) {
                if(i == i2) {
                    continue;
                }
                if(array[i] + array[i2] == k) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int k = 20;
        int[] array = new int[4];
        array[0] = 10;
        array[1] = 15;
        array[2] = 3;
        array[3] = 7;

        System.out.println(isSumPresent(array, k));
    }
}