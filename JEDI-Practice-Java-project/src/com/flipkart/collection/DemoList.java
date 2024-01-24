package com.flipkart.collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class DemoList {
	
public static void main(String[] args) {
	
		
		// define the array List here 
		
		   List<String> al = new ArrayList<String>();
		   
		   
		   System.out.println("Initial size of al: " + al.size());
	
	        al.add("mumbai");
	        al.add("MALE");
	        al.add("NEW YORK");
	        al.add("COLOMBO");
	        al.add("Pune");
	        al.add("Pune");
	        
	        
	        // After adding the element
	        System.out.println("After Adding  size of al: " + al.size());
	        
	        
	       // remove the collection here 
	        
	        al.remove("COLOMBO");
	        //  al.remove(2);
	          System.out.println("Size of al after deletions: " + al.size());
	          System.out.println("Contents of al: " + al);
	        
	        // Iterable interface 
	          
	          // Iterator is interface which is using to iterate the Collection
	          Iterator<String> i=al.iterator();
	          while(i.hasNext()){
	        	  
	        	  String test=i.next();
	        	  System.out.println("detals of Capital------>" +test);
	          }
}
}
