package learn.controllers;

import learn.dao.CustomerDao;
import learn.entity.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomerController {
  
  @RequestMapping("/index")
  public String loadIndexPage() {
    CustomerDao customerDao = new CustomerDao();
    Customer customer = new Customer("Nnamdi", "Nwabuokei", "valiantnnamdi@yahoo.ca");
    System.out.println("Saving customers");
    customerDao.saveCustomer(customer);
    System.out.println("Customers saved");
    return "home";
  }
}
