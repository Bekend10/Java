
import java.util.Scanner;

public class SinhVien {

    Scanner sc = new Scanner(System.in);

    public String maSinhVien;
    public String hoTen;
    public float diemToan;
    public float diemLy;
    public float diemHoa;

    public SinhVien(String msv, String name, int toan, int ly, int hoa) {
        maSinhVien = msv;
        hoTen = name;
        diemToan = toan;
        diemLy = ly;
        diemHoa = hoa;
    }

    public SinhVien() {

    }

    public String getMaSinhVien() {
        return this.maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getHoTen() {
        return this.hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public float getDiemToan() {
        return this.diemToan;
    }

    public void setDiemToan(float diemToan) {
        this.diemToan = diemToan;
    }

    public float getDiemLy() {
        return this.diemLy;
    }

    public void setDiemLy(float diemLy) {
        this.diemLy = diemLy;
    }

    public float getDiemHoa() {
        return this.diemHoa;
    }

    public void setDiemHoa(float diemHoa) {
        this.diemHoa = diemHoa;
    }

    public void nhap() {
        System.out.print("Nhap ma sinh vien : ");
        maSinhVien = sc.nextLine();
        System.out.print("Nhap ho va ten sinh vien : ");
        hoTen = sc.nextLine();
        System.out.print("Nhap diem toan : ");
        diemToan = sc.nextFloat();
        System.out.print("Nhap diem ly : ");
        diemLy = sc.nextFloat();
        System.out.print("Nhap diem hoa : ");
        diemHoa = sc.nextFloat();
        sc.nextLine();
    }

    public void xuat() {

        System.out.print("Ma SV : " + maSinhVien + "\n");
        System.out.print("Ho va Ten : " + hoTen + "\n");
        System.out.print("Diem Toan : " + diemToan + "\n");
        System.out.print("Diem Ly : " + diemLy + "\n");
        System.out.print("Diem Hoa : " + diemHoa + "\n");
    }

    public float diemTB() {
        return (this.diemToan + this.diemLy + this.diemHoa) / 3;
    }

    public static void main(String[] args) {
        SinhVien[] sv = new SinhVien[5];

        for (int i = 0; i < 5; i++) {
            sv[i] = new SinhVien();
        }

        for (int i = 0; i < 5; i++) {
            sv[i].nhap();
            System.out.println();
        }
        
        for (int i = 0; i < 5; i++) {
            sv[i].xuat();
            System.out.println("GPA : " + sv[i].diemTB());
            System.out.println();
        }
    }
}
