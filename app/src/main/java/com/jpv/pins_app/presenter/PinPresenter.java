package com.jpv.pins_app.presenter;

import com.jpv.pins_app.Contract;

import java.io.InputStream;

public class PinPresenter implements Contract.PinPresenter {

    private final Contract.PinView pinView;

    public PinPresenter(Contract.PinView pinView) {
        this.pinView = pinView;
    }

    @Override
    public void getPins(InputStream inputStream) {

    }



}

