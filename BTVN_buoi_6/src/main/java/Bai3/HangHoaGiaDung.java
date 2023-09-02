
package Bai3;

import java.util.Scanner;


public class HangHoaGiaDung extends HangHoa{
    static Scanner sc = new Scanner(System.in);
    
    String chucNang;

    public HangHoaGiaDung(String chucNang) {
        this.chucNang = chucNang;
    }
    
    public HangHoaGiaDung(){
        
    }

    public String getChucNang() {
        return this.chucNang;
    }

    public void setChucNang(String chucNang) {
        this.chucNang = chucNang;
    }

    
    
    public void nhap(){
        super.input();
        System.out.print("Nhap chuc nang : ");
        this.chucNang = sc.nextLine();
    }
    
    public void xuat(){
        super.output();
        System.out.println("Chuc nang : " + chucNang);
        System.out.println("Tong tien : " + tongTien());
    }
}
