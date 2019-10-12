package learn.configuration;

import learn.entity.Customer;
import learn.entity.Student;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.util.Properties;

@org.springframework.context.annotation.Configuration
@EnableWebMvc
@EnableTransactionManagement
@ComponentScan(basePackages = {
        "learn"
})
public class HibernateConfig {
  private static SessionFactory sessionFactory;
  
  @Bean
  public static SessionFactory getSessionFactory() {
    if (sessionFactory == null) {
      try {
      
        
        Configuration configuration = new Configuration();
        Properties settings = new Properties();
        settings.put(Environment.DRIVER,"com.mysql.cj.jdbc.Driver");
        settings.put(Environment.URL, "jdbc:mysql://localhost:3306/web_customer_tracker?useSSL=false&serverTimezone=UTC");
        settings.put(Environment.USER,"springstudent");
        settings.put(Environment.PASS, "springstudent");
        settings.put(Environment.DIALECT, "org.hibernate.dialect.MySQLDialect");
        settings.put(Environment.POOL_SIZE, 1000);
        settings.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");
        settings.put(Environment.SHOW_SQL, "true");
        configuration.setProperties(settings);
        //Add annotation for all entity here
        //configuration.addAnnotatedClass(Student.class);
        configuration.addAnnotatedClass(Customer.class);
        configuration.addAnnotatedClass(Student.class);
  
        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
        sessionFactory = configuration.buildSessionFactory(serviceRegistry);
      } catch (Exception e) {
        e.printStackTrace();
      }
  
    }
    return sessionFactory;
  }
  
  
}
