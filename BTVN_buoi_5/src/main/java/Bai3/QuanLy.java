
package Bai3;

import java.util.Scanner;

public class QuanLy {
    
    static Scanner sc = new Scanner(System.in);
    
    private String MaQL;
    private String HoTen;
    
    public QuanLy(){
        
    }
    
    public QuanLy(String MaQL , String HoTen){
        this.MaQL = MaQL;
        this.HoTen = HoTen;
    }
    
    public void Nhap(){
        System.out.print("Nhap ma quan ly : ");
        this.MaQL = sc.nextLine();
        System.out.print("Nhap ho va ten : " );
        this.HoTen = sc.nextLine();
    }
    
    public void Xuat(){
        System.out.println("Ma quan ly : " + MaQL);
        System.out.println("Ho va ten : " + HoTen);
    }

    public String getMaQL() {
        return this.MaQL;
    }

    public void setMaQL(String MaQL) {
        this.MaQL = MaQL;
    }

    public String getHoTen() {
        return this.HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }
    
}
