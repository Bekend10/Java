package Bai1;


import java.util.Scanner;


public class Animal {
    static Scanner sc = new Scanner(System.in);
    
    protected String Name;
    protected Byte Age;
    protected Float Weight;

    public Animal(String Name, Byte Age, Float Weight) {
        this.Name = Name;
        this.Age = Age;
        this.Weight = Weight;
    }
    
    public Animal(){
        
    }

    public String getName() {
        return this.Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public Byte getAge() {
        return this.Age;
    }

    public void setAge(Byte Age) {
        this.Age = Age;
    }

    public Float getWeight() {
        return this.Weight;
    }

    public void setWeight(Float Weight) {
        this.Weight = Weight;
    }
    
    public void input(){
        System.out.print("Nhap ten : ");
        this.Name = sc.nextLine();
        System.out.print("Nhap tuoi : ");
        this.Age = sc.nextByte();
        System.out.print("Nhap can nang : ");
        this.Weight = sc.nextFloat();
        sc.nextLine();
    }
    
    public void output(){
        System.out.println("Ten : " + Name);
        System.out.println("Tuoi : " + Age);
        System.out.println("Can nang : " + Weight);
    }
    
    public void tiengKeu(){
        
    }
    
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        
        System.out.println("Nhap thong tin meo : ");
        cat.input();
        System.out.println("Nhap thong tin cho : ");
        dog.input();
        
        System.out.println("--------------------------\n");
        
        System.out.println("Thong tin sau khi nhap cua meo : ");
        cat.output();
        cat.tiengKeu();
        
        System.out.println();
        System.out.println("Thong tin sau khi nhap cua cho : ");
        dog.output();
        dog.tiengKeu();
    }
}
