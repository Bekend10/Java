
package Bai2;

import java.util.Scanner;

public class Student {
    static Scanner sc = new Scanner(System.in);
    
    private String Name;
    private String Class;
    private String Score;
    private Faculty y = new Faculty();
    
    public Student(){
        
    } 
    
    public Student(String Name , String Class , String Score , Faculty y){
        this.Name = Name;
        this.Class = Class;
        this.Score = Score;
        this.y = y;
    }
    
    public void Input(){
        System.out.print("Nhap ten sinh vien : ");
        this.Name = sc.nextLine();
        System.out.print("Nhap lop : ");
        this.Class = sc.nextLine();
        System.out.print("Nhap diem : ");
        this.Score = sc.nextLine();
        this.y.Input();
    }
    
    public void Output(){
        System.out.println("Ten sinh vien : " + Name);
        System.out.println("Lop : " + Class);
        System.out.println("Diem : " + Score );
        this.y.Output();
    }

    public String getName() {
        return this.Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }
    
    public String getScore() {
        return this.Score;
    }

    public void setScore(String Score) {
        this.Score = Score;
    }

    public Faculty getY() {
        return this.y;
    }

    public void setY(Faculty y) {
        this.y = y;
    }
    
    public static void main(String[] args) {
        System.out.print("Nhap so sinh vien can quan ly : ");
        int n = sc.nextInt();
        sc.nextLine();
        Student[] sv = new Student[n];
        
        for (int i = 0; i < n; i++) {
            sv[i] = new Student();
        }
        
        for (int i = 0; i < n; i++) {
            sv[i].Input();
        }
        
        System.out.println("---------------------");
        System.out.println("Thong tin cua sinh vien : ");
        
        for (int i = 0; i < n; i++) {
            sv[i].Output();
        }
    }
    
}
