class Node5
{
    int data;
    Node5 next;

    public Node5(int data)
    {
        this.data = data;
        this.next = null;
    }
}

class Stack4
{
    Node5 top;
    int size;

    public Stack4()
    {
        top = null;
        size = 0;
    }

    void push(int ele)
    {
        Node5 temp = new Node5(ele);
        temp.next = top;
        top = temp;
        size++;
    }

    int pop()
    {
        int ele = top.data;
        top = top.next;
        size--;
        return ele;
    }

    int size()
    {
        return size;
    }

    int peek()
    {
        return top.data;
    }

    boolean isEmpty()
    {
        return size == 0;
    }
}


public class StackSize
{
    public static void main(String[] args)
    {
        Stack4 stack = new Stack4();

        stack.push(10);
        stack.push(20);
        stack.push(30);

//        System.out.println("Peek element is :"+ stack.peek());

//        System.out.println(stack.size());

        stack.pop();
        stack.pop();
        stack.pop();

//        System.out.println(stack.size());

//        System.out.println("Peek element is :"+ stack.peek());
        System.out.println(stack.isEmpty());


    }
}
