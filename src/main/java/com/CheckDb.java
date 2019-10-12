package com;



import com.paga.business.rest.client.core.BusinessClient;
import com.paga.business.rest.client.response.AirtimePurchaseResponse;
import learn.dao.CustomerDao;
import learn.dao.StudentDAO;
import learn.dao.StudentDAOImpl;
import learn.entity.Customer;
import learn.entity.Student;

import java.util.List;

public class CheckDb {
  public static void main(String[] args) {
//    CustomerDao customerDao = new CustomerDao();
//    StudentDAO studentDAO = new StudentDAOImpl();
//    Customer customer = new Customer("Nnamdi", "Nwabuokei", "nnamdi@gmail.com");
//    customerDao.saveCustomer(customer);
//    Student student = new Student("Samuel", "Jackson", "read@gmail.com");
//    studentDAO.saveStudent(student);
    BusinessClient businessClient = new BusinessClient.Builder().setPrincipal("98F32858-CC3B-42D4-95A3-742110A8D405").setApiKey("d98076e2d14c4045970edc466faa2ec8cc47c9b89b654001b5e4db27179a0b9559bee92b78034c558a9d24aca2fa4135db8938a3f4a74b7da1157dee68e15213")
            .setCredential("rR9@f8u@bBES")
            .setTest(true)
            .build();
    AirtimePurchaseResponse response = businessClient.airtimePurchase("54321",3000, null, "07038276158", null, null, null,null);
    System.out.println(response);
//    List<Customer> customers = customerDao.getCustomers();
//    customers.forEach(c -> System.out.println(c.getFirstName()));

  }
}
