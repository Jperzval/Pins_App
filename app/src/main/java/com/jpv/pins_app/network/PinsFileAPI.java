package com.jpv.pins_app.network;

import com.jpv.pins_app.data.Pins;

import java.util.List;

import io.reactivex.rxjava3.core.Observable;
import retrofit2.http.GET;

public interface PinsFileAPI {

    @GET("Jperzval/Pins_App/dev-jess/app/src/main/res/raw/nyc_ttp_pins.json")
    Observable<List<Pins>> getPins();
}
