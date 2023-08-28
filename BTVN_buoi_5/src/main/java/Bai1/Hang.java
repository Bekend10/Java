
package Bai1;

import java.util.Scanner;

public class Hang {
    static Scanner sc = new Scanner(System.in);
    
    private String MaHang;
    private String TenHang;
    private NSX x = new NSX();
    
    
    public Hang(String MaHang , String TenHang , NSX x){
        this.MaHang = MaHang;
        this.TenHang = TenHang;
        this.x = x;
    }
    
    public Hang(){
        
    }
    
    public void Nhap(){
        System.out.print("Nhap ma hang : ");
        this.MaHang = sc.nextLine();
        System.out.print("Nhap ten hang : ");
        this.TenHang = sc.nextLine();
        this.x.Nhap();
    }
    
    public void Xuat(){
        System.out.println("-----------------");
        System.out.println("Thong tin cua hang : ");
        System.out.println("Ma hang : " + MaHang);
        System.out.println("Ten hang : " + TenHang);
        x.Xuat();
    }

    public String getMaHang() {
        return this.MaHang;
    }

    public void setMaHang(String MaHang) {
        this.MaHang = MaHang;
    }

    public String getTenHang() {
        return this.TenHang;
    }

    public void setTenHang(String TenHang) {
        this.TenHang = TenHang;
    }

    public NSX getX() {
        return this.x;
    }

    public void setX(NSX x) {
        this.x = x;
    }
    
    public static void main(String[] args) {
        Hang a = new Hang();
        a.Nhap();
        a.Xuat();
    }
}
