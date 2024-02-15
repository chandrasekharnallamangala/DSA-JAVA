 class Ms {
    public void merge(int[] arr,int low,int mid,int high) {
        int n1 = mid - low + 1;
        int n2 = high - mid;
        int[] larr = new int[n1];
        int[] rarr = new int[n2];

        for(int i = 0; i < n1; i++) {
            larr[i] = arr[low + i];
        }

        for(int j = 0; j < n2; j++) {
            rarr[j] = arr[mid + 1 + j];
        }

        int i =0,j = 0, k = low;
        while (( i < n1) && (j < n2)) {
            if(larr[i] <= rarr[j]) {
                arr[k] = larr[i];
                i++;
                k++;
            }
            else {
                arr[k] = rarr[j];
                j++;
                k++;
            }

        }
        while(i < n1) {
            arr[k] = larr[i];
            i++;
            k++;
        }
        while(j < n2) {
            arr[k] = rarr[j];
            j++;
            k++;
        }


    }

    public void mergeSort(int[] arr,int low,int high) {
        if(low < high) {
            int mid = low + (high - low) / 2;
            mergeSort(arr,low,mid);
            mergeSort(arr,mid+1,high);
            merge(arr,low,mid,high);
        }
    }

    public void display(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {20,5,40,60,10,30};
        Ms ms = new Ms();
        ms.mergeSort(arr,0, arr.length-1);
        ms.display(arr);
    }
}
