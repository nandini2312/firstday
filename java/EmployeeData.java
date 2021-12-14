import java.util.Scanner;

public class EmployeeData {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Employee obj1 = new Employee();
    System.out.println("Enter Name");
    obj1.setEmpName(scan.nextLine());
    System.out.println("Enter number");
    obj1.setEmpNo(scan.nextInt());
    System.out.println("Enter salary");
    obj1.setEmpSal(scan.nextInt());
    scan.nextLine();

    Employee obj2 = new Employee();
    System.out.println("Enter Name");
    obj2.setEmpName(scan.nextLine());
    System.out.println("Enter number");
    obj2.setEmpNo(scan.nextInt());
    System.out.println("Enter salary");
    obj2.setEmpSal(scan.nextInt());
    scan.nextLine();

    Employee obj3 = new Employee();
    System.out.println("Enter Name");
    obj3.setEmpName(scan.nextLine());
    System.out.println("Enter number");
    obj3.setEmpNo(scan.nextInt());
    System.out.println("Enter salary");
    obj3.setEmpSal(scan.nextInt());
    scan.nextLine();

    Employee obj4 = new Employee();
    System.out.println("Enter Name");
    obj4.setEmpName(scan.nextLine());
    System.out.println("Enter number");
    obj4.setEmpNo(scan.nextInt());
    System.out.println("Enter salary");
    obj4.setEmpSal(scan.nextInt());
    scan.nextLine();

    Employee obj5 = new Employee();
    System.out.println("Enter Name");
    obj5.setEmpName(scan.nextLine());
    System.out.println("Enter number");
    obj5.setEmpNo(scan.nextInt());
    System.out.println("Enter salary");
    obj5.setEmpSal(scan.nextInt());
    scan.nextLine();
   
    System.out.println(obj1.getEmpName() +","+ obj1.getEmpNo()+ ","+obj1.getEmpSal());
    System.out.println(obj2.getEmpName() +","+ obj2.getEmpNo()+ ","+obj2.getEmpSal());
    System.out.println(obj3.getEmpName() +","+ obj3.getEmpNo()+ ","+obj3.getEmpSal());
    System.out.println(obj4.getEmpName() +","+ obj4.getEmpNo()+ ","+obj4.getEmpSal());
    System.out.println(obj5.getEmpName() +","+ obj5.getEmpNo()+ ","+obj5.getEmpSal());
}
    

}
class Employee{
    private int empNo;
    private String empName;
    private int empSal;
    public int getEmpNo() {
        return empNo;
    }
    public int getEmpSal() {
        return empSal;
    }
    public void setEmpSal(int empSal) {
        this.empSal = empSal;
    }
    public String getEmpName() {
        return empName;
    }
    public void setEmpName(String empName) {
        this.empName = empName;
    }
    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }
    
}