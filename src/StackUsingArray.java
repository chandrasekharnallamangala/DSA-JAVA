class StackOverFlowException extends Exception
{
    public StackOverFlowException()
    {
        super("No space to add");
    }
}

class StackUnderFlowException extends Exception
{
    public StackUnderFlowException()
    {
        super("No more Elements");
    }
}

class Stack2
{
    int[] arr;
    int top;

    public Stack2(int n)
    {
        arr = new int[n];
        this.top = -1;
    }

    void push(int element) throws StackOverFlowException
    {
        if(top == arr.length - 1)
        {
            throw new StackOverFlowException();
        }
        arr[++top] = element;

    }

    int pop() throws StackUnderFlowException
    {
        if(top == -1)
        {
            throw new StackUnderFlowException();
        }

        return arr[top--];
    }
}
public class StackUsingArray
{
    public static void main(String[] args)  {
        Stack2 stack = new Stack2(3);
        try
        {
            stack.push(10);
            stack.push(20);
            stack.push(30);
            stack.push(40);

//            System.out.println(stack.pop());
//            System.out.println(stack.pop());
//            System.out.println(stack.pop());
//            System.out.println(stack.pop());
//            System.out.println(stack.pop());
        }

//        catch(StackUnderFlowException ue)
//        {
//            System.out.println(ue.getMessage());
//        }
        catch (StackOverFlowException oe)
        {
            System.out.println(oe.getMessage());
        }


    }

}
