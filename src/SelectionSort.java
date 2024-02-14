class Sort {
    public void selectionsort(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n; i++) {
            int minindex = i;
            for( int j = i+1; j < n; j++) {
                if (arr[j] < arr[minindex]) {
                    minindex = j;
                }
            }
            int temp = arr[minindex];
            arr[minindex] = arr[i];
            arr[i] = temp;
        }

    }
    public void display(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n; i++){
            System.out.println(arr[i]);
        }
    }
}
public class SelectionSort {
    public static void main(String[] args) {
        Sort sort = new Sort();
        int[] arr = {20,5,40,60,10,30};
         sort.selectionsort(arr);
         sort.display(arr);
    }
}
