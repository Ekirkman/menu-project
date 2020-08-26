package restraurant;

import java.awt.*;
import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private ArrayList<MenuItem> listOfDishes;
    private Date lastUpdated;


    public Menu() {
        this.listOfDishes = new ArrayList<MenuItem>();
        this.lastUpdated = new Date();

    }



}