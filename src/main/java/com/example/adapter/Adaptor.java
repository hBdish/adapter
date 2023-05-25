package com.example.adapter;

import javafx.scene.control.Alert;

import java.io.IOException;

public class Adaptor implements Adaptee{
    private OrdArray ordArray;
    public Adaptor(OrdArray Arr)
    {
        ordArray = Arr;
    }

    @Override
    public String display() {
        return ordArray.display();
    }

    @Override
    public void insert(Object E) {
        ordArray.insert((Long) E);
    }

    @Override
    public void delete(Object E) {
        ordArray.delete((Long) E);

    }

    @Override
    public int find(Object E) {
        return ordArray.find((Long) E);

    }
}
