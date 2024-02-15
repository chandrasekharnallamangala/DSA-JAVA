class quickfirstpivot {
    public int partition(int[] arr,int low,int high) {
        int pivot = arr[low];

        int i = low;
        int j = high;
        while ( i < j){
            while( arr[i] <= pivot && i <= high - 1) {
                i++;
            }
            while ( arr[j] > pivot && j > low ) {
                j--;
            }
            if ( i < j ) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;

        return j;
    }
    public void Quick(int[] arr,int low,int high) {
        if ( low < high){
            int pivotIndex = partition(arr,low,high);
            Quick(arr,low,pivotIndex - 1);
            Quick(arr,pivotIndex + 1,high);

        }
    }
    public void display(int[] arr) {
        for(int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }
}
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {20,5,40,60,10,30};
        quickfirstpivot qck = new quickfirstpivot();
        qck.Quick(arr,0,arr.length-1);
        qck.display(arr);
    }
}
