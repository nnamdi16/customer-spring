package learn.dao;

import learn.entity.Customer;
import learn.entity.Student;

import java.util.List;

public interface StudentDAO {
  
  public List<Student> getStudents();
  public void saveStudent(Student theStudent);
//  public Student getStudent(int theId);
//  public void deleteStudent(int theId);
}
