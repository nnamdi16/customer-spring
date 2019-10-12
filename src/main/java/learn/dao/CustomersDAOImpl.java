package learn.dao;

import learn.configuration.HibernateConfig;
import learn.entity.Customer;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class CustomersDAOImpl implements CustomersDAO {
  public CustomersDAOImpl() {
    super();
  }
  
  @Override
  public List<Customer> getCustomers() {
    Session session = null;
  
    @SuppressWarnings("unchecked")
    TypedQuery<Customer> query = null;
  
    try {
      session = HibernateConfig.getSessionFactory().openSession();
      session.beginTransaction();
//    CriteriaBuilder cb = session.getCriteriaBuilder();
//    CriteriaQuery<Customer> customerCriteriaQuery = cb.createQuery(Customer.class);
//    Root<Customer> root = customerCriteriaQuery.from(Customer.class);
//    customerCriteriaQuery.select(root);
//    Query query = session.createQuery(customerCriteriaQuery);
//    session.getTransaction().commit();
//    return query.getResultList();
      query = session.createQuery("from Customer");
    
    } catch (HibernateException e) {
      e.printStackTrace();
    }
    return query.getResultList();
  }
  
  
  @Override
  public void createCustomers(Customer customer) {
    Session session = null;
    try {
      session = HibernateConfig.getSessionFactory().getCurrentSession();
      session.beginTransaction();
      session.save(customer);
      System.out.println(session);
      session.getTransaction().commit();
      
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      session.close();
    }
  }
  
  //  @Override
//  public void save(Customer customer) {
//    Session session = HibernateConfig.getSessionFactory().getCurrentSession();
//    session.save(customer);
//    session.beginTransaction();
//    session.getTransaction().commit();
//
//  }
//
//  @Override
//  public List<Customer> list() {
//    @SuppressWarnings("unchecked")
//    TypedQuery<Customer> query = HibernateConfig.getSessionFactory().getCurrentSession().createQuery("from Customer");
//    return query.getResultList();
//  }
}
