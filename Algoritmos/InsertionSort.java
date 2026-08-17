import java.util.Arrays;

public  class InsertionSort {
    public static  void sort(int[] arr){
        for (int j = 2 ; j<arr.length; j++){
                int key = arr[j];
                int i = j-1;
                while (i>=0 && arr[i]>key){
                    arr[i+1] = arr[i];
                    i--;
                }
                arr[i+1] = key;

        }


    }
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6};
        System.out.println("Array original: " + Arrays.toString(arr));
        sort(arr);
       System.out.println("Array ordenado: " + Arrays.toString(arr));
    }

}
