package learn.service;

import learn.dao.StudentDAO;

import learn.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


public class StudentServiceImpl implements StudentService {
  
  @Autowired
  private StudentDAO studentDAO;
  
  @Override
  @Transactional
  public List<Student> getStudents() {
    return studentDAO.getStudents();
  }
  
  @Override
  @Transactional
  public void saveStudents(Student theStudent) {
    studentDAO.saveStudent(theStudent);
  }
  
//  @Override
//  @Transactional
//  public Student getStudent(int theId) {
//    return studentDAO.getStudent(theId);
//  }
//
//
//  public void deleteStudent(int theId) {
//    studentDAO.deleteStudent(theId);
//  }
  
}
