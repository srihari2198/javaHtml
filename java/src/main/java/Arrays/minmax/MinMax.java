package Arrays.minmax;

public class MinMax {

    public static void main(String[] args) {
        fMinMax(new int[]{2, 5, 8, 1, 16, 23});
    }
    static void fMinMax(int[] arr){
        int s = arr[0];
        int l = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < s) {
                s = arr[i];
            }
            if (arr[i] > l) {
                l = arr[i];
            }
        }
        //checking

        System.out.println("Smallest is: " + s);
        System.out.println("Largest is: " + l);
    }

}
