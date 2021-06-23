package com.jpv.pins_app.data;

import com.squareup.moshi.FromJson;
import com.squareup.moshi.Json;

public class Board {

    private String name;

    public Board(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
