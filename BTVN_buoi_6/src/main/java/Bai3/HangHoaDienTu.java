
package Bai3;

import java.util.Scanner;

public class HangHoaDienTu extends HangHoa {
    static Scanner sc = new Scanner(System.in);
    
    int thoiGianBaoHanh;
    int congSuat;

    public HangHoaDienTu(int thoiGianBaoHanh, int congSuat) {
        this.thoiGianBaoHanh = thoiGianBaoHanh;
        this.congSuat = congSuat;
    }
    
    public HangHoaDienTu(){
        
    }

    public int getThoiGianBaoHanh() {
        return this.thoiGianBaoHanh;
    }

    public void setThoiGianBaoHanh(int thoiGianBaoHanh) {
        this.thoiGianBaoHanh = thoiGianBaoHanh;
    }

    public int getCongSuat() {
        return this.congSuat;
    }

    public void setCongSuat(int congSuat) {
        this.congSuat = congSuat;
    }
    
    public void nhap(){
        super.input();
        System.out.print("Nhap thoi gian bao hanh : ");
        this.thoiGianBaoHanh = sc.nextInt();
        System.out.print("Nhap cong suat : ");
        this.congSuat = sc.nextInt();
        sc.nextLine();
    }
    
    public void xuat(){
        super.output();
        System.out.println("Thoi gian bao hanh : " + thoiGianBaoHanh);
        System.out.println("Cong suat : " + congSuat);
        System.out.println("Tong tien : " + tongTien());
    }
    
}
