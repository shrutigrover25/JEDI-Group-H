/**
 * 
 */
package com.flipkart.client;

/**
 * 
 */

import com.flipkart.business.CustomerService;


public class CustomerClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// craete the Object of Service to acess all the methods 
		
			CustomerInterface service=new CustomerInterface();
				
				// call all the methods 
				
			    service.createCustomer();
			    System.out.println("delete Customer by id-->" +service.deleteCustomer(101));
			    System.out.println("update Customt by id-->" +service.updateCustomer(101));
			    service.listCustomer();

	}

}
