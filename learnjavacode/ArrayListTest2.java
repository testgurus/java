package arrayListFinal;

import java.util.ArrayList;
import java.util.Iterator;

//Class: ArrayListTest2
//Crate a Collection: ArrayList
public class ArrayListTest2 {

		public static void main(String[] args) {
			//Creating ArrayList
			ArrayList arrayList1 = new ArrayList();
			//adding elements in arrayList1
			arrayList1.add("Shyam");
			arrayList1.add("Ram");
			arrayList1.add("Ramesh");
			
			//Creating ArrayList
			ArrayList arrayList2 = new ArrayList();
			//adding elements in arrayList2
			arrayList2.add("Sarita");
			arrayList2.add("Ramya");
			arrayList2.add("Prabha");
			// Add element of arrayList2 in  arrayList1 from addAll() method
			arrayList1.addAll(arrayList2);
			
			//Display elements of collection: ArrayList
			Iterator it = arrayList1.iterator();
			while(it.hasNext()){
				System.out.println(it.next());
			}
			//Display size of ArrayList
			System.out.println("Size of Array List are: "+arrayList1.size());
	}
}
