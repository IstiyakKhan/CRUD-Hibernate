package com.DAOs;

import com.Entities.UserCred;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDataDAOimpl implements UserDataDAO {

    @Autowired
    private SessionFactory sessionFactory;

    public boolean validate(String uname, String pass) {

        boolean isPresent = false;

        Session session = sessionFactory.getCurrentSession();

        Query<UserCred> query = session.createQuery("From UserCred cc where cc.username = :uname and cc.password = :pass");
        query.setParameter("uname",uname);
        query.setParameter("pass",pass);

        List<UserCred> details = query.getResultList();

        if(details.size() > 0){
            isPresent = true;
        }
        else {
            isPresent = false;
        }

        return isPresent;
    }

    public boolean register(String fname, String pass) {

        Session session = sessionFactory.getCurrentSession();

        boolean duplicateUsername = false;

        Query<UserCred> customerCredQuery = session.createQuery("SELECT username FROM UserCred");

        List<UserCred> listOfUsername = customerCredQuery.getResultList();

        if(listOfUsername.contains(fname)){
            duplicateUsername = true;

        }
        else {
            UserCred customerCred = new UserCred(fname,pass);

            session.save(customerCred);
            duplicateUsername = false;
        }
        return duplicateUsername;
    }
}
