package com.Services;

import com.DAOs.UserDataDAO;
import com.DAOs.UserDAO;
import com.Entities.User;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;
import java.util.List;

@org.springframework.stereotype.Service
public class ServiceImpli implements Service{

    @Autowired
    private UserDAO customerDao;

    @Autowired
    private UserDataDAO customerCredDAO;

    @Transactional
    public List<User> getCustomer() {
        return customerDao.getCustomer();
    }

    @Transactional
    public void addCustomer(User theCustomer) {
        customerDao.addCustomer(theCustomer);
    }

    @Transactional
    public User getCustomer(int id) {
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
