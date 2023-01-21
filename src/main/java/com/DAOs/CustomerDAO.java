package com.DAOs;

import com.Entities.Customer;

import java.util.List;

public interface CustomerDAO {

    public List<Customer> getCustomer();

    public void addCustomer(Customer theCustomer);

    public Customer getCustomer(int id);

    public void deleteCustomer(int id);




}
