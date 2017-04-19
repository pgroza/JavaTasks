package Ion_Task_2_CIA.Task_1.Model;

import java.util.ArrayList;


/**
 * Created by pgroza on 3/20/2017.
 */
public class CountrySupport {

    private ArrayList<Country> supported;
    private ArrayList<Country> unsupported;

    public CountrySupport() {

        supported = new ArrayList<>();
        unsupported = new ArrayList<>();

        this.supported.add(new Country("Moldova"));
        this.supported.add(new Country("Romania"));
        this.supported.add(new Country("Ukraine"));
        this.supported.add(new Country("Russia"));
        this.supported.add(new Country("Germany"));
        this.supported.add(new Country("France"));
        this.supported.add(new Country("Spain"));
        this.supported.add(new Country("Italy"));
        this.supported.add(new Country("Portugal"));
        this.supported.add(new Country("Great Britain"));

        this.unsupported.add(new Country("United States"));
        this.unsupported.add(new Country("Austria"));
        this.unsupported.add(new Country("Japan"));
        this.unsupported.add(new Country("China"));
        this.unsupported.add(new Country("Korea"));
    }


    public void setSupported(ArrayList<Country> supported) {
        this.supported = supported;
    }
    public ArrayList<Country> getSupported() {
        return supported;
    }

    public void setUnsupported(ArrayList<Country> unsupported) {
        this.unsupported = unsupported;
    }
    public ArrayList<Country> getUnsupported() {
        return unsupported;
    }

}
