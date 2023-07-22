public class BubbleSort {
    public static void bubbleSort(int arr[]){
        int n = arr.length;

        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if(arr[j]>arr[j+1]){
                    int x = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = x;
                }
            }
        }
    }

    public static void main(String[] args) {
        //int [] arr = {11,52,64,58,96,93,83,45,10};
        //int [] arr = {121,532,644,558,696,793,883,495,1000};
        int [] arr = {13121,52342,65354,56788,78676,9357,8345,44235,10123};

        bubbleSort(arr);

        for (int num : arr) {
            System.out.println(num + " ");
        }
    }
    
}
