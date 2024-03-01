package controllers;

import models.Product;
import views.SalesView;

import static utils.Rounder.round;

// Controller
public class ProductController {

    Product model;
    SalesView view;

    // Конструктор
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



        // Здесь, реализуйте:
        // 1) получение имени товара через модель;
        
        // 2) вызов методов расчетов доходов и налога;
        // 3) округление расчетных значений;
        // 4) вывод расчетов по заданному формату.

        String output = String.format("Name product: %s\n"+
                "Total income(UAH): %.2f\n" +
                "Tax amount(UAH): %.2f\n" +
                "Net income(UAH): %.2f\n",
                name,totalIncomes, taxes, netIncomes );

        view.getOutput(output);
    }
}
