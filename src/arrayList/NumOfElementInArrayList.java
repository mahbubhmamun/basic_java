package arrayList;

import java.util.ArrayList;

public class NumOfElementInArrayList {
	public static void main(String[] args) {
		ArrayList<Double> list = new ArrayList<Double>();
		
		list.add(1.1);
		list.add(2.2);
		list.add(3.3);
		list.add(4.4);
		list.add(5.5);

		System.out.println(list); 

		System.out.println("Size Of ArrayList = " + list.size()); 
	}
}
