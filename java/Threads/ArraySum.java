package ThreasSync;

import java.util.concurrent.*;

public class ArraySum {


    public static void main(String[] args) throws ExecutionException, InterruptedException {
        int[] arr = new int[100];

        for(int i=0;i<100;i++) {
            arr[i] = i+1 ;

        }
        ExecutorService es = Executors.newFixedThreadPool(5);
        int result=0;
        for(int i=0;i<5;i++) {
            int startIndex =i * 100/5;
            int endIndex = startIndex + 100/5;

            result+=es.submit(new Callable<Integer>() {
                @Override
                public Integer call() throws Exception {
                    int sum=0;
                   for(int j=startIndex;j<=endIndex-1;j++)
                       sum+=arr[j];
                    return ((Integer) sum);
                }
            }).get();
        }

        System.out.println(result);
    }
}
