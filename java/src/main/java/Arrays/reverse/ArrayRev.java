package Arrays.reverse;

public class ArrayRev {

    public static void main(String[] args) {
        fRevArray(new int[]{2, 5, 8, 1, 16, 23});
    }


    static void fRevArray(int[] arr){
        int[] nArray = new int[arr.length];
        int index=0;
        for(int i=arr.length-1;i>=0;i--){
            nArray[index] = arr[i];
            index++;
        }
        for (int p:
             nArray) {
            System.out.print(p+" ");
        }
    }

}
