package com.jpv.pins_app.data;

import com.squareup.moshi.FromJson;
import com.squareup.moshi.Json;

import java.util.List;

public class PinsWrapper {

    private List<Pins> pins = null;

    public List<Pins> getPins() {
        return pins;
    }
}
