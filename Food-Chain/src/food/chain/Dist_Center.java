/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package food.chain;

import java.util.ArrayList;

/**
 *
 * @author juamayas
 */
public class Dist_Center {
    private ArrayList<Manufacturer> Manufacturer;
    private ArrayList<Retail> retail;

    public Dist_Center(ArrayList<Manufacturer> Manufacturer, ArrayList<Retail> retail) {
        this.Manufacturer = Manufacturer;
        this.retail = retail;
    }

    public ArrayList<Manufacturer> getManufacturer() {
        return Manufacturer;
    }

    public ArrayList<Retail> getRetail() {
        return retail;
    }

    public void setManufacturer(ArrayList<Manufacturer> Manufacturer) {
        this.Manufacturer = Manufacturer;
    }

    public void setRetail(ArrayList<Retail> retail) {
        this.retail = retail;
    }
}
