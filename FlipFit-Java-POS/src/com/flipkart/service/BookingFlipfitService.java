/**
 * 
 */
package com.flipkart.service;

/**
 * 
 */
public class BookingFlipfitService {

	/**
	 * @param args
	 */
	void deletbooking(int bookingId)
	{
		System.out.println("the booking is deleted");
	}
	
	void overrideslots(int slotId)
	{
		System.out.println("The slots are overidden");
	}
	
	void modifyslots(int bookingId)
	{
		System.out.println("the booking is modified");
	}
	
	void cancelBooking(int bookingId)
	{
		System.out.println("the booking is cancelled");
	}
	
	public boolean BookingConfirmed(int bookingId)
	{
		System.out.println("the booking is confirmed");
		return true;
	}
	
	public boolean isWaiting(int bookingId)
	{
		System.out.println("the booking is in waiting");
		return true;
	}
	
	public boolean isBookingcancelled(int bookingId)
	{
       return true;
	}

}
