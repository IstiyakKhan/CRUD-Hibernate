package com.DAOs;

public interface CustomerCredDAO {

    public boolean validate(String uname, String pass);

    public boolean register(String fname, String pass);
}
