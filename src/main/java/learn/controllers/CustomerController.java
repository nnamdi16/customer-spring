package learn.controllers;


import learn.entity.Customer;
import learn.service.CustomerService;
import learn.service.CustomerServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
@RequestMapping("/customer")
public class CustomerController {
  
  
  @RequestMapping("/getCustomers")
  public String listCustomers(Model model) {
    CustomerService customerService = new CustomerServiceImpl();
    List<Customer> theCustomers = customerService.getCustomers();
    model.addAttribute("customer", theCustomers);
    System.out.println(theCustomers);
    return "list-customers";
  }


  
  
  @GetMapping("/showForm")
  public String showFormForAdd(Model model) {
    Customer theCustomer = new Customer();
    model.addAttribute("customer", theCustomer);
    return "customer-form";
  }
  
  @PostMapping("/saveCustomer")
  public String saveCustomer(@ModelAttribute("customer") Customer theCustomer) {
    CustomerService customerService = new CustomerServiceImpl();
    customerService.createCustomers(theCustomer);
    return "redirect:/customer/list";
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
