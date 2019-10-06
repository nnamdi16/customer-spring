package learn.dao;

import learn.configuration.HibernateConfig;
import learn.entity.Customer;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class CustomerDao {
  public void saveCustomer(Customer customer) {
    Transaction transaction = null;
    try{
      Session session = HibernateConfig.getSessionFactory().getCurrentSession();
      transaction = session.beginTransaction();
      session.save(customer);
      session.getTransaction().commit();
    }catch (Exception e) {
      if (transaction != null) {
        transaction.rollback();
      }
      
      e.printStackTrace();
    }
  }
}
