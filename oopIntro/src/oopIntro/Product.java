package oopIntro;

public class Product {

    int id;
    String name;
    double unitPrice;  //Birim fiyati
    String detail;

    public Product(){
        System.out.println("Ben çalıştım.");
    }

    public Product(int id, String name, double unitPrice, String detail){
        this();  // Parametresiz olanı da çalıştırır.
        this.id = id;
        this.name = name;
        this.unitPrice = unitPrice;
        this.detail = detail;
    }




}
