package com.longnx;

import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.HashMap;

public class CustomUserStore {

    public User getUser(String username){
        try (Session session = HibernateUtils.getSessionFactory().openSession();) {
            // Begin a unit of work
            session.beginTransaction();

            Query<User> query = session.createQuery("select u from User u where u.name = :username", User.class);
            query.setParameter("username", username);

            // Commit the current resource transaction, writing any unflushed changes to the database.
            session.getTransaction().commit();
            return query.getSingleResult();
        }
    }
}