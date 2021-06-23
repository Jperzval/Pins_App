package com.jpv.pins_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.jpv.pins_app.data.Pins;
import com.jpv.pins_app.presenter.PinPresenter;

import java.util.List;

public class MainActivity extends AppCompatActivity implements Contract.PinView {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Contract.PinPresenter presenter = new PinPresenter(this);

    }

    @Override
    public void showPins(List<Pins> pinsList) {

    }

    @Override
    public void showError() {

    }
}