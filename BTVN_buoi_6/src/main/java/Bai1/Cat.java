
package Bai1;

import java.util.Scanner;

public class Cat extends Animal  {
    static Scanner sc = new Scanner(System.in);
    
    String color;
    String preferences;
    String ownerName;

    public Cat(String color, String preferences, String ownerName) {
        this.color = color;
        this.preferences = preferences;
        this.ownerName = ownerName;
    }
    
    public Cat(){
        
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPreferences() {
        return this.preferences;
    }

    public void setPreferences(String preferences) {
        this.preferences = preferences;
    }

    public String getOwnerName() {
        return this.ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
    
    @Override
    public void input(){
        super.input();
        System.out.print("Nhap mau : ");
        this.color = sc.nextLine();
        System.out.print("Nhap so thich : ");
        this.preferences = sc.nextLine();
        System.out.print("Nhap chu so huu : ");
        this.ownerName = sc.nextLine();
    }
    
    
    public void output(){
        super.output();
        System.out.println("Mau : " + color);
        System.out.println("So thich : " + preferences);
        System.out.println("Chu so huu : " + ownerName);
    }
    
    public void tiengKeu(){
        System.out.println("Meo meo");
    }
    
}
