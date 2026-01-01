package com.shopbilling.controller;

import com.shopbilling.model.Customer;
import javafx.stage.Stage;

public class CustomerDashboardController {
    private Stage stage;
    private Customer customer;

    public void setStage(Stage stage) { this.stage = stage; }
    public void setCustomer(Customer customer) { this.customer = customer; }
}
