import java.util.NoSuchElementException;

public class a_16_7
{
    /* Write a method called deleteBack that deletes the last value (the value at the back of the list) and returns the
    deleted value. If the list is empty, throw a NoSuchElementException.*/

    //initiate standard variables
    private ListNode front;

    //too test the method
    public void run()
    {
        //I have made an add-method to ListNode
        addNodeToList(0,1);
        addNodeToList(1,2);
        addNodeToList(2,2);
        addNodeToList(3,1);
        addNodeToList(4,5);
        addNodeToList(5,3);

        System.out.println(deleteBack());
        System.out.println(deleteBack());
        System.out.println(deleteBack());
    }

    //deletes the back of the list and returns its value
    public Integer deleteBack()
    {
        //initiate variables
        Integer back = 0;

        //if the list is empty
        if (front == null)
        {
            throw new NoSuchElementException();
        }
        //the for-loop finds the back and set it to null and sets the backs value to value
        for (ListNode current = front; current != null; current = current.next)
        {
            //the reason for at check the next node is to avoid NullPointerException!
            if (current.next.next == null)
            {
                back = current.next.data;
                current.next = null;
            }
        }
        return back;
    }

    //an add-method to ListNode that adds a value to the list
    public void addNodeToList(int index, int value)
    {
        //if index is 0, then add value to front
        if(index == 0)
        {
            front = new ListNode(value, front);
        }
        // else add a value to the end of list
        else
        {
            ListNode current = front;
            for (int i = 0; i < index-1; i++)
            {
                current = current.next;
            }
            current.next = new ListNode(value,current.next);
        }
    }
}
