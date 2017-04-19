package Ion_Task_2_CIA.Task_1.Model;

import Ion_Task_2_CIA.Task_1.Service.Product;
import Ion_Task_2_CIA.Task_1.Service.ProductionProduct;

/**
 * Created by pgroza on 3/20/2017.
 */
public class Toys extends Product implements ProductionProduct {

    private final String productType = "TOYS";

    Toys(Country deliverToCountry,int count, double price, double weight,
         double deliveryPrice) {
        super(deliverToCountry, count, price, weight, deliveryPrice);
    }

    public void printInfo() {
        System.out.println(productType);
        System.out.print("Product Price: " + getPrice() + " >> ");
        System.out.print("Delivery Price: " + getDeliveryPrice() + " >> ");
        System.out.print("Count: " + getCount() + " >> ");
        System.out.print("Weight: " + getWeight() + " >> ");
        System.out.print("Deliver to: " + getDeliverToCountry().getName() + " >> ");
        System.out.print("Status: " + getStatus() + " >> ");
        System.out.print("Supported: " + isDeliverable());
    }
}
