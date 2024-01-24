/**
 * 
 */
package com.flipkart.service;

/**
 * 
 */
public class CustomerFlipfitService {

	public void createBooking() {
		 
		 System.out.println("Booking is done-->");
		 
	 }
	  
	 public boolean cancelBooking(int userId) {
		 
	    System.out.println("Booking is cancelled with ID-->" +userId);
		 
		 return true; 
	 }
	 
	 public boolean updateBooking(int userId) {
		 
		 System.out.println("Booking is updated with ID-->" +userId); 
		 return true;
	 }
	
	 public boolean ManageUserProfile(int userId) {
		 
	
		 System.out.println("User profile is Managed");
		 return true;
	 }
	 
	   void Register()
		{
			System.out.println("the customer is registered");
		}
		
		void SelectGym()
		{
			System.out.println("the Gym is selected");
		}
		
		void viewAvailability()
		{
			System.out.println("Available slots");	
		}
		
		void fetchHistory(int userId)
		{
			System.out.println("The history is as follows");
		}
		
	 
	 
}
