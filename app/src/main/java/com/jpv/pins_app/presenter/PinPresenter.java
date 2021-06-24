package com.jpv.pins_app.presenter;

import android.util.Log;

import com.jpv.pins_app.Contract;
import com.jpv.pins_app.data.Pins;
import com.jpv.pins_app.network.PinsFileAPI;
import com.jpv.pins_app.network.PinsRetrofit;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.schedulers.Schedulers;


public class PinPresenter implements Contract.PinPresenter {

    private final Contract.PinView pinView;
    private final PinsFileAPI fileAPI;

    public PinPresenter(Contract.PinView pinView, PinsFileAPI fileAPI) {
        this.pinView = pinView;
        this.fileAPI = fileAPI;
    }

    @Override
    public void getPinCall() {
        PinsRetrofit.getRetrofitInstance()
                .create(PinsFileAPI.class)
                .getPins()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(response -> {
                            viewResponse(response);
                            Log.d("PinResponse:  ", "getPins: " + response.get(0).getBoard().getName());
                        },
                        throwable -> pinView.showError());
    }

    private void viewResponse(List<Pins> response) {
        List<Pins> list = new ArrayList<>(response);
        final boolean success = !list.isEmpty();
        if (success) {
            pinView.showPins(response);
        } else {
            pinView.showError();
        }
    }
}

