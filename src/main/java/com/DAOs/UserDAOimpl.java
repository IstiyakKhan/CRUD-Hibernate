package com.DAOs;

import com.Entities.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDAOimpl implements UserDAO {

    @Autowired
    private SessionFactory sessionFactory;


    public List<User> getCustomer() {
        Session session = sessionFactory.getCurrentSession();

        Query<User> query = session.createQuery("FROM User order by firstName");

        List<User> details = query.getResultList();

        return details;
    }

    public void addCustomer(User theCustomer) {
        Session session = sessionFactory.getCurrentSession();

        session.saveOrUpdate(theCustomer);
    }

    public User getCustomer(int id) {
        Session session = sessionFactory.getCurrentSession();

        User customer = session.get(User.class,id);

        return customer;
    }

    public void deleteCustomer(int id) {
        Session session = sessionFactory.getCurrentSession();

        session.createQuery("delete FROM User c where c.id = " + id).executeUpdate();
    }



}
