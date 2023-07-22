import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        double[] arr = new double[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (double) ((Math.random()*100)/100);
            }

        MethodForSort.maxSort(arr);
        MethodForSort.minSort(arr);
        MethodForSort.averageSort(arr);
        MethodForSort.medianSort(arr);
        }
    }

