package Arrays.rotate;

public class ArrayRot {

    public static void main(String[] args) {
        fArrayRot(new int[]{2, 5, 8, 1, 16, 23},4);
    }

    static void fArrayRot(int[] arr,int index){
        int[] nArr = new int[arr.length] ;
        int indexN = 0;
        for(int i=index ;i<arr.length;i++){
            nArr[indexN] = arr[i];
            indexN++;
        }
        int nSize = indexN;
        for (int i=0;i< arr.length-nSize;i++){
            nArr[indexN] = arr[i];
            indexN++;
        }
        for (int p:
                nArr) {
            System.out.print(p+" ");
        }
    }
}
