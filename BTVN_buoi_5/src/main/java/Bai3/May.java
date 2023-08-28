
package Bai3;

import java.util.Scanner;

public class May {
    static Scanner sc = new Scanner(System.in);
    
    private String MaMay;
    private String TenMay;
    private String TinhTrang;
    
    public May(){
        
    }
    
    public May(String MaMay , String TenMay , String TinhTrang){
        this.MaMay = MaMay;
        this.TenMay = TenMay;
        this.TinhTrang = TinhTrang;
    }
    
    public void Nhap(){
        System.out.print("Nhap ma may : ");
        this.MaMay = sc.nextLine();
        System.out.print("Nhap ten may : ");
        this.TenMay = sc.nextLine();
        System.out.print("Nhap tinh trang : ");
        this.TinhTrang = sc.nextLine();
    }
    
    public void Xuat(){
        System.out.println("Ma may : " + MaMay);
        System.out.println("Ten may : " + TenMay);
        System.out.println("Tinh trang : " + TinhTrang);
    }

    public String getMaMay() {
        return this.MaMay;
    }

    public void setMaMay(String MaMay) {
        this.MaMay = MaMay;
    }

    public String getTenMay() {
        return this.TenMay;
    }

    public void setTenMay(String TenMay) {
        this.TenMay = TenMay;
    }

    public String getTinhTrang() {
        return this.TinhTrang;
    }

    public void setTinhTrang(String TinhTrang) {
        this.TinhTrang = TinhTrang;
    }  
}
