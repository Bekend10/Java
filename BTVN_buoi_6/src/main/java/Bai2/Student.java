
package Bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class Student extends Person {
    static Scanner sc = new Scanner(System.in);
    
    String Id;
    String Class;
    String School;

    public Student(String Id, String Class, String School) {
        this.Id = Id;
        this.Class = Class;
        this.School = School;
    }
    
    public Student(){
        
    }

    public String getId() {
        return this.Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getSchool() {
        return this.School;
    }

    public void setSchool(String School) {
        this.School = School;
    }
    
    @Override
    public void input(){
        super.input();
        System.out.print("Nhap ID : ");
        this.Id = sc.nextLine();
        System.out.print("Nhap lop : ");
        this.Class = sc.nextLine();
        System.out.print("Nhap truong : ");
        this.School = sc.nextLine();
    }
    
    public void output(){
        super.output();
        System.out.println("ID : " + Id);
        System.out.println("Lop : " + Class);
        System.out.println("Truong : " + School);
    }
    
}
