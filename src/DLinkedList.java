import com.sun.beans.editors.ShortEditor;

class Node2
{
    int data;
    Node2 prev;
    Node2 next;

    Node2(int data)
    {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

class DoublyLinkedList
{
    Node2 head;
    Node2 tail;

    void add(int ele)
    {
        Node2 temp = new Node2(ele);
        if(head == null)
        {
            head = temp;
            tail = temp;
        }
        else
        {
           tail.next = temp;
           temp.prev = tail;
           tail = temp;
        }
    }

    void addFirst(int ele)
    {
        Node2 temp = new Node2(ele);
        if (head == null)
        {
            head = temp;
            tail = temp;
        }
        else
        {
            temp.next = head;
            head.prev = temp;
            head = temp;
        }
    }

    void addSpecific(int index, int ele) {
        Node2 cur = head;
        int count = 0;

        // Case where index is 0: insert at the start
        if (index == 0) {
            addFirst(ele);
        }

        else {
            Node2 temp = new Node2(ele);

            // Traverse the list until we reach the desired index
            while (count != index && cur != null) {
                cur = cur.next;
                count++;
            }

            // If index matches the size of the list, add to the end
            if (cur == null && count == index) {
                add(ele);
            }
            // Insert before `cur` if the index is valid
            else if (cur != null) {
                temp.prev = cur.prev;
                temp.next = cur;
                if (cur.prev != null) {
                    cur.prev.next = temp;
                }
                cur.prev = temp;

                // Special case: if inserting before the head
                if (cur == head) {
                    head = temp;
                }
            }
            else {
                // Invalid index (index out of bounds)
                System.out.println("Index out of bounds");
            }
        }
    }

void addSpecific_Without_first_last(int index,int ele)
{
    Node2 temp = new Node2(ele);
    Node2 cur = head;
    int count = 0;
    while(count < index-1)
    {
        cur = cur.next;
        count++;
    }
    temp.next = cur.next;
    cur.next = temp;
    cur.next.prev = temp;
    temp.prev = cur;
}

void addAll(int[] elements)
{
    for (int element : elements)
    {
        add(element);
    }
}





    void print_Forward()
    {
        Node2 cur;
        if(head == null)
        {
            System.out.println("No more Elements");
        }

        else
        {
            cur = head;
            while (cur != null)
            {
                System.out.println(cur.data);
                cur = cur.next;
            }

        }
    }

    void print_Backward()
    {
        if(head == null)
        {
            System.out.println("No more elements");
        }

        else
        {
            Node2 cur;
            cur = tail;

            while (cur != null)

            {
                System.out.println(cur.data);
                cur = cur.prev;
            }
        }
    }

    int indexOf(int ele)
    {
        if(head == null)
        {
            System.out.println("List is empty");
        }

        int count = 0;
        Node2 cur = head;

        while(cur != null)
        {
            if(cur.data == ele)
            {
                return count;
            }
            cur = cur.next;
            count++;
        }
        return -1;
    }

    int lastIndexOf(int ele)
    {
        Node2 cur = head;
        int count = 0;
        int index = -1;

        while(cur != null)
        {
            if(cur.data == ele)
            {
                index = count;
            }
            cur = cur.next;
            count++;
        }
        return index;
    }

    void size()
    {
        Node2 cur = head;
        int count = 0;

        while (cur != null)
        {
            cur = cur.next;
            count++;
        }
        System.out.println("size of linked list is : "+count);
    }

    void removeFirst()
    {
        if(head == null)
        {
            System.out.println("No elements are present");
        }

        else if(head.next == null)
        {
            head = null;
            tail = null;
        }
        else
        {
//            Node2 cur = head;

            head = head.next;
//            cur.next = null;
            head.prev=null;

        }
    }

    void removeLast()
    {
        if(head == null)
        {
            System.out.println("No elements are present");
        }
        else if(head.next == null)
        {
            head = null;
            tail = null;
        }

        else
        {
            tail = tail.prev;
            tail.next = null;
        }

    }

//    void sortedList(int ele)
//    {
//        Node2 temp = new Node2(ele);
//        if(head == null)
//        {
//            head = temp;
//        }
//
//        else if(head.data > ele)
//        {
//            addFirst(ele);
//        }
//
//        else
//        {
//            Node2 cur = head;
//            while (cur.next != null && cur.data <= ele)
//            {
//                cur = cur.next;
//            }
//
//            if(cur.next == null)
//            {
//                cur.next = temp;
//                temp.prev = cur;
//                temp.next = null;
//
//            }
//            else
//            {
//                temp.prev = cur.prev;
//                temp.next = cur;
//                cur.prev = temp;
//                cur.prev.next = temp;
//            }
//
//        }
//    }

    void sortedList(int ele)
    {
        Node2 temp = new Node2(ele); // New node to be inserted

        // Case 1: If the list is empty, make the new node the head
        if (head == null) {
            head = temp;
        }

        // Case 2: If the new element is smaller than the head, insert at the beginning
        else if (head.data > ele) {
            temp.next = head;
            head.prev = temp;
            head = temp; // Update head to new node
        }

        // Case 3: Insert in the middle or at the end
        else {
            Node2 cur = head;

            // Find the correct position to insert the new node
            while (cur.next != null && cur.next.data < ele) {
                cur = cur.next;
            }

            // Case 3a: Inserting at the end of the list
            if (cur.next == null) {
                cur.next = temp;
                temp.prev = cur;
            }

            // Case 3b: Inserting in the middle of the list
            else {
                temp.prev = cur;
                temp.next = cur.next;
                cur.next.prev = temp;
                cur.next = temp;
            }
        }
    }





}
public class DLinkedList
{
    public static void main(String[] args)
    {
        DoublyLinkedList dll = new DoublyLinkedList();

//        dll.add(10);
//        dll.add(20);
//        dll.add(30);
//        dll.add(40);
//        dll.add(10);
//        dll.addFirst(50);
//        dll.addSpecific(1,100);
//        dll.addSpecific(0,1000);
//        dll.addSpecific(5,1000);
//        dll.addSpecific_Without_first_last(2,200);
//        int[] arr = {11,22,33};
//        dll.addAll(arr);

//        dll.removeFirst();
//        dll.removeLast();

        dll.sortedList(20);
        dll.sortedList(10);
        dll.sortedList(1);
        dll.sortedList(30);
        dll.sortedList(20);
        dll.sortedList(0);
        dll.sortedList(40);
        dll.sortedList(0);

        dll.print_Forward();
//        System.out.println(dll.indexOf(40));
//        System.out.println(dll.lastIndexOf(10));
        dll.size();
//        dll.print_Backward();



    }

}
