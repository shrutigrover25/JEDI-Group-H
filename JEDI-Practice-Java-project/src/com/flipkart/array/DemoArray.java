/**
 * 
 */
package com.flipkart.array;

/**
 * 
 */
public class DemoArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = new int[5];
		a[0]=10;
		a[1]=17;
		a[2]=15;
		a[3]=8;
		a[4]=13;
		
		//list of array
		
//		for(int i=0;i<a.length;i++)
//		{
//			System.out.println("value of array -->"+a[i]);
//		}
		
		for(int i:a)
		{
			System.out.println(i);
		}

	}
	
	
	// wrapper class array like string Integer/character
	
	String[] strArrays = {"My","Flower","Lily"};
	
	for(String str: strArrays)
	{
		System.out.println(str);
	}
}

}
