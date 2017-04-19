package Ion_Task_2_CIA.Task_1.Service;

import Ion_Task_2_CIA.Task_1.Model.Country;
import Ion_Task_2_CIA.Task_1.Model.CountrySupport;
import Ion_Task_2_CIA.Task_1.Model.Status;

/**
 * Created by pgroza on 3/20/2017.
 */
public abstract class Product {

    private Country deliverToCountry;
    private int count;
    private double price;
    private double weight;
    private double deliveryPrice;
    private Status status = Status.NEW;

    public Product(Country deliverToCountry, int count, double price, double
            weight,
     double deliveryPrice) {
        this.deliverToCountry = deliverToCountry;
        this.count = count;
        this.price = price;
        this.weight = weight;
        this.deliveryPrice = deliveryPrice;
    }

    public void setDeliverToCountry(Country deliverToCountry) {
        this.deliverToCountry = deliverToCountry;
    }
    public Country getDeliverToCountry() {
        return deliverToCountry;
    }

    public void setCount(int count) {
        this.count = count;
    }
    public int getCount() {
        return count;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public double getPrice() {
        return price;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    public double getWeight() {
        return weight;
    }

    public void setDeliveryPrice(double deliveryPrice) {
        this.deliveryPrice = deliveryPrice;
    }
    public double getDeliveryPrice() {
        return deliveryPrice;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
    public Status getStatus() {
        return status;
    }

    public boolean isDeliverable(){
        if(new CountrySupport().getSupported().contains(getDeliverToCountry()
        )) {
            return true;
        } else {
            return false;
        }
    }
}
