package com.flipkart.business;

public interface CustomerInterface {
	
	 public void createCustomer();
	 public boolean deleteCustomer(int CustomerId) ;
	 public boolean updateCustomer(int customerId, String newName, String newAddress) ;
	 public void listCustomer();
	 
	 

}
