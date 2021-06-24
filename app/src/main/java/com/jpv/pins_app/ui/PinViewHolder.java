package com.jpv.pins_app.ui;

import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.recyclerview.widget.RecyclerView;

import com.jpv.pins_app.R;
import com.jpv.pins_app.data.Pins;
import com.squareup.picasso.Picasso;

import org.jetbrains.annotations.NotNull;

public class PinViewHolder extends RecyclerView.ViewHolder {

    private final TextView pinNameView;
    private final ImageView pinView;

    public PinViewHolder(@NonNull @NotNull View itemView) {
        super(itemView);
        pinNameView = itemView.findViewById(R.id.pin_name_view);
        pinView = itemView.findViewById(R.id.pin_image);
    }

    public void onBind(final Pins pins){
        pinNameView.setText(pins.getBoard().getName());
        Picasso.get()
                .load(pins.getImages().getWidth474().getUrl())
                .resize(Integer.parseInt(pins.getImages().getWidth236().getWidth()),
                        Integer.parseInt(pins.getImages().getWidth236().getHeight()))
                .centerCrop()
                .into(pinView);
        itemView.setOnClickListener(view -> {
            String url = pins.getImages().getWidth474().getUrl();
            CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
            CustomTabsIntent customTabsIntent = builder.build();
            customTabsIntent.launchUrl(view.getContext(), Uri.parse(url));
        });
    }
}
