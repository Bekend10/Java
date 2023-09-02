
package Bai2;

import static Bai2.Student.sc;
import java.util.ArrayList;
import java.util.Scanner;

public class Person {
    static Scanner sc = new Scanner(System.in);
    
    protected String Name;
    protected Byte Age;
    protected String Address;
    protected Date birthDay = new Date();

    public Person(String Name, Byte Age, String Address) {
        this.Name = Name;
        this.Age = Age;
        this.Address = Address;
    }
    
    public Person(){
        
    }

    public String getName() {
        return this.Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public Byte getAge() {
        return this.Age;
    }

    public void setAge(Byte Age) {
        this.Age = Age;
    }

    public String getAddress() {
        return this.Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public Date getBirthDay() {
        return this.birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }
    
    public void input(){
        System.out.print("Nhap ten : ");
        this.Name = sc.nextLine();
        System.out.print("Nhap tuoi : ");
        this.Age = sc.nextByte();
        sc.nextLine();
        System.out.print("Nhap dia chi : ");
        this.Address = sc.nextLine();
        this.birthDay.input();
    }
    
    public void output(){
        System.out.println("Ten : " + Name);
        System.out.println("Tuoi : " + Age);
        System.out.println("Dia chi : " + Address);
        this.birthDay.output();
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        System.out.print("Nhap so luong sinh vien: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin cua sinh vien thu " + (i+1 + " : "));
            Student student = new Student();
            student.input();
            System.out.println();
            students.add(student);
        }
        
        System.out.println("\n------------------------");
        System.out.println("Thong tin cua sinh vien : \n");
        
        for (Student student : students) {
            student.output();
        }
    }
}
