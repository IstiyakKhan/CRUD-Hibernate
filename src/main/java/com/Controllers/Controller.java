package com.Controllers;

import com.Entities.Customer;
import com.Services.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@org.springframework.stereotype.Controller
public class Controller {

    @Autowired
    private Service service;
    @GetMapping("/list")
    public ModelAndView check(Model theModel){

        List<Customer> customerList = service.getCustomer();
        theModel.addAttribute("customerList",customerList);

        return new ModelAndView("home");
    }

    @GetMapping("/redirectJsp")
    public ModelAndView redirect(Model theModel){

        Customer customer = new Customer();

        theModel.addAttribute("customer",customer);

        return new ModelAndView("AddCustomer");
    }

    @GetMapping("/formUpdate")
    public ModelAndView update(@RequestParam("customerId") int id, Model theModel){


         Customer customer = service.getCustomer(id);

         theModel.addAttribute("customer",customer);

        return new ModelAndView("AddCustomer");
    }


    @PostMapping("/adding")
    public String adding(@ModelAttribute("customer") Customer theCustomer){

       service.addCustomer(theCustomer);
        return "redirect:/list";
    }

    @GetMapping("/deleting")
    public String deleting(@RequestParam("customerId") int id){
        service.deleteCustomer(id);

        return "redirect:/list";
    }

    @PostMapping("/validate")
    public String validate(@RequestParam("uname") String uname, @RequestParam("pass") String pass, ServletRequest req, ServletResponse resp){

        boolean isPresent = service.Validator(uname,pass);

        if(isPresent == true){
            return "redirect:/list";
        }
        else {
            try {
                RequestDispatcher rd = req.getRequestDispatcher("/resources/view/index.jsp");
                PrintWriter pr = resp.getWriter();
                pr.print("<html><head><body><h2 style = color:#de5b52;position:relative;top:100px;left:40%>Invalid Username or Password</h2></body></head></html>");
                rd.include(req,resp);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }

            return null;
        }
    }

    @GetMapping("/redirectReg")
    public ModelAndView redirectReg(){
        return new ModelAndView("registeration");
    }

    @PostMapping("/register")
    public String register(@RequestParam("fname") String firstName, @RequestParam("lname") String lastName,
                           @RequestParam("email") String email, @RequestParam("pass") String pass,
                           @RequestParam("uname") String uname, ServletRequest req, ServletResponse resp){

        boolean duplicateUsername = false;
        boolean emptyField = true;

        if(firstName.length() != 0 && lastName.length() != 0 && email.length() != 0){
            emptyField = false;
            Customer customer = new Customer(firstName,lastName,email);
            service.addCustomer(customer);
            duplicateUsername = service.register(uname,pass);
       }

        RequestDispatcher rd = req.getRequestDispatcher("/resources/view/registeration.jsp");

        if(duplicateUsername){
            try {
                PrintWriter pr = resp.getWriter();
                pr.print("<html><head><body><h2 style = color:#de5b52;position:relative;top:100px;left:43%>Duplicate Username</h2></body></head></html>");
                rd.include(req,resp);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        else if(emptyField){
            try {
                PrintWriter pr = resp.getWriter();
                pr.print("<html><head><body><h2 style = color:#de5b52;position:relative;top:100px;left:41%>Please Enter in All Fields</h2></body></head></html>");
                rd.include(req,resp);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        else {
            return "redirect:Reg2Log";
        }
        return null;
    }

    @GetMapping("/Reg2Log")
    public String reg2Log(){
        return "index";
    }

}
