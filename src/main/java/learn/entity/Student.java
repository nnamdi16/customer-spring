package learn.entity;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.GenericGenerators;

import javax.persistence.*;

@Entity
@Table(name="student")
public class Student {
  
  @Id
  @GenericGenerator(name = "id",strategy = "increment")
  @Column(name = "id")
  private int id;
  
  @Column(name= "student_firstName")
  private String firstName;
  
  @Column(name = "student_lastName")
  private String lastName;
  
  @Column(name = "student_email")
  private String email;
  
  public Student() {}
  
  public Student(String firstName, String lastName, String email) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
  }
  
  public int getId() {
    return id;
  }
  
  public void setId(int id) {
    this.id = id;
  }
  
  public String getFirstName() {
    return firstName;
  }
  
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }
  
  public String getLastName() {
    return lastName;
  }
  
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }
  
  public String getEmail() {
    return email;
  }
  
  public void setEmail(String email) {
    this.email = email;
  }
  
  @Override
  public String toString() {
    return "Student{" +
            "id=" + id +
            ", firstName='" + firstName + '\'' +
            ", lastName='" + lastName + '\'' +
            ", email='" + email + '\'' +
            '}';
  }
}
