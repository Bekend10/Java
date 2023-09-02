
package Bai3;

import java.util.ArrayList;
import java.util.Scanner;

public class HangHoa {
    static Scanner sc = new Scanner(System.in);
    
    protected String maHang;
    protected String tenHang;
    protected float soLuong;
    protected float donGia;
    protected VatLieu dsVL = new VatLieu();

    public HangHoa(String maHang, String tenHang, float soLuong, float donGia) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }
    
    public HangHoa(){
        
    }

    public String getMaHang() {
        return this.maHang;
    }

    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }

    public String getTenHang() {
        return this.tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public float getSoLuong() {
        return this.soLuong;
    }

    public void setSoLuong(float soLuong) {
        this.soLuong = soLuong;
    }

    public float getDonGia() {
        return this.donGia;
    }

    public void setDonGia(float donGia) {
        this.donGia = donGia;
    }

    public VatLieu getDsVL() {
        return this.dsVL;
    }

    public void setDsVL(VatLieu dsVL) {
        this.dsVL = dsVL;
    }
    
    public void input(){
        System.out.print("Nhap ma hang : " );
        this.maHang = sc.nextLine();
        System.out.print("Nhap ten hang : ");
        this.tenHang = sc.nextLine();
        System.out.print("Nhap so luong : ");
        this.soLuong = sc.nextFloat();
        System.out.print("Nhap don gia : ");
        this.donGia = sc.nextFloat();
        sc.nextLine();
        this.dsVL.nhap();
    }
    
    public float tongTien(){
        return this.getSoLuong() * this.getDonGia();
    }
    
    public void output(){
        System.out.println("Ma hang : " + maHang);
        System.out.println("Ten hang : " + tenHang);
        System.out.println("So luong : " + soLuong);
        System.out.println("Don gia : " + donGia);
        dsVL.xuat();
    }
    
    
    
    public static void main(String[] args) {
        ArrayList<HangHoaDienTu> dt = new ArrayList<>();
        ArrayList<HangHoaGiaDung> gd = new ArrayList<>();
        
        System.out.print("Nhap so hang : ");
        int n = sc.nextInt();
        sc.nextLine();
        
        System.out.println("Nhap thong tin hang hoa dien tu : ");
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin cua hang thu " + (i+1 + " : "));
            HangHoaDienTu dtu = new HangHoaDienTu();
            dtu.nhap();
            System.out.println();
            dt.add(dtu);
        }
        
        
        System.out.println("Nhap thong tin hang hoa gia dung : ");
         for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin cua hang thu " + (i+1 + " : "));
            HangHoaGiaDung gdu = new HangHoaGiaDung();
            gdu.nhap();
            System.out.println();
            gd.add(gdu);
        }
         
        System.out.println("\n--------------------------------");
         System.out.println("Thong tin cua Hang Hoa Dien Tu ");
         
        for (HangHoaDienTu dtu : dt){
            dtu.xuat();
        }
        System.out.println("\n--------------------------------");
        System.out.println("Thong tin cua Hang Hoa Gia Dung ");
        
        for (HangHoaGiaDung gdu : gd){
            gdu.xuat();
        }
        
    }
}
