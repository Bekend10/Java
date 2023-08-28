
package Bai3;

import java.util.Scanner;

public class PhongMay {
    static Scanner sc = new Scanner(System.in);
    
    private String MaPhong;
    private String TenPhong;
    private double DienTich;
    private QuanLy x = new QuanLy();
    private May[] y;
    private int n;
    
    public PhongMay(){
        
    }

    public PhongMay(String MaPhong, String TenPhong, double DienTich, QuanLy x , May[] y , int n) {
        this.MaPhong = MaPhong;
        this.TenPhong = TenPhong;
        this.DienTich = DienTich;
        this.x = x;
        this.y = y;
        this.n = n;
    }
    
    public void Nhap(){
        System.out.print("Nhap ma phong : " );
        this.MaPhong = sc.nextLine();
        System.out.print("Nhap ten phong : ");
        this.TenPhong = sc.nextLine();
        System.out.print("Nhap dien tich : ");
        this.DienTich = sc.nextDouble();
        this.x.Nhap();
        System.out.print("Nhap so luong may : ");
        this.n = sc.nextInt();
        y = new May[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap thong tin cua may thu " + (i+1) + ":\n");
            y[i] = new May();
            y[i].Nhap();
        }
    }
    
    public void Xuat(){
        System.out.println("-----------------------------------");
        System.out.println("Thong tin phong : ");
        System.out.println("Ma phong : " + MaPhong);
        System.out.println("Ten phong : " + TenPhong);
        System.out.println("Dien tich : " + DienTich);
        x.Xuat();
        System.out.println("----------Thong tin may---------");
        for (int i = 0; i < n; i++) {
            y[i].Xuat();
        }
    }

    public String getMaPhong() {
        return MaPhong;
    }

    public void setMaPhong(String MaPhong) {
        this.MaPhong = MaPhong;
    }

    public String getTenPhong() {
        return TenPhong;
    }

    public void setTenPhong(String TenPhong) {
        this.TenPhong = TenPhong;
    }

    public double getDienTich() {
        return DienTich;
    }

    public void setDienTich(double DienTich) {
        this.DienTich = DienTich;
    }

    public QuanLy getX() {
        return x;
    }

    public void setX(QuanLy x) {
        this.x = x;
    }

    public May[] getY() {
        return y;
    }

    public void setY(May[] y) {
        this.y = y;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    
    public static void main(String[] args) {
        PhongMay a = new PhongMay();
        a.Nhap();
        a.Xuat();
    }
}
