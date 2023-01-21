package com.DAOs;

import com.Entities.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CustomerDAOimpl implements CustomerDAO {

    @Autowired
    private SessionFactory sessionFactory;


    public List<Customer> getCustomer() {
        Session session = sessionFactory.getCurrentSession();

        Query<Customer> query = session.createQuery("FROM Customer order by firstName");

        List<Customer> details = query.getResultList();

        return details;
    }

    public void addCustomer(Customer theCustomer) {
        Session session = sessionFactory.getCurrentSession();

        session.saveOrUpdate(theCustomer);
    }

    public Customer getCustomer(int id) {
        Session session = sessionFactory.getCurrentSession();

        Customer customer = session.get(Customer.class,id);

        return customer;
    }

    public void deleteCustomer(int id) {
        Session session = sessionFactory.getCurrentSession();

        session.createQuery("delete FROM Customer c where c.id = " + id).executeUpdate();
    }



}
