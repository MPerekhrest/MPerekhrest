package views;


import models.Product;
import utils.Validator;

import java.util.Scanner;

// View
public class SalesView {


    String title;
    String name;
    int quantity;
    double price;
    Scanner scanner;

    Product model;


    public SalesView(Product model) {
        this.model = model;
    }
    // Здесь, создайте конструктор данного класса,
    // который в параметре содержит переменную типа модели.
    public void getInputs() {

        scanner = new Scanner(System.in);

        title = "Введите наименование товара: ";
        System.out.println(title);
        name =  Validator.validateName(scanner);
        model.setName(name);

        // Здесь, реализуйте вывод сообщения о необходимсоти
        // ввода соответствующего значения, валидацью значения
        // через валидатор, установку валидного значения через модель.


        title = "Введите количество: ";
        System.out.println(title);
       quantity = Validator.validateQuantityInput(scanner);
       model.setQuantity(quantity);
        // Здесь, реализуйте вывод сообщения о необходимсоти
        // ввода соответствующего значения, валидацью значения
        // через валидатор, установку валидного значения через модель.

        title = "Введите цену: ";
        System.out.println(title);
        price = Validator.validatePriceInput(scanner);
        model.setPrice(price);
        // Здесь, реализуйте вывод сообщения о необходимсоти
        // ввода соответствующего значения, валидацью значения
        // через валидатор, установку валидного значения через модель.

        scanner.close();
    }

    public void getOutput(String output) {
        System.out.println(output);
    }
}
