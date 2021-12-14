import java.util.Scanner;

public class StudentData{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Student obj1 = new Student();
        System.out.println("Enter the student name");
        obj1.setStudName(scan.nextLine());
        System.out.println("Enter the student roll number");
        obj1.setRollNo(scan.nextInt());
        System.out.println("Enter student percentage");
        obj1.setPercentage(scan.nextFloat());
        scan.nextLine();

        Student obj2 = new Student();
        System.out.println("Enter the student name");
        obj2.setStudName(scan.nextLine());
        System.out.println("Enter the student roll number");
        obj2.setRollNo(scan.nextInt());
        System.out.println("Enter student percentage");
        obj2.setPercentage(scan.nextFloat());
        scan.nextLine();

        Student obj3 = new Student();
        System.out.println("Enter the student name");
        obj3.setStudName(scan.nextLine());
        System.out.println("Enter the student roll number");
        obj3.setRollNo(scan.nextInt());
        System.out.println("Enter student percentage");
        obj3.setPercentage(scan.nextFloat());
        scan.nextLine();


        Student obj4 = new Student();
        System.out.println("Enter the student name");
        obj4.setStudName(scan.nextLine());
        System.out.println("Enter the student roll number");
        obj4.setRollNo(scan.nextInt());
        System.out.println("Enter student percentage");
        obj4.setPercentage(scan.nextFloat());
        scan.nextLine();

        Student obj5 = new Student();
        System.out.println("Enter the student name");
        obj5.setStudName(scan.nextLine());
        System.out.println("Enter the student roll number");
        obj5.setRollNo(scan.nextInt());
        System.out.println("Enter student percentage");
        obj5.setPercentage(scan.nextFloat());
        scan.nextLine();

        System.out.println("The student name is:" +obj1.getStudName()+" the student roll number is:"+obj1.getRollNo()+ "the student percentage is:"+obj1.getPercentage());
        System.out.println("The student name is:" +obj2.getStudName()+" the student roll number is:"+obj2.getRollNo()+ "the student percentage is:"+obj2.getPercentage());
        System.out.println("The student name is:" +obj3.getStudName()+" the student roll number is:"+obj3.getRollNo()+ "the student percentage is:"+obj3.getPercentage());
        System.out.println("The student name i5:" +obj4.getStudName()+" the student roll number is:"+obj4.getRollNo()+ "the student percentage is:"+obj4.getPercentage());
        System.out.println("The student name is:" +obj5.getStudName()+" the student roll number is:"+obj5.getRollNo()+ "the student percentage is:"+obj5.getPercentage());
    }


}

class Student{
 private int rollNo;
 private String studName;
 private float percentage;
public int getRollNo() {
    return rollNo;
}
public float getPercentage() {
    return percentage;
}
public void setPercentage(float percentage) {
    this.percentage = percentage;
}
public String getStudName() {
    return studName;
}
public void setStudName(String studName) {
    this.studName = studName;
}
public void setRollNo(int rollNo) {
    this.rollNo = rollNo;
}
}