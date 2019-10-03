/*
 * Ethan Newman
 * EEN170000
 * CS 3345.005
 * The task of this project is to implement in Java a singly linked list of a specific generic type.
 */



 public class IDedLinkedList<AnyType extends IdedObject>
 {

    Node head;

    //Node class for the linked list nodes
    public class Node
    {
        int data;
        Node next;
        
        
        //Constructor to create new Nodes
        Node(int d)
        {
            data = d;
            next = null;
        }
    }

    //-------------Constructors-----------------------------------------------
    public IDedLinkedList()
    {
        head = new Node(0);
    }






    //--------------functions-------------------------------------------------
    //empties the linked list
    public void makeEmpty()
    {

    }
    
    
    /*Get the generic type to get the particular id and
    * returns AnyType. Don’t remove the object from the list.
    * returns null if the list is empty or ID not found. 
    */
    public AnyType findID(int ID)
    {

    }


    //insert at front of list or return false if that ID already exists
    public boolean insertAtFront(AnyType x)
    {

    }


    //delete and return the record at the front of the list or return null if the list is empty
    public AnyType deleteFromFront()
    {

    }


    //find and delete the record with teh given ID or returns null if it isn't found
    public AnyType delete(int ID)
    {

    }


    //return the sum of ids of all elements currently in the list. If the list is empty, return -1
    public int printTotal()
    {

    }




 }
