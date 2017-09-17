package linkedListEx;
import java.util.LinkedList;

//Class: LinkedListTest1
//Crate a Collection: ArrayList
public class LinkedListTest1 {

	public static void main(String[] args) {
		//Creating LinkedList
		LinkedList linkedList= new LinkedList();
		//Adding elements in linkedList
		linkedList.add("B");
		linkedList.add("C");
		linkedList.add("D");
		linkedList.add("E");
		linkedList.add("F");
		linkedList.addLast("Z");
		linkedList.addFirst("A");
		linkedList.add(0, "a");
		
		//Display elements of collection: LinkedList
		System.out.println(linkedList);
		//Display size of  elements of collection: LinkedList
		System.out.println("Size of ll is : " +linkedList.size());
		
		//Remove the ArrayList elements
		linkedList.removeFirst();
		linkedList.removeLast();
		linkedList.remove(2);
		//Display elements of collection: LinkedList
		System.out.println(linkedList);
		//Display size of  elements of collection: LinkedList
		System.out.println("Size of ll : " +linkedList.size());
		
		//Linking a element "Changed" with the Third Element
		Object val = linkedList.get(2);
		linkedList.set(2, val+("Changed"));
		//Display size of  elements of collection: LinkedList
		System.out.println("linkedList After Changed :" +linkedList);
		//Display size of  elements of collection: LinkedList
		System.out.println("Size of linkedList : "+linkedList.size());

	}
}
