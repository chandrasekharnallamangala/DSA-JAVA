public class ArrayStack {
   private int top;
   private int[] arr;

   public ArrayStack(int capacity) {
       top = -1;
       arr = new int[capacity];
   }
   public ArrayStack() {

       this(10);
   }
   public boolean isEmpty() {
       return top < 0 ;
   }
   public boolean isFull() {
       return (arr.length == top+1);
   }
   public void push (int data) {
       if (isFull()) {
           throw new RuntimeException("stack is Full");
       }
       top += 1;
       arr[top] = data;
   }
   public int pop() {
       if (isEmpty()) {
           throw new RuntimeException("stack is Full");
       }
       int res = arr[top];
       top -= 1;
       return res;
   }
   public int peek() {
       if (isEmpty()) {
           throw new RuntimeException("stack is Full");
       }
       return arr[top];
   }
    public void display() {
     for ( int i = 0; i <= top; i++) {
         System.out.println(arr[i]);
     }
}
    public static void main(String[] args) {
        ArrayStack as = new ArrayStack(5);
        as.push(10);
        as.push(15);
        as.push(20);
        as.push(25);
        as.push(30);
        System.out.println(as.peek());
        as.pop();
        System.out.println(as.peek());
        as.display();
    }
}
