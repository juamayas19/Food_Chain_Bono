/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package food.chain;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author juamayas
 */
public class FoodChain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Farmer> Farmers=new ArrayList();
        ArrayList<Manufacturer> Manufacturers=new ArrayList();
        ArrayList <Dist_Center> Dist_Centers=new ArrayList();
        ArrayList <Retail> Retails=new ArrayList();

        leerCultivo(Farmers.get(0));
        
    }
    public static ArrayList<Producto> leerProducto(ArrayList<Farmer> Farmers) throws FileNotFoundException {
        ArrayList<Producto> productos = new ArrayList();
        Scanner in= new Scanner(new File("Productos.txt"));
        in.useDelimiter(";");
        String Production_Date=null;
        String Exit_Date=null;
        String Productor=null;
        String Receptor=null;
        String Name=null;
        while (in.hasNextLine()){
            in.nextLine();
        if (in.hasNext()){
            in.next();
            Production_Date = in.next();
            Exit_Date= in.next();
            Productor = in.next();
            Receptor= in.next();
            Name = in.next();
            
        }
            for (int i = 0; i < Farmers.size(); i++) {
                if(Productor.equals(Farmers.get(i).getName())){
                    productos.add(new Producto(Farmers.get(i), Production_Date,Exit_Date,Productor,Receptor,Name));
            }
            }
        
        }
        return productos;
    }
    public  static ArrayList<Cultivo> leerCultivo(Farmer Farm) throws FileNotFoundException {
        ArrayList<Cultivo> cultivos = new ArrayList();
        Scanner in= new Scanner(new File("src/Data/Cultivos.txt"));
        in.useDelimiter(";");
        String Production_Date=null;
        String Exit_Date=null;
        String Productor=null;
        String Receptor=null;
        String Name=null;
        while (in.hasNextLine()){
            in.nextLine();
            
         if(in.hasNext()){
             in.next();
            Production_Date=in.next();
            Exit_Date=in.next();
            Productor=in.next();
            Receptor=in.next();
            Name=in.next();
        }
        cultivos.add(new Cultivo(Production_Date,Exit_Date,Productor,Receptor,Name)); 
        }
        in.close();
        return  cultivos;
    }
}
