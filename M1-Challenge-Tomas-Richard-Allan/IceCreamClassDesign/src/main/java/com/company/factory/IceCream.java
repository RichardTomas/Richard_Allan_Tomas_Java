package com.company.factory;

public class IceCream {
    private String flavor;

    private int numberOfFlavors = 10;
    private double salePrice;
    private double productionCost;
    private int productionTime;
    private String[] ingredients;

    public IceCream(String flavor, int numberOfFlavors, double salePrice, double productionCost, int productionTime, String[] ingredients) {
        this.flavor = flavor;
        this.numberOfFlavors = numberOfFlavors;
        this.salePrice = salePrice;
        this.productionCost = productionCost;
        this.productionTime = productionTime;
        this.ingredients = ingredients;
    }


    public double totalProfit(){
        double profit = salePrice - productionCost;
        return profit;
    }

    public int productionTimePerFlavor(){
        int timePerFlavor = productionTime / numberOfFlavors;
        return timePerFlavor;
    }

    public double aveProfitPerFlavor(){
        double profitPerFlavor = totalProfit() / numberOfFlavors;
        return profitPerFlavor;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }

    public double getProductionCost() {
        return productionCost;
    }

    public void setProductionCost(double productionCost) {
        this.productionCost = productionCost;
    }

    public int getProductionTime() {
        return productionTime;
    }

    public void setProductionTime(int productionTime) {
        this.productionTime = productionTime;
    }

    public String[] getIngredients() {
        return ingredients;
    }

    public void setIngredients(String[] ingredients) {
        this.ingredients = ingredients;
    }
}


