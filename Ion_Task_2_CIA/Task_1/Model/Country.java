package Ion_Task_2_CIA.Task_1.Model;

/**
 * Created by pgroza on 3/20/2017.
 */
public class Country {

    private String name;
    private int taxFee;

    public Country(String name) {
        this.name = name;
        this.taxFee = 60;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setTaxFee(int taxFee) {
        this.taxFee = taxFee;
    }
    public int getTaxFee() {
        return taxFee;
    }

}
