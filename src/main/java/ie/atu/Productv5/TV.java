package ie.atu.Productv5;

// import ie.atu.productv3.Product;

import java.text.NumberFormat;

public class TV extends Product {


    private String ScreenSize;

    private String Manufacture;


    public String getScreenSize() {
        return ScreenSize;
    }

    public void setScreenSize(String screenSize) {
        ScreenSize = screenSize;
    }

    public String getManufacture() {
        return Manufacture;
    }

    public void setManufacture(String manufacture) {
        Manufacture = manufacture;
    }

    public String toString() {
        return super.toString() + " by " + Manufacture + ScreenSize;
    }


}
