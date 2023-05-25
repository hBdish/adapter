package com.example.adapter;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController {

    @FXML
    public ListView listItems;
    @FXML
    public TextField input;

    Adaptor adaptor = new Adaptor(new OrdArray(10));

    public void addValue(ActionEvent event) {
        adaptor.insert(Long.valueOf(input.getText()));
        draw();
    }

    public void draw() {
        listItems.getItems().addAll(adaptor.display());
    }

    public void delete(ActionEvent event) {
        adaptor.delete(Long.valueOf(input.getText()));
        draw();
    }

    public void find(ActionEvent event) {
        int x = adaptor.find(Long.valueOf(input.getText()));
        input.setText(String.valueOf(x));
    }
}
