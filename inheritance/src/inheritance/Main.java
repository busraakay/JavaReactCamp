package inheritance;

public class Main {
    public static void main(String[] args){
        IndividualCustomer busra = new IndividualCustomer();
        busra.id  = 1;
        busra.customerNumber = "1213";
        busra.firstName = "Büşra";
        busra.lastName = "Akay";

        CorporateCustomer hepsiBurada = new CorporateCustomer();
        hepsiBurada.customerNumber = "78946";

        SyndicateCustomer syndicateCustomer = new SyndicateCustomer();
        syndicateCustomer.customerNumber = "45424624";

        CustomerManager customerManager = new CustomerManager();

        Customer[] customers = {busra, hepsiBurada, syndicateCustomer};

        customerManager.addMultiple(customers);
    }
}
