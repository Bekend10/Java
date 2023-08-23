
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
public class Sach {
    static Scanner sc = new Scanner(System.in);
    
    public String bookCode;
    public String nameBook;
    public String nameWriter;
    public String nameCompany;
    public int year;
    
    public Sach (String maSach , String tenSach , String tacGia , String NXB , int namSX){
        bookCode = maSach;
        nameBook = tenSach;
        nameWriter = tacGia;
        nameCompany = NXB;
        year = namSX;
    }
    
    public Sach(){
        
    }

    public String getBookCode() {
        return this.bookCode;
    }

    public void setBookCode(String bookCode) {
        this.bookCode = bookCode;
    }

    public String getNameBook() {
        return this.nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public String getNameWriter() {
        return this.nameWriter;
    }

    public void setNameWriter(String nameWriter) {
        this.nameWriter = nameWriter;
    }

    public String getNameCompany() {
        return this.nameCompany;
    }

    public void setNameCompany(String nameCompany) {
        this.nameCompany = nameCompany;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
    
    
    
    public void getInformation(){
        System.out.print("Nhap ma sach : ");
        bookCode = sc.nextLine();
        System.out.print("Nhap ten sach : ");
        nameBook = sc.nextLine();
        System.out.print("Nhap tac gia  : ");
        nameWriter = sc.nextLine();
        System.out.print("Nhap nha xuat ban : ");
        nameCompany = sc.nextLine();
        System.out.print("Nhap nam xuat ban : ");
        year = sc.nextInt();
        sc.nextLine();
    }  
    
    public void disPlay(){
        System.out.print(bookCode + "\t\t" + nameBook + "\t\t" + nameWriter + "\t\t" + nameCompany + "\t\t" + year + "\n" );
        
    }
    
    public static void main(String[] args) {
        Sach[] book = new Sach[5];
        for (int i = 0; i < 5; i++) {
            book[i] = new Sach();
        }
        
        for (int i = 0 ; i < 5 ; i++){
            book[i].getInformation();
        }
        System.out.print("Ma sach " + "\t\t" + "Ten sach" + "\t\t" + "Tac gia " + "\t\t Nha xuat ban " + "\t\t" + "Nam xuat ban " + "\n");
        for (int i = 0; i < 5; i++) {
            book[i].disPlay();
        }   
    }
}

