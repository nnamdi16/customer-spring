package learn.dao;

import learn.configuration.HibernateConfig;
import learn.entity.Customer;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

@Repository
public class CustomersDAOImpl implements CustomersDAO {
  public CustomersDAOImpl() {
    super();
  }
  
  @Override
  public List<Customer> getCustomers() {
    Session session = HibernateConfig.getSessionFactory().getCurrentSession();
    CriteriaBuilder cb = session.getCriteriaBuilder();
    CriteriaQuery<Customer> customerCriteriaQuery = cb.createQuery(Customer.class);
    Root<Customer> root = customerCriteriaQuery.from(Customer.class);
    customerCriteriaQuery.select(root);
    Query query = session.createQuery(customerCriteriaQuery);
    return query.getResultList();
  }
  
  @Override
  public int hashCode() {
    return super.hashCode();
  }
  
  @Override
  public void createCustomers(Customer customer) {
    try {
      Session session = HibernateConfig.getSessionFactory().getCurrentSession();
      session.beginTransaction();
      session.save(customer);
      session.getTransaction().commit();
      
    } catch (Exception e) {
      e.printStackTrace();
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
