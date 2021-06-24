package com.jpv.pins_app;

import com.jpv.pins_app.data.Pins;

import java.util.List;

public interface Contract {

    interface PinView{
        void showPins(List<Pins> pinsList);
        void showError();
    }

    interface PinPresenter{
        void getPins();
    }
}
