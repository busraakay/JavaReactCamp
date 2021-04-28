package oopIntro;

public class Product {

    // encapsulation
    private int id;
    private String name;
    private double unitPrice;  //Birim fiyati
    private String detail;
    private double discount;

    public Product(){

    }

    public Product(int id, String name, double unitPrice, String detail, double discount){
        super();  // Parametresiz olanı da çalıştırır.
        this.setId(id);
        this.setName(name);
        this.setUnitPrice(unitPrice);
        this.setDetail(detail);
        this.setDiscount(discount);
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getUnitPriceAfterDiscount() {
        return this.unitPrice - (this.unitPrice * this.discount / 100);
    }


}
