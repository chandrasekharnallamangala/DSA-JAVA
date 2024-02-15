
class QS {
        public int partition(int[] arr,int low,int high) {
            int pivot = arr[high];

            int i = low - 1;
            for( int j = low ; j <= high - 1; j++ ) {
                if (arr[j] < pivot) {
                    i++;
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

            int temp = arr[i + 1];
            arr[i + 1] = arr[high];
            arr[high] = temp;

            return (i+1);


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

    public class QuickPivotLast {
        public static void main(String[] args) {
            int[] arr = {20,5,40,60,10,30};
            QS qck = new QS();
            qck.Quick(arr,0,arr.length-1);
            qck.display(arr);
        }
    }


