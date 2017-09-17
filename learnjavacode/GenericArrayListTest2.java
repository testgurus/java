package arrayListFinal;
import java.util.*;

//Class: GenericArrayListTest2
//Crate a Generic Collection: ArrayList
public class GenericArrayListTest2 {

	public static void main(String[] args) {
		//Creating Generic ArrayList
		ArrayList<String> arrayList1 = new ArrayList<String>();
		//adding elements in arrayList1
		arrayList1.add("Shyam");
		arrayList1.add("Ram");
		arrayList1.add("Ramesh");
		
		//Creating Generic ArrayList
		ArrayList<String> arrayList2 = new ArrayList<String>();
		// adding elements in arrayList1
		arrayList2.add("Sarita");
		arrayList2.add("Ramya");
		arrayList2.add("Prabha");
		// Add element of arrayList2 in  arrayList1 from addAll() method
		arrayList1.addAll(arrayList2);
		//Display elements of collection: ArrayList
		Iterator<String> it = arrayList1.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
	}
}
