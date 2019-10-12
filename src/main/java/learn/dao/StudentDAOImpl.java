package learn.dao;

import learn.configuration.HibernateConfig;
import learn.entity.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public class StudentDAOImpl implements StudentDAO{

  @Override
  public List<Student> getStudents() {
    Transaction transaction = null;
    Query query = null;
      try{
        Session session = HibernateConfig.getSessionFactory().getCurrentSession();
        transaction = session.beginTransaction();
        CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
        CriteriaQuery<Student> criteriaQuery = criteriaBuilder.createQuery(Student.class);
        Root<Student> root = criteriaQuery.from(Student.class);
        criteriaQuery.select(root);
        query = session.createQuery(criteriaQuery);
        
      } catch (Exception e) {
        if (transaction != null) {
          transaction.rollback();
        }
        e.printStackTrace();
      }
    return query.getResultList();
  }
  
  @Override
  public void saveStudent(Student student) {
    Transaction transaction = null;
    
    try {
      Session session = HibernateConfig.getSessionFactory().getCurrentSession();
      transaction = session.beginTransaction();
      session.saveOrUpdate(student);
      session.getTransaction().commit();
      
    }catch (Exception e) {
      if (transaction != null) {
        transaction.rollback();
      }
  
      e.printStackTrace();
    }
  }
}
