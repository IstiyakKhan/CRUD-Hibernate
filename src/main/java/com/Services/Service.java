package com.Services;

import com.Entities.Customer;

import java.util.List;


public interface Service {

    public List<Customer> getCustomer();

    public void addCustomer(Customer theCustomer);

    public Customer getCustomer(int id);

    public void deleteCustomer(int id);

    public boolean Validator(String uname, String pass);

    public boolean register(String fname, String pass);


}
