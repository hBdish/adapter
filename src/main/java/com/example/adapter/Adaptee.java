package com.example.adapter;

import java.util.ArrayList;
import java.util.Objects;

public interface Adaptee<T> {
    String display();
    void insert(T E);
    void delete (T E);
    int find (T E);
}
