package com.DAOs;

import com.Entities.User;

import java.util.List;

public interface UserDAO {

    public List<User> getCustomer();

    public void addCustomer(User theCustomer);

    public User getCustomer(int id);

    public void deleteCustomer(int id);




}
