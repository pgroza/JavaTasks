package Ion_Task_2_CIA.Task_1.Model;

import java.util.ArrayList;
import Ion_Task_2_CIA.Task_1.Service.*;


/**
 * Created by pgroza on 3/20/2017.
 */
public class ProductCatalog {

    public ArrayList<ProductionProduct> defaultListOfProducts() {
        ArrayList<ProductionProduct> productList = new
                ArrayList<>();

        productList.add(new Food(new Country("Romania"), 5, 25.698, 2.3,
                3.670));
        productList.add(new Toys(new Country("Germany"), 2, 15.345, 0.5,
                4.250));
        productList.add(new Furniture(new Country("France"), 10, 30.267, 3.2,
                5.200));

        productList.add(new Food(new Country("Japan"), 10, 50.725, 5.1,
                10.690));
        productList.add(new Toys(new Country("Singapore"), 5, 23.450, 1.6,
                6.730));
        productList.add(new Furniture(new Country("China"), 20, 70.560, 10.6,
                9.400));

        return productList;
    }

    public void displayCatalog() {
        ArrayList<ProductionProduct> showList = new
                ArrayList<>(defaultListOfProducts());

        for (int counter = 0; counter < showList.size(); counter++) {
            showList.get(counter).printInfo();
            System.out.println("\n");

        }
    }

    /*
     * It would be nice to implement a UserInput
     * case for a more realistic life approach.
     *
     * Also validation for each field will be required.
     */

    /*public static void userAddsProduct() {

        CountrySupport newCountrySupport = new CountrySupport();
        Country newName = new Country();


        Scanner user_input = new Scanner(System.in);

        System.out.print("Deliver to:\t" + newCountrySupport.setSupported(
                Country.setName(user_input.nextLine())));
    }*/
}
