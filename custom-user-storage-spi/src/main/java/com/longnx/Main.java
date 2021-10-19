//package com.longnx;
//
//import org.hibernate.Session;
//import org.hibernate.query.Query;
//
//public class Main {
//    public static void main(String[] args) {
//        try (Session session = HibernateUtils.getSessionFactory().openSession();) {
//            // Begin a unit of work
//            session.beginTransaction();
//
//            Query<User> query = session.createQuery("select u from User u where u.name=:username", User.class);
//            query.setParameter("username", "long");
//
//            User user = query.getSingleResult();
//            // Commit the current resource transaction, writing any unflushed changes to the database.
//            session.getTransaction().commit();
//        }
//    }
//}
