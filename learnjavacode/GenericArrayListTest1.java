package arrayListFinal;
import java.util.ArrayList;

//Class: ArrayListTest2
//Crate a Generic Collection: ArrayList
public class GenericArrayListTest1 {

	public static void main(String[] args) {
		//Creating Generic ArrayList
		ArrayList<String> arrayList1 = new ArrayList<String>();
		//adding elements in arrayList1
		arrayList1.add("A");
		arrayList1.add("B");
		arrayList1.add("C");
		arrayList1.add("D");
		arrayList1.add(1, "A2");
		arrayList1.add("F");
		
		//Display elements of collection: ArrayList
		System.out.println(arrayList1);
		
		//Display size of  elements of collection: ArrayList
		System.out.println("Size of al is:" +arrayList1.size());
		
		//Remove the ArrayList elements
		arrayList1.remove("F");
		arrayList1.remove(2);
		
		//Display elements of collection: ArrayList
		System.out.println(arrayList1);
		//Display size of  elements of collection: ArrayList
		System.out.println("Size of al after deletion is : " +arrayList1.size());

	}

}
