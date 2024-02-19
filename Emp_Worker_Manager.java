import java.util.Scanner;

class Employee{
int emp_id ;
public void accept(){
System.out.println("Enter emp id :");
Scanner s = new Scanner (System.in);
emp_id = s.nextInt();
}
}

class Manager extends Employee{
int sal ;
public void accept(){
super.accept();
System.out.println("Enter salary of Manager :");
Scanner s = new Scanner (System.in);
sal = s.nextInt();
}
}

class Worker extends Employee{
int sal ;
public void accept(){
super.accept();
System.out.println("Enter salary of Worker :");
Scanner s = new Scanner (System.in);
sal = s.nextInt();
}
}

public class Emp_Worker_Manager {
public static void main (String args[]){
Scanner s = new Scanner (System.in);
Manager m = new Manager();
Worker w = new Worker();

try{
m.accept();
w.accept();
if(m.sal<w.sal){
throw new Exception ("Manager salary cant be less than Worker Salary");
}
}catch(Exception e){System.out.println(e.getMessage());}

}
}