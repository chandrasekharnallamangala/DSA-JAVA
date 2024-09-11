
class Node4
{
    int data;
    Node4 next;
    Node4 prev;

    public Node4(int data)
    {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class Stack3
{
    Node4 top;

    public Stack3()
    {
        this.top = null;
    }
    void push(int ele)
    {
        Node4 temp = new Node4(ele);
        if(top == null)
        {
           top = temp;
           top.next = temp;
           top.prev = null;
        }
        else
        {
            top.next = temp;
            temp.prev = top;
            top = temp;
        }

    }

    int pop() throws StackUnderFlowException
    {
        if(top == null)
        {
            throw new StackUnderFlowException();
        }
        else
        {
            Node4 cur;
            cur = top;
            top = top.prev;
            return cur.data;
        }
    }
}

public class StackUsingLinkedList
{
    public static void main(String[] args)
    {
        Stack3 stack = new Stack3();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        try
        {
            System.out.println(stack.pop());
//            System.out.println(stack.pop());
//            System.out.println(stack.pop());
//            System.out.println(stack.pop());
        }

        catch (StackUnderFlowException ue)
        {
            System.out.println(ue.getMessage());
        }
    }
}
