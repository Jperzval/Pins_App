package com.jpv.pins_app.ui;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.jpv.pins_app.Contract;
import com.jpv.pins_app.R;
import com.jpv.pins_app.data.Pins;
import com.jpv.pins_app.network.PinsFileAPI;
import com.jpv.pins_app.network.PinsRetrofit;
import com.jpv.pins_app.presenter.PinPresenter;

import java.util.List;

public class MainActivity extends AppCompatActivity implements Contract.PinView {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PinsFileAPI api = PinsRetrofit.getRetrofitInstance()
                .create(PinsFileAPI.class);
        Contract.PinPresenter presenter = new PinPresenter(this, api);
        presenter.getPinCall();
    }

    @Override
    public void showPins(List<Pins> pinsList) {
        RecyclerView recyclerView = findViewById(R.id.pins_recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(new PinsAdapter(pinsList));
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
    }

    @Override
    public void showError() {
        Toast.makeText(this, "Oops!...Something went wrong.", Toast.LENGTH_SHORT).show();
    }
}