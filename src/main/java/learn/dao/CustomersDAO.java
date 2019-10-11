package learn.dao;

import learn.entity.Customer;

import java.util.List;

public interface CustomersDAO {
  public List<Customer> getCustomers();
  
  public void createCustomers(Customer customer);

//  void save(Customer customer);

//  List<Customer> list();
}
