package com.jpv.pins_app.data;

public class Pins {

    private Board board;
    private String id;
    private PinImages images;

    public Pins(Board board, String id, PinImages images) {
        this.board = board;
        this.id = id;
        this.images = images;
    }

    public Board getBoard() {
        return board;
    }

    public String getId() {
        return id;
    }

    public PinImages getImages() {
        return images;
    }
}
