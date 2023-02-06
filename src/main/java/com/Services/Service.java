package com.Services;

import com.Entities.User;

import java.util.List;


public interface Service {

    public List<User> getCustomer();

    public void addCustomer(User theCustomer);

    public User getCustomer(int id);

    public void deleteCustomer(int id);

    public boolean Validator(String uname, String pass);

    public boolean register(String fname, String pass);


}
