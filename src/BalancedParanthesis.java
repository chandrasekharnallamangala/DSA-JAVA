import java.util.Scanner;

class Node6
{
    char data;
    Node6 next;

    public Node6(char data)
    {
        this.data = data;
        this.next = null;
    }
}

class Stack5
{
    Node6 top;
    int size;

    public Stack5()
    {
        size = 0;
        top = null;
    }

    void push(char ele)
    {
        Node6 temp = new Node6(ele);
        temp.next = top;
        top = temp;
        size++;
    }

    void pop()
    {
        if(size == 0)
        {
            System.out.println("No more characters");
        }

        else
        {
            top = top.next;
            size--;
        }
    }

    char peek()
    {
        return top.data;
    }

    boolean isEmpty()
    {
        return top == null;
    }

    boolean isBalanced(String str)
    {
        for (int i=0; i<str.length(); i++)
        {
            char ch = str.charAt(i);

            if(ch == '(' || ch == '{' || ch =='[')
            {
                push(ch);
            }

            else if( !isEmpty() && ((ch == ')' && peek() == '(') ||
                    (ch == '}' && peek() == '{') ||
                    (ch == ']' && peek() == '[')
            ))
            {
                pop();
            }

            else
            {
                return false;
            }
        }

        if(! isEmpty())
        {
            return false;
        }
        return true;
    }
}



public class BalancedParanthesis
{
    public static void main(String[] args)
    {
        System.out.print("Enter String : ");
        String str = new Scanner(System.in).next();
        Stack5 stack = new Stack5();
        if(stack.isBalanced(str))
        {
            System.out.println("Balanced");
        }
        else
        {
            System.out.println("Not balanced");
        }

    }
}
