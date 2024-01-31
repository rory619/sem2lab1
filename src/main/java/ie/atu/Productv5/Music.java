package ie.atu.Productv5;

// import ie.atu.productv3.Product;

import java.text.NumberFormat;

public class Music extends Product {



    private String Artist;

    private String Label;


    public String getArtist() {
        return Artist;
    }

    public void setArtist(String artist) {
        Artist = artist;
    }

    public String getLabel() {
        return Label;
    }

    public void setLabel(String label) {
        Label = label;
    }

    public String toString() {
        return super.toString() + " by " + Label + Artist;
    }


}