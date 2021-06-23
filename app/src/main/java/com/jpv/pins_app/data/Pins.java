package com.jpv.pins_app.data;

import com.squareup.moshi.Json;

public class Pins {


    private String  dominant_color;
    private Board board;
    private PinImages images;

    public Pins(String dominant_color, Board board, PinImages images) {
        this.dominant_color = dominant_color;
        this.board = board;
        this.images = images;
    }

    public String getDominant_color() {
        return dominant_color;
    }

    public Board getBoard() {
        return board;
    }

    public PinImages getImages() {
        return images;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public void setImages(PinImages images) {
        this.images = images;
    }
}
