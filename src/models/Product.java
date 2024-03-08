package models;

import base.Fiscal;
import base.Income;

public class Product implements Income, Fiscal {

    double taxRate = 0.05;
    private String name;
    private int quantity;
    private double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public double calculateTax(double bruIncome) {

        return bruIncome * taxRate;
    }

    @Override
    public double calculate() {
        return quantity * price;
    }

    @Override
    public double calculate(double bruIncome, double tax) {
        return bruIncome - tax;
    }


}
