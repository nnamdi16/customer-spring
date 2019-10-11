package learn.service;

import learn.dao.CustomersDAO;
import learn.dao.CustomersDAOImpl;
import learn.entity.Customer;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
  
  CustomersDAO customersDAO = new CustomersDAOImpl();
  
  @Override
  @Transactional
  public List<Customer> getCustomers() {
    return customersDAO.getCustomers();
  }
  
  @Override
  public void createCustomers(Customer customer) {
    customersDAO.createCustomers(customer);
  }
//
//  @Override
//  public void save(Customer customer) {
//    customersDAO.save(customer);
//  }
//
//  @Override
//  public List<Customer> list() {
//    return customersDAO.list();
//  }
}
