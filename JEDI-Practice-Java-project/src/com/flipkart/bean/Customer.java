/**
 * 
 */
package com.flipkart.bean;

/**
 * 
 */
public class Customer {

	// properties
		private int customerID;
		
		
		private String customerName;
		private String customerAddress;
		
		// Setter getter methods
		
		/**
		 * @return the customerID
		 */
		public int getCustomerID() {
			return customerID;
		}
		/**
		 * @param customerID the customerID to set
		 */
		public void setCustomerID(int customerID) {
			this.customerID = customerID;
		}
		/**
		 * @return the customerName
		 */
		public String getCustomerName() {
			return customerName;
		}
		/**
		 * @param customerName the customerName to set
		 */
		public void setCustomerName(String customerName) {
			this.customerName = customerName;
		}
		/**
		 * @return the customerAddress
		 */
		public String getCustomerAddress() {
			return customerAddress;
		}
		/**
		 * @param customerAddress the customerAddress to set
		 */
		public void setCustomerAddress(String customerAddress) {
			this.customerAddress = customerAddress;
		}

}
