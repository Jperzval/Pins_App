package com.jpv.pins_app.data;

import com.google.gson.annotations.SerializedName;

public class PinImages {

    @SerializedName("136x136")
    private Width136 width136;
    @SerializedName("236x")
    private Width236 width236;
    @SerializedName("474x")
    private Width474 width474;
    @SerializedName("736x")
    private Width736 width736;
    private WidthOrig orig;

    public Width136 getWidth136() {
        return width136;
    }

    public Width236 getWidth236() {
        return width236;
    }

    public Width474 getWidth474() {
        return width474;
    }

    public Width736 getWidth736() {
        return width736;
    }

    public WidthOrig getOrig() {
        return orig;
    }
}
