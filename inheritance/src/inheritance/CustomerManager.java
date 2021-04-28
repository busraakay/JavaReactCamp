package inheritance;

public class CustomerManager {

    // polymorphism
    public void add(Customer customer) {
        System.out.println(customer.customerNumber + "kaydedildi.");
    }

    public void addMultiple(Customer[] customers){
        for(Customer customer : customers){
            add(customer);
        }
    }

}

//SOLID - Open Closed Principle
