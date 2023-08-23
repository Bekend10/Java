
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
public class HinhChuNhat {
    Scanner sc = new Scanner(System.in);
    public int D;
    public int R;
    
    public HinhChuNhat(int chieuDai , int chieuRong){
        D = chieuDai;
        R = chieuRong;
    }
    
    public HinhChuNhat(){
        
    }

    public int getD() {
        return this.D;
    }

    public void setD(int D) {
        this.D = D;
    }

    public int getR() {
        return this.R;
    }

    public void setR(int R) {
        this.R = R;
    }
    
    public void nhap(){
        System.out.print("Nhap chieu dai : ");
        D = sc.nextInt();
        System.out.print("Nhap chieu rong : ");
        R = sc.nextInt();
    }
    
    public void veHCN(){
        for (int i = 1; i <= R; i++) {
            for (int j =1; j <= D; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    public float chuVi(){
        return (this.D + this.R) * 2;
    }
    
    public float dienTich(){
        return this.D * this.R;
    }
    
    public static void main(String[] args) {
        HinhChuNhat hcn = new HinhChuNhat();
        hcn.nhap();
        hcn.veHCN();
        System.out.print("Chu vi cua hinh chu nhat : " + hcn.chuVi());
        System.out.println();
        System.out.print("Dien tich cua hinh chu nhat : " + hcn.dienTich());
    } 
    
}
