package com;



import learn.dao.CustomerDao;
import learn.dao.StudentDAO;
import learn.dao.StudentDAOImpl;
import learn.entity.Customer;
import learn.entity.Student;

import java.util.List;

public class CheckDb {
  public static void main(String[] args) {
    CustomerDao customerDao = new CustomerDao();
    StudentDAO studentDAO = new StudentDAOImpl();
    Customer customer = new Customer("Nnamdi", "Nwabuokei", "nnamdi@gmail.com");
    customerDao.saveCustomer(customer);
    Student student = new Student("Samuel", "Jackson", "read@gmail.com");
    studentDAO.saveStudent(student);

//    List<Customer> customers = customerDao.getCustomers();
//    customers.forEach(c -> System.out.println(c.getFirstName()));

  }
}
