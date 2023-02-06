package com.DAOs;

public interface UserDataDAO {

    public boolean validate(String uname, String pass);

    public boolean register(String fname, String pass);
}
