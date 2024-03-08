package controllers;

import models.Product;
import views.SalesView;

import static utils.Rounder.round;


public class ProductController {

    Product model;
    SalesView view;


    public ProductController(Product model, SalesView view) {
        this.model = model;
        this.view = view;
    }

    public void runApp() {

        view.getInputs();
        String name = model.getName();
        double totalIncome = model.calculate();
        double totalIncomes = round(totalIncome);
        double tax = model.calculateTax(totalIncome);
        double taxes = round(tax);
        double netIncome = model.calculate(totalIncome, tax);
        double netIncomes = round(netIncome);


        String output = String.format("Name product: %s\n" +
                        "Total income(UAH): %.2f\n" +
                        "Tax amount(UAH): %.2f\n" +
                        "Net income(UAH): %.2f\n",
                name, totalIncomes, taxes, netIncomes);

        view.getOutput(output);
    }
}
