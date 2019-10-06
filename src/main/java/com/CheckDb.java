package com;



import learn.dao.CustomerDao;
import learn.entity.Customer;

import java.util.List;

public class CheckDb {
  public static void main(String[] args) {
    CustomerDao customerDao = new CustomerDao();
    Customer customer = new Customer("Nnamdi", "Nwabuokei", "nnamdi@gmail.com");
    customerDao.saveCustomer(customer);

//    List<Customer> customers = customerDao.getCustomers();
//    customers.forEach(c -> System.out.println(c.getFirstName()));

  }
}
