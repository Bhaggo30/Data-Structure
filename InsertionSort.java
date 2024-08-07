import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int temp,i,j;
        int [] arr = {8,4,1,5,9,2};
        for( i =1; i<arr.length; i++){
            temp = arr[i];
            j = i-1;
            while (j>=0 && arr[j]>temp){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
        System.out.println(Arrays.toString(arr));

    }
}
