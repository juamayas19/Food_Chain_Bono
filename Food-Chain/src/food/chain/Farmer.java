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
public class Farmer extends Eslabon {
    private ArrayList<Cultivo> Cultivos;
    private ArrayList<Manufacturer> Manufacturer;

    public Farmer(ArrayList<Manufacturer> Manufacturer, String Name, String Direction, String Description) {
        super(Name, Direction, Description);
        this.Cultivos = Cultivos;
        this.Manufacturer = Manufacturer;
    }

    public ArrayList<Cultivo> getCultivos() {
        return Cultivos;
    }

    public ArrayList<Manufacturer> getManufacturer() {
        return Manufacturer;
    }

    public void setCultivos(ArrayList<Cultivo> Cultivos) {
        this.Cultivos = Cultivos;
    }
    

    
}
