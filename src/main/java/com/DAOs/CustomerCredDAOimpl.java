package com.DAOs;

import com.Entities.CustomerCred;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CustomerCredDAOimpl implements CustomerCredDAO{

    @Autowired
    private SessionFactory sessionFactory;

    public boolean validate(String uname, String pass) {

        boolean isPresent = false;

        Session session = sessionFactory.getCurrentSession();

        Query<CustomerCred> query = session.createQuery("From CustomerCred cc where cc.username = :uname and cc.password = :pass");
        query.setParameter("uname",uname);
        query.setParameter("pass",pass);

        List<CustomerCred> details = query.getResultList();

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

        Query<CustomerCred> customerCredQuery = session.createQuery("SELECT username FROM CustomerCred");

        List<CustomerCred> listOfUsername = customerCredQuery.getResultList();

        if(listOfUsername.contains(fname)){
            duplicateUsername = true;

        }
        else {
            CustomerCred customerCred = new CustomerCred(fname,pass);

            session.save(customerCred);
            duplicateUsername = false;
        }
        return duplicateUsername;
    }
}
