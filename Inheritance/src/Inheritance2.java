class Person
{
 private String name;

 public String getName() {
  return name;
 }

 public void setName(String name) {
  this.name = name;
 }
}
class Employee extends Person
{
 double salary;
 int joining;
 String insurance_no;
 public double getSalary() {
  return salary;
 }
 public void setSalary(double salary) {
  this.salary = salary;
 }
 public int getJoining() {
  return joining;
 }
 public void setJoining(int joining) {
  this.joining = joining;
 }
 public String getInsurance_no() {
  return insurance_no;
 }
 public void setInsurance_no(String insurance_no) {
  this.insurance_no = insurance_no;
 }
 
}
public class Inheritance2{
	public static void main(String[] args) {
		  // TODO Auto-generated method stub
		  Employee e=new Employee();
		  e.setName("XYZ");
		  e.setSalary(100000);
		  e.setJoining(2022);
		  e.setInsurance_no("ABSDH1234");
		  System.out.println("Employee Details");
		  System.out.println("Employee name"+e.getName());
		  System.out.println("Employee Salary : "+e.getSalary());
		  System.out.println("Employee joining date : "+e.getJoining());
		  System.out.println("Employee insurance no : "+e.getInsurance_no());

 }
}