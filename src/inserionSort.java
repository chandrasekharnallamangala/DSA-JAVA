class Insertsort{
    public int[] InsertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while ((j >= 0) && (arr[j] > key)) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        return arr;
    }
    public void display(int[] arr){
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
class insertionSort {
    public static void main(String[] args) {
       Insertsort Sort = new Insertsort();
       int[] arr = {20,5,40,60,10,30};
       int[] arr1 = Sort.InsertionSort(arr);
       Sort.display(arr1);
    }
}
