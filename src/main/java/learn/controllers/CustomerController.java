package learn.controllers;


import learn.entity.Customer;
import learn.service.CustomerService;
import learn.service.CustomerServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller

public class CustomerController {


//  @RequestMapping("/getCustomers")
//  public String listCustomers(Model model) {
//    CustomerService customerService = new CustomerServiceImpl();
//    List<Customer> theCustomers = customerService.getCustomers();
//    model.addAttribute("customer", theCustomers);
//    return "editCustomer";
//  }
  
  @RequestMapping("/")
  public String addCustomer(Model model) {
    CustomerService customerService = new CustomerServiceImpl();
    Customer customer = new Customer("Habash", "Solomon", "hjabez@gmail.com");
    customerService.createCustomers(customer);
    System.out.println(customer);
    model.addAttribute("addCustomer", customer);
    return "editCustomer";
  }

//  @RequestMapping("/index")
//  public String loadIndexPage() {
//    CustomerDao customerDao = new CustomerDao();
//
//    Customer customer = new Customer("Nnamdi", "Nwabuokei", "valiantnnamdi@yahoo.ca");
//    System.out.println("Saving customers");
//    customerDao.saveCustomer(customer);
//    System.out.println("Customers saved");
//    return "home";
//  }
}
