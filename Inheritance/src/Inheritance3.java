class PersonDemo
{
 private String name;
 private String dob;
 public String getName() {
  return name;
 }
 public void setName(String name) {
  this.name = name;
 }
 public String getDob() {
  return dob;
 }
 public void setDob(String dob) {
  this.dob = dob;
 }
 
}
class Teacher extends PersonDemo
{
 private double salary;
 public String subject;
 public double getSalary() {
  return salary;
 }
 public void setSalary(double salary) {
  this.salary = salary;
 }
 public String getSubject() {
  return subject;
 }
 public void setSubject(String subject) {
  this.subject = subject;
 }
 
}
class Student extends PersonDemo
{
 int sid;

 public int getSid() {
  return sid;
 }

 public void setSid(int sid) {
  this.sid = sid;
 }
 
}
class CollegeStudent extends Student
{
 public String getClg_name() {
  return clg_name;
 }
 public void setClg_name(String clg_name) {
  this.clg_name = clg_name;
 }
 public String getYear() {
  return year;
 }
 public void setYear(String year) {
  this.year = year;
 }
 String clg_name;
 String year;
}
public class Inheritance3 {

 public static void main(String[] args) {
  // TODO Auto-generated method stub
  PersonDemo p=new PersonDemo();
  p.setName("XYZ");
  p.setDob("26-Mar-2001");
  System.out.println("Person Details");
  System.out.println("Person Name : "+p.getName());
  System.out.println("Person dob : "+p.getDob());
  
  System.out.println();
  
  Teacher t=new Teacher();
  t.setSalary(135000);
  t.setDob("25jan");
  t.setName("ABC");
  t.setSubject("Programming");
  System.out.println("Teacher Details");
  System.out.println("Teacher Name : "+t.getName());
  System.out.println("Teacher dob : "+t.getDob());
  System.out.println("Teacher salary : "+t.getSalary());
  System.out.println("Teacher subject : "+t.getSubject());
  
  System.out.println();
  
  
  Student s=new Student();
  s.setName("DEF");
  s.setDob("20Feb");
  s.setSid(31033);
  System.out.println("Student Details");
  System.out.println("Student Name : "+s.getName());
  System.out.println("Student dob : "+s.getDob());
  System.out.println("Student ID : "+s.getSid());
  
  System.out.println();
  
  
  
  CollegeStudent c=new CollegeStudent();
  c.setName("GHI");
  c.setDob("31Mar");
  c.setSid(31033);
  c.setClg_name("KLU");
  c.setYear("fourth");
  System.out.println("College Student  Details");
  System.out.println("College Student Name : "+c.getName());
  System.out.println("College Student dob : "+c.getDob());
  System.out.println("College Student ID : "+c.getSid());
  System.out.println("College Name : "+c.getClg_name());
  System.out.println("Year of studying : "+c.getYear());
  
  
 }

}