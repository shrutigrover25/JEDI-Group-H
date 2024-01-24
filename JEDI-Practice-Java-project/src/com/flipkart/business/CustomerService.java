package com.flipkart.business;

import com.flipkart.bean.Customer;

/**
 * This class represents a CustomerService.
 */
public class CustomerService implements  CustomerInterface {

    // create the customer array
    // add // delete // update // list :-- 2 operation
    Customer myCustomer[] = {new Customer(), new Customer(), new Customer()};

    public void createCustomer() {
        myCustomer[0].setCustomerID(101);
        myCustomer[0].setCustomerName("Amy");
        myCustomer[0].setCustomerAddress("Delhi");

        myCustomer[1].setCustomerID(102);
        myCustomer[1].setCustomerName("Bob");
        myCustomer[1].setCustomerAddress("Mumbai");

        myCustomer[2].setCustomerID(103);
        myCustomer[2].setCustomerName("Charlie");
        myCustomer[2].setCustomerAddress("Bangalore");

        System.out.println("Customers are created-->");
    }

    public boolean deleteCustomer(int CustomerId) {
    	int count = 0;
        for (Customer cust : myCustomer) {
            if (cust.getCustomerID() != CustomerId) {
                count++;
            }
        }

     
        Customer[] newCustomerArray = new Customer[count];
        int newIndex = 0;

        for (Customer cust : myCustomer) {
            if (cust.getCustomerID() != CustomerId) {
                newCustomerArray[newIndex++] = cust;
            }
        }

       
        myCustomer = newCustomerArray;

        System.out.println("Customer with ID " + CustomerId + " is deleted.");
        return true;
    }

    public boolean updateCustomer(int customerId, String newName, String newAddress) {
        for (Customer cust : myCustomer) {
            if (cust.getCustomerID() == customerId) {
                cust.setCustomerName(newName);
                cust.setCustomerAddress(newAddress);
                System.out.println("Customer with ID " + customerId + " is updated.");
                return true;
            }
        }
        System.out.println("Customer with ID " + customerId + " not found for updating.");
        return false;
    }

    public void listCustomer() {
        for (Customer cust : myCustomer) {
            System.out.println("Details of customer -->" + cust.getCustomerID() + " with -->" +
                    cust.getCustomerName() + " with-->" + cust.getCustomerAddress());
        }

        System.out.println("All customers displayed-->");
    }

    public static void main(String[] args) {
        CustomerService cs = new CustomerService();
        cs.createCustomer();
        cs.listCustomer();

        // Example of updating a customer
        cs.updateCustomer(102, "UpdatedName", "UpdatedAddress");
        cs.listCustomer();
        cs.deleteCustomer(102);
        cs.listCustomer();
    }
}
