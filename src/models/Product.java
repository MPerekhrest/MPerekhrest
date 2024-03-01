package models;


import base.Fiscal;
import base.Income;

// Model.
// Примените интерфейсы Income, Fiscal, переопределите их методы.
public class Product implements Income, Fiscal {

    // Объявление полей модели
    private String name;


    private int quantity;
    private double price;
    // Налоговоу ставку объявите в виде константы
    // здесь ...
    double taxRate = 0.05;



    // Обеспечьте доступ к полям модели через getters и setters
    // здесь ...

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

    // Переопределите методы реализуемых интерфейсов.

    // Расчёт дохода от продаж, до уплаты налога.
    // здесь ...

    // Расчёт суммы налога с продаж.
    // здесь ...

    // Расчёт чистого дохода, после уплаты налога.
    // здесь ...
}
