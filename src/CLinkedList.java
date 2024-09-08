class Node3
{
    int data;
    Node3 next;

    Node3(int data)
    {
        this.data = data;
        this.next = null;
    }
}

class CircularLinkedList
{
    Node3 head;
    Node3 tail;

    void add_First(int ele)
    {
        Node3 temp = new Node3(ele);

        if(head == null)
        {
            head = temp;
            head.next = head;
        }

        else
        {
            Node3 cur = head.next;
            while (cur.next != head)
            {
                cur = cur.next;
            }
                temp.next = head;
                head = temp;
                cur.next = head;
        }
    }

    void printAll()
    {
        Node3 cur = head;

        if(head == null)
        {
            System.out.println("No more elements");
        }

        else
        {
            cur = head.next;

            System.out.println(head.data);
            while (cur != head)
            {
                System.out.println(cur.data);
                cur = cur.next;
            }
        }
    }

    void addFirst2(int ele)
    {
        Node3 temp = new Node3(ele);
        if(head == null)
        {
            head = temp;
            head.next = head;
            tail = head;
        }

        else
        {
            temp.next = head;
            head = temp;
            tail.next = head;
        }
    }





    void addFirst3(int ele)
    {
        Node3 temp = new Node3(ele);
        if (head == null)
        {
            head = temp;
            head.next = head;
        }

        else
        {
            temp.next = head.next;
            head.next = temp;

            int temp2 = head.data;
            head.data = temp.data;
            temp.data = temp2;
        }
    }

    void add(int ele)
    {


        Node3 temp = new Node3(ele);
        if (head == null)
        {
            head = temp;
            head.next = head;
            tail = head;
        }

        else
        {
            tail.next = temp;
            tail = temp;
            tail.next = head;
        }
    }


    void addLast2(int ele)
    {
        Node3 temp = new Node3(ele);

        if(head == null)
        {
            head = temp;
            head.next = head;
        }

        else
        {
            temp.next = head.next;
            head.next = temp;

            int t = head.data;
            head.data = temp.data;
            temp.data = t;

            head = temp;
        }
    }

    void removeFirst()
    {
        if(head == null)
        {
            System.out.println("No elements are present");
        }
        else if(head.next == head)
        {
            head = null;
            tail = null;
        }

        else
        {
            head = head.next;
            tail.next = head;

        }
    }

//    void removeLast()
//    {
//        if (head == null)
//        {
//            System.out.println("No more Elements");
//
//        }
//        else if (head.next == head)
//        {
//            head = null;
//            tail = null;
//        }
//
//        else
//        {
//            Node3 cur = head;
//            while (cur.next != tail)
//            {
//                cur = cur.next;
//            }
//
//            cur.next = head;
//            tail = cur;
//
//        }
//    }


    void removeLast()
    {
        if(head == null)
        {
            System.out.println("No more elements");
        }
        else if (head.next == head)
        {
            head = null;
        }

        else
        {
            Node3 cur = head;

            while (cur.next.next != head)
            {
                cur = cur.next;
            }
            cur.next = head;

        }
    }

    void sortedList(int ele)
    {
        Node3 temp = new Node3(ele);

        if(head == null)
        {
            head = temp;
            head.next = head;
        }
        else if(temp.data <= head.data)
        {
            add_First(ele);
        }
        else
        {
            Node3 cur = head.next;
            while (cur.next != head && cur.next.data <= ele)
            {
                cur = cur.next;
            }

            if(cur.next == head)
            {
                cur.next = temp;
                temp.next = head;
            }

            else
            {
                temp.next = cur.next;
                cur.next = temp;
            }


        }
    }


}







public class CLinkedList
{
    public static void main(String[] args)
    {
        CircularLinkedList cll = new CircularLinkedList();
//        cll.add_First(10);
//        cll.add_First(20);
//        cll.add_First(30);
//        cll.add_First(40);
//        cll.add_First(50);

//        cll.add(10);
//        cll.add(20);
//        cll.add(30);
//        cll.add(40);
//        cll.addFirst2(50);
//        cll.addFirst2(60);
//        cll.addFirst3(100);
//        cll.addFirst3(200);
//        cll.addFirst3(300);

//        cll.addLast2(50);
//        cll.addLast2(60);

//        cll.removeFirst();
//        cll.removeFirst();
//        cll.removeLast();
//        cll.removeLast();
//        cll.removeLast();
//        cll.removeLast();

        cll.sortedList(20);
        cll.sortedList(10);
        cll.sortedList(30);
        cll.sortedList(9);
        cll.sortedList(0);
        cll.sortedList(20);
        cll.sortedList(30);
        cll.sortedList(0);



        cll.printAll();


    }

}
