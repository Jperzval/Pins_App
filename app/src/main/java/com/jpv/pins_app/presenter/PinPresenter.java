package com.jpv.pins_app.presenter;

import android.media.Image;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.jpv.pins_app.Contract;
import com.jpv.pins_app.data.Board;
import com.jpv.pins_app.data.PinImages;
import com.jpv.pins_app.data.Pins;
import com.jpv.pins_app.data.PinsJSONConverter;
import com.jpv.pins_app.data.PinsWrapper;
import com.jpv.pins_app.data.WrapperWrapper;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.JsonAdapter;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.CharArrayWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import retrofit2.converter.gson.GsonConverterFactory;

public class PinPresenter implements Contract.PinPresenter {

    private final Contract.PinView pinView;

    public PinPresenter(Contract.PinView pinView) {
        this.pinView = pinView;
    }

    @Override
    public void getPins(InputStream inputStream) {

    }



}

