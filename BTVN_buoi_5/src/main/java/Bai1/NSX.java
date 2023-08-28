
package Bai1;

import java.util.Scanner;


public class NSX {
    
    static Scanner sc = new Scanner(System.in);
    
    private String MaNSX;
    private String TenNSX;
    private String DcNSX;
    
    public void Nhap(){
        System.out.print("Nhap ma NSX : ");
        this.MaNSX = sc.nextLine();
        System.out.print("Nhap ten NSX : ");
        this.TenNSX = sc.nextLine();
        System.out.print("Nhap dia chi NSX : ");
        this.DcNSX = sc.nextLine();
    }
    
    public void Xuat(){
        System.out.println("Ma NSX : " + MaNSX);
        System.out.println("Ten NSX : " + TenNSX);
        System.out.println("Dia chi NSX : " + DcNSX);
    }
    
    public NSX(){
        
    }
    
    public NSX(String MaNSX , String TenNSX , String DcNSX){
         this.MaNSX = MaNSX;
         this.TenNSX = TenNSX;
         this.DcNSX = DcNSX;  
    }

    public String getMaNSX() {
        return this.MaNSX;
    }

    public void setMaNSX(String MaNSX) {
        this.MaNSX = MaNSX;
    }

    public String getTenNSX() {
        return this.TenNSX;
    }

    public void setTenNSX(String TenNSX) {
        this.TenNSX = TenNSX;
    }

    public String getDcNSX() {
        return this.DcNSX;
    }

    public void setDcNSX(String DcNSX) {
        this.DcNSX = DcNSX;
    }
      
}
