package day15;
//HashMap - a class implemented Map interface
//--------------
//Data can be stored in the form of key, value pairs.
//Key is unique. But we can have duplicate values.
//Insertion order not preserved(Index not followed)
import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
	
		
		//HashMap hm=new HashMap();
		//Map hm=new HashMap();
		
		HashMap<Integer,String> hm=new HashMap<Integer, String>(); //restricting keys as Integers and values as Strings types
		
		//adding data pairs to hashmap:
		hm.put(101,"John");
		hm.put(102,"Scott");
		hm.put(103,"John");//value John can be as duplicate, only keys need to be unique
		hm.put(104,"Mary");
		hm.put(101,"David");//101 key value is replaced as it is duplicate and keys need to be unique
		
		System.out.println(hm); //  {101=David, 102=Scott, 103=John, 104=Mary}
		
		System.out.println(hm.size()); //4
		
		//remove pair by passing key in .remove() method
		hm.remove(103);// 103 is key
		
		System.out.println("After removing pair:"+hm); //{101=David, 102=Scott, 104=Mary}

		//get specific value by passing key in .get() method
		System.out.println(hm.get(102));//here 102 is key > you get Scott value
		
		//print only keys from hashmap
		System.out.println(hm.keySet());  //[101, 102, 104]
		
		//print values from hashmap with keys individually
		for(Object k:hm.keySet())
		{
			System.out.println(k+"  "+ hm.get(k));
					
		}
		
		hm.clear();
		
		System.out.println(hm);//{}
		
		
		
		
		
		
		
		
	}

}
