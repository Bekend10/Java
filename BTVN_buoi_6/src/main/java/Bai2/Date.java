
package Bai2;

import java.util.Scanner;

public class Date {
    static Scanner sc = new Scanner(System.in);
    
    private int year;
    private Byte month;
    private Byte day;

    public Date(int year, Byte month, Byte day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    
    public Date(){
        
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Byte getMonth() {
        return this.month;
    }

    public void setMonth(Byte month) {
        this.month = month;
    }

    public Byte getDay() {
        return this.day;
    }

    public void setDay(Byte day) {
        this.day = day;
    }
    
    public void input(){
        System.out.print("Nhap ngay sinh : ");
        this.day = sc.nextByte();
        System.out.print("Nhap thang sinh : ");
        this.month = sc.nextByte();
        System.out.print("Nhap nam sinh : ");
        this.year = sc.nextInt();
        sc.nextLine();
    }
    
    public void output(){
        System.out.println("Ngay sinh : " + day);
        System.out.println("Thang sinh : " + month);
        System.out.println("Nam sinh : " + year);
    }
    
}
