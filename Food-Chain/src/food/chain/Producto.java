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
public class Producto extends Produccion {
    private Farmer Mat_Primas;
    private Manufacturer Manufacturer;
    private Dist_Center Distributor;
    private Retail Retail;
    private String Exit_Date_Farm;
    private String Exit_Date_Manu;
    private String Exit_Date_Retai;
    private String Exit_Date_Dist;
    private String Production_Date_Farm;
    private String Production_Date_Manu;
    private String Production_Date_Retai;
    private String Production_Date_Dist;

    public Producto(Farmer Mat_Primas, String Production_Date, String Exit_Date, String Productor, String Receptor, String Name) {
        super(Production_Date, Exit_Date, Productor, Receptor, Name);
        this.Mat_Primas = Mat_Primas;
    }
    public Farmer getMat_Primas() {
        return Mat_Primas;
    }

    public String getExit_Date_Farm() {
        return Exit_Date_Farm;
    }

    public String getExit_Date_Manu() {
        return Exit_Date_Manu;
    }

    public String getExit_Date_Retai() {
        return Exit_Date_Retai;
    }

    public String getExit_Date_Dist() {
        return Exit_Date_Dist;
    }

    public String getProduction_Date_Farm() {
        return Production_Date_Farm;
    }

    public String getProduction_Date_Manu() {
        return Production_Date_Manu;
    }

    public String getProduction_Date_Retai() {
        return Production_Date_Retai;
    }

    public String getProduction_Date_Dist() {
        return Production_Date_Dist;
    }

    public String getProduction_Date() {
        return Production_Date;
    }

    public String getExit_Date() {
        return Exit_Date;
    }

    public String getProductor() {
        return Productor;
    }

    public String getReceptor() {
        return Receptor;
    }

    public String getName() {
        return Name;
    }

    public void setExit_Date_Farm(String Exit_Date_Farm) {
        this.Exit_Date_Farm = Exit_Date_Farm;
    }

    public void setExit_Date_Manu(String Exit_Date_Manu) {
        this.Exit_Date_Manu = Exit_Date_Manu;
    }

    public void setExit_Date_Retai(String Exit_Date_Retai) {
        this.Exit_Date_Retai = Exit_Date_Retai;
    }

    public void setExit_Date_Dist(String Exit_Date_Dist) {
        this.Exit_Date_Dist = Exit_Date_Dist;
    }

    public void setProduction_Date_Farm(String Production_Date_Farm) {
        this.Production_Date_Farm = Production_Date_Farm;
    }

    public void setProduction_Date_Manu(String Production_Date_Manu) {
        this.Production_Date_Manu = Production_Date_Manu;
    }

    public void setProduction_Date_Retai(String Production_Date_Retai) {
        this.Production_Date_Retai = Production_Date_Retai;
    }

    public void setProduction_Date_Dist(String Production_Date_Dist) {
        this.Production_Date_Dist = Production_Date_Dist;
    }

    public void setProduction_Date(String Production_Date) {
        this.Production_Date = Production_Date;
    }

    public void setExit_Date(String Exit_Date) {
        this.Exit_Date = Exit_Date;
    }

    public void setProductor(String Productor) {
        this.Productor = Productor;
    }

    public void setReceptor(String Receptor) {
        this.Receptor = Receptor;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setMat_Primas(Farmer Mat_Primas) {
        this.Mat_Primas = Mat_Primas;
    }
    
}
