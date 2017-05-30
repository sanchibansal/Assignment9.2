import java.util.*;

public class Collections {
	public static void main(String args[]){
		ArrayList<String> al = new ArrayList<String>();	//creating array list with duplicate data entries.
		al.add("Ravi");
		al.add("Vijay");  
		al.add("Ravi");  
		al.add("Ajay");				
		System.out.println("Data with duplicates.");
		Iterator itr1 = al.iterator();  			//creating iterator object
		while(itr1.hasNext()){  
		   System.out.println(itr1.next());			//printing values using iterator
		}
		HashSet <String> hs = new HashSet<String>();	//creating hashset
		hs.addAll(al);						//adding elements of arraylist into hashset
		System.out.println("Data without duplicates.");
		Iterator itr2 = hs.iterator();  		//creating iterator object 
		while(itr2.hasNext()){  
		   System.out.println(itr2.next());			//printing values using iterator 
		}
	}
}
