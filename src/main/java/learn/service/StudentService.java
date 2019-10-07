package learn.service;

import learn.entity.Student;

import java.util.List;

public interface StudentService {
  
  public List<Student> getStudents();
  
  public void saveStudents(Student theStudent);
//
//  public Student getStudent(int theId);
//
//  public void deleteStudent(int theId);
}
