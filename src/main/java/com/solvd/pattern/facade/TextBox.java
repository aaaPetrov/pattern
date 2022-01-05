package com.solvd.pattern.facade;

public class TextBox extends WindowElement {

    private String text;

    public TextBox(int startPositionX, int startPositionY, int width, int height) {
        super(startPositionX, startPositionY, width, height);
        this.text = "";
    }

    @Override
    public void draw() {
        System.out.println("Drawing textBox.");
    }

    @Override
    public void clear() {
        System.out.println("Clearing textBox.");
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

}
