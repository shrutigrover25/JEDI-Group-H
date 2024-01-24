package com.flipkart.bean;

public class SlotDetails
{
	
	int gymId;
	int time;
	int capacity;
	int filledslots;
	
	int getGymId()
	{
		return gymId;
	}
	
	void setGymId(int gymId)
	{
		this.gymId=gymId;
	}
	
	int getCapacity()
	{
		return capacity;
	}
	
	
	void setCapacity(int capacity)
	{
		this.capacity=capacity;
	}
	
	int filledslots()
	{
		return filledslots;
	}
	
	
	void setfilledSlots(int filledslots)
	{
		this.filledslots=filledslots;
	}
	
	int getTime()
	{
		return time;
	}
	
	
	void settime(int time)
	{
		this.time=time;
	}
	
	
}
