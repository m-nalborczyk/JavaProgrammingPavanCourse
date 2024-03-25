package day15;

/*
 * 1) Heterogenios data ---> allowed
2) Insertion order  --> Not preserved (Index not supported)
3) Duplicate elements --> Not Allowed
4) Multiple nulls Not allowed/ only single null is allowed


 */
import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		
		//declaration
		HashSet myset=new HashSet();
		//Set myset=new HashSet();
		//HashSet <Integer>myset=new HashSet<Integer>();
		
		myset.add(100);
		myset.add(10.5);
		myset.add("welcome");
		myset.add(100);
		myset.add(null);
		myset.add(null);
		
		System.out.println(myset); //[null, 100, 10.5, welcome]   // insertion order not preserved
		
		System.out.println(myset.size()); //4
		
		//remove value from hashset
		myset.remove(10.5);  // we have to pass value but not index - index wont support here
		System.out.println("after removing:"+ myset); //[null, 100, welcome]
		
		// insertion at index is not possible in hashset as no index
		//get specific value from hashset - not possible as no point of reference in location
		//but we can check if specific value is included in hash set
		System.out.println(myset.contains("welcome"));
		System.out.println(myset.contains(4));

		//reading elements from HashSet only available via "for-each" also known as "enhanced for" loop as it is iterated sequentially rather than via index
		for(Object x:myset)
		{
			System.out.println(x);
		}
		
		
	}

}



