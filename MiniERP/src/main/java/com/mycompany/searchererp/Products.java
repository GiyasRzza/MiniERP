
package com.mycompany.searchererp;

import com.mysql.cj.util.DnsSrv;

public class Products {
    private int prId;
    private String prName;
    private double prPrice;
    private String prCategory;
    private String addedUser;

    public String getAddedUser() {
        return addedUser;
    }

    public void setAddedUser(String addedUser) {
        this.addedUser = addedUser;
    }

    public Products(int prId, String prName, double prPrice, String prCategory) {
        this.prId = prId;
        this.prName = prName;
        this.prPrice = prPrice;
        this.prCategory = prCategory;
    }
    
    
    public int getPrId() {
        return prId;
    }

    public void setPrId(int prId) {
        this.prId = prId;
    }

    public String getPrName() {
        return prName;
    }

    public void setPrName(String prName) {
        this.prName = prName;
    }

    public double getPrPrice() {
        return prPrice;
    }

    public void setPrPrice(double prPrice) {
        this.prPrice = prPrice;
    }

    public String getPrCategory() {
        return prCategory;
    }

    public void setPrCategory(String prCategory) {
        this.prCategory = prCategory;
    }
    
    
    
}
