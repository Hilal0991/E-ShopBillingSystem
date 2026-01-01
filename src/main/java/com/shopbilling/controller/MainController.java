package com.shopbilling.controller;

import com.shopbilling.model.User;
import javafx.stage.Stage;

public class MainController {
    private Stage stage;
    private User currentUser;

    public void setStage(Stage stage) { this.stage = stage; }
    public void setCurrentUser(User user) { this.currentUser = user; }
}
