
package Bai2;

import java.util.Scanner;


public class Faculty {
    static Scanner sc = new Scanner(System.in);
    
    private String Name;
    private String Date;
    private School x = new School();
    
    public Faculty(){
        
    }
    
    public Faculty(String Name, String Date, School x) {
        this.Name = Name;
        this.Date = Date;
        this.x = x;
    }
    
    public void Input(){
        System.out.print("Nhap ten Truong: ");
        this.x.setName(sc.nextLine());
        System.out.print("Ngay vao Truong: ");
        this.x.setDate(sc.nextLine());
        System.out.print("Nhap ten khoa : ");
        this.Name = sc.nextLine();
        System.out.print("Nhap ngay vao khoa : ");
        this.Date = sc.nextLine();
    }
    
    public void Output(){
        System.out.println("Ten truong : " + x.getName());
        System.out.println("Ngay vao truong : " + x.getDate());
        System.out.println("Ten khoa : " + Name);
        System.out.println("Ngay vao khoa : " + Date);
    }

    public String getName() {
        return this.Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getDate() {
        return this.Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public School getX() {
        return this.x;
    }

    public void setX(School x) {
        this.x = x;
    }

}
