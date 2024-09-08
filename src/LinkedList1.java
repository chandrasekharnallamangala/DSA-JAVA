class Node
{
    int data;
    Node next;

    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}
class LinkedList
{
    Node head;
    void printLinkedList()
    {
        Node cur = head;
        while(cur != null)
        {
            System.out.println(cur.data);
            cur = cur.next;
        }
    }

    void add(int ele)
    {
        Node temp = new Node(ele);
        if(head == null)
        {
            head = temp;
        }

        else
        {
            Node cur = head;
            while (cur.next != null)
            {
                cur = cur.next;
            }
            cur.next = temp;
        }
    }

    void add(int index, int element) throws IndexOutOfBoundsException
    {
        if(index == 0)
        {
            addFirst(element);
        }
        else
        {
            try
            {
                int c = 0;
                Node temp = new Node(element);
                Node cur = head;
                while (c < index - 1)
                {
                    cur = cur.next;
                    c++;
                }

                temp.next = cur.next;
                cur.next = temp;
            }
            catch (NullPointerException e)
            {
                throw new IndexOutOfBoundsException();
            }

        }
    }

    void addFirst(int ele)
    {
        Node temp = new Node(ele);
        if(head == null)
        {
            head = temp;
        }
        else
        {
            temp.next = head;
            head = temp;
        }
    }

    void addAll(int[] elements)
    {
        for(int element : elements)
        {
            add(element);
        }
    }

    void removeFirst()
    {
        if(head == null)
        {
        }
        else if (head.next == null)
        {
            head = null;
        }
        else
        {
            Node cur = head;
            head = head.next;
            cur.next = null;

        }
    }

    void removeLast()
    {
        if(head == null)
        {
        }
        else if (head.next == null)
        {
            head = null;
        }
        else
        {
        Node cur = head;
        while (cur.next.next != null)
        {
            cur = cur.next;
        }
        cur.next = null;

        }
    }

    int  indexOf(int ele)
    {
        int count = 0;
        Node cur = head;
        while(cur != null)
        {
            if(cur.data == ele)
            {
                return count;
            }
            count++;
            cur = cur.next;
        }
        return -1;
    }

    int lastIndexOf(int ele)
    {
        int ci = -1;
        int count = 0;
        Node cur = head;

        while(cur != null)
        {
            if(cur.data == ele)
            {
                ci = count;
            }
            count++;
            cur = cur.next;
        }
        return ci;
    }

    int size()
    {
        int count = 0;
        if(head == null)
        {
            return -1;
        }
        else if(head.next == null)
        {
            return 1;
        }

        else
        {
            Node cur = head;

            while(cur != null)
            {
                count++;
                cur = cur.next;

            }
        }
        return count;


    }

    void sortedList(int ele)
    {
        Node temp = new Node(ele);
        if (head == null)
        {
            head = temp;
            head.next = null;
        }
        else if (head.data >= temp.data)
        {
            addFirst(ele);
        }

        else
        {
            Node cur = head;
            while (cur.next != null && cur.next.data < temp.data)
            {
                cur = cur.next;
            }
            temp.next = cur.next;
            cur.next = temp;
        }
    }

}

public class LinkedList1
{
    public static void main(String[] args)
    {
      LinkedList ll = new LinkedList();
//        ll.add(10);
//        ll.add(100);
//        ll.add(200);
//        ll.add(100);

//        ll.addFirst(1);
//        ll.addFirst(5);

//        ll.add(1,20);
//        ll.add(0,1);
//        ll.add(10,200);
//        int[] arr = {200,300,400};
//        ll.addAll(arr);
//        ll.removeFirst();
//        ll.removeLast();

//        System.out.println(ll.indexOf(100));
//        System.out.println(ll.lastIndexOf(10));

//        System.out.println(ll.size());

        ll.sortedList(20);
        ll.sortedList(10);
        ll.sortedList(30);
        ll.sortedList(9);
        ll.sortedList(40);
        ll.sortedList(9);
        ll.sortedList(40);
        ll.sortedList(19);

        ll.printLinkedList();

    }
}
