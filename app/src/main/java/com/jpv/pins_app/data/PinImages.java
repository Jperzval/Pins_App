package com.jpv.pins_app.data;

import com.google.gson.annotations.SerializedName;

public class PinImages {

    @SerializedName("136x136")
    private String width136;
    @SerializedName("236x")
    private String width236;
    @SerializedName("474x")
    private String width474;
    @SerializedName("736x")
    private String width736;
    private String orig;

    public String getWidth136() {
        return width136;
    }

    public String getWidth236() {
        return width236;
    }

    public String getWidth474() {
        return width474;
    }

    public String getWidth736() {
        return width736;
    }

    public String getOrig() {
        return orig;
    }
}
