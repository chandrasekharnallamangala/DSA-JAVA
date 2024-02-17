class Heap {
    public void sort(int[] arr) {
        int len = arr.length;

        // start taking elements from the height - 1 level
        for(int i = len / 2 - 1; i >= 0; i--){
            heapify(arr,len,i);
        }

        // This loop is for re-arranging the min heaped tree array into a sorted array
        for(int i = len - 1; i >= 0; i--){
            swap(arr,0,i);

        // This heapify is used to replace the root with rightmost element or last element
        // to make the array in the format of min heap array.
            heapify(arr,i,0);
        }
    }

    public void heapify(int[] arr,int n,int i){


        int largest = i; // parent node
        int l_child = 2 * i + 1; // left child of the parent node
        int r_child = 2 * i + 2; // right child of the parent node

        if ( ( l_child < n ) && ( arr[largest] < arr[l_child] ) ) {    //  checking if left child is bigger
            largest = l_child;
        }
        if ( ( r_child < n ) && ( arr[largest] < arr[r_child] ) ) {    //  checking if right child is larger
            largest = r_child;
        }

        if ( largest != i) {
            swap(arr,largest,i);
            heapify(arr,n,largest);
        }


    }
    public void swap(int arr[],int a,int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public void display(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}



public class HeapSort {
    public static void main(String[] args) {
        int[] arr = {20,5,40,60,10,30};
        Heap hp = new Heap();
        hp.sort(arr);
        hp.display(arr);
    }


}
