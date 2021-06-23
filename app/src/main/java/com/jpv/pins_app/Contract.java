package com.jpv.pins_app;

public interface Contract {

    interface PinView{
        void showPins();
        void showError();
    }

    interface PinPresenter{
        void getPins();
    }
}
