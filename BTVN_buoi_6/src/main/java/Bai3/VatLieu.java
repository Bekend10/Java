package Bai3;

import java.util.Scanner;

public class VatLieu {

    static Scanner sc = new Scanner(System.in);

    private String ten;
    private String mauSac;
    private int doCung;

    public VatLieu(String ten, String mauSac, int doCung) {
        this.ten = ten;
        this.mauSac = mauSac;
        this.doCung = doCung;
    }

    public VatLieu() {

    }

    public String getTen() {
        return this.ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMauSac() {
        return this.mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    public int getDoCung() {
        return this.doCung;
    }

    public void setDoCung(int doCung) {
        this.doCung = doCung;
    }

    public void nhap() {
        System.out.print("Nhap ten vat lieu : ");
        this.ten = sc.nextLine();
        System.out.print("Nhap mau sac : ");
        this.mauSac = sc.nextLine();
        System.out.print("Nhap do cung : ");
        this.doCung = sc.nextInt();
        sc.nextLine();
    }

    public void xuat() {
        System.out.println("Ten vat lieu : " + ten);
        System.out.println("Mau sac : " + mauSac);
        System.out.println("Do cung : " + doCung);
    }

}
