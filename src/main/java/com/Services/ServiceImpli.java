package com.Services;

import com.DAOs.CustomerCredDAO;
import com.DAOs.CustomerDAO;
import com.Entities.Customer;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;
import java.util.List;

@org.springframework.stereotype.Service
public class ServiceImpli implements Service{

    @Autowired
    private CustomerDAO customerDao;

    @Autowired
    private CustomerCredDAO customerCredDAO;

    @Transactional
    public List<Customer> getCustomer() {
        return customerDao.getCustomer();
    }

    @Transactional
    public void addCustomer(Customer theCustomer) {
        customerDao.addCustomer(theCustomer);
    }

    @Transactional
    public Customer getCustomer(int id) {
        return customerDao.getCustomer(id);
    }

    @Transactional
    public void deleteCustomer(int id) {
        customerDao.deleteCustomer(id);
    }

    @Transactional
    public boolean Validator(String uname, String pass) {
        return customerCredDAO.validate(uname,pass);
    }

    @Transactional
    public boolean register(String fname, String pass) {
        return customerCredDAO.register(fname,pass);
    }

}
