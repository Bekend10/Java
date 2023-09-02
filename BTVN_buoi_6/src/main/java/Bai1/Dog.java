
package Bai1;

import java.util.Scanner;

public class Dog extends Animal{
    static Scanner sc = new Scanner(System.in);
    
    String charater;

    public Dog(String charater) {
        this.charater = charater;
    }
    
    public Dog(){
        
    }

    public String getCharater() {
        return this.charater;
    }

    public void setCharater(String charater) {
        this.charater = charater;
    }
    @Override
    public void input(){
        super.input();
        System.out.print("Nhap tinh cach : ");
        this.charater = sc.nextLine();
    }

    public void output(){
        super.output();
        System.out.println("Tinh cach : " + charater);
    }
    
    public void tiengKeu(){
        System.out.print("Gau gau");
    }
}
