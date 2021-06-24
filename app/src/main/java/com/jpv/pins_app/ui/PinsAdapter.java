package com.jpv.pins_app.ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.jpv.pins_app.R;
import com.jpv.pins_app.data.Pins;

import org.jetbrains.annotations.NotNull;

import java.util.List;

class PinsAdapter extends RecyclerView.Adapter<PinViewHolder> {

    private final List<Pins> pinsList;

    public PinsAdapter(List<Pins> pinsList) {
        this.pinsList = pinsList;
    }

    @NotNull
    @Override
    public PinViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.itemview_pins, parent, false);
        return new PinViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PinViewHolder holder, int position) {
        holder.onBind(pinsList.get(position));
        if ((position >= getItemCount() - 1)){
            load();
    }
    }


    public void load() {

    }

    @Override
    public int getItemCount() {
        return pinsList.size();
    }
}
