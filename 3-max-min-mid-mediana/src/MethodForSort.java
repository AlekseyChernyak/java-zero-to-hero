import java.util.Arrays;

public class MethodForSort {
    public static void maxSort(double[] x){
        double max = x[0];
        for (int i = 1; i < x.length; i++) {
            if (x[i] > max) {
                max = x[i];
            }
        }
        System.out.println("Максимальное значение: " + max);
    }
    public static void minSort(double[] x){
        double min = x[0];
        for (int i = 1; i < x.length; i++) {
            if (x[i] < min) {
                min = x[i];
            }
        }
        System.out.println("Минимальное значение: " + min);
    }

    public static void averageSort(double[] x){
        double sum = 0;
        for (double num : x) {
            sum += num;
        }
        double average = (double) sum / x.length;
        System.out.println("Среднее значение: " + average);
    }

    public static void medianSort(double[] x){
        Arrays.sort(x);
        double median = x[x.length / 2];
        System.out.println("Центральный элемент: " + median);
        }
    }


