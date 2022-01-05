package com.solvd.pattern.facade;

public class Button extends WindowElement {

    private String text;
    private Action action;

    public Button(int startPositionX, int startPositionY, int width, int height, String buttonText) {
        super(startPositionX, startPositionY, width, height);
        this.text = buttonText;
    }

    @Override
    public void draw() {
        System.out.println("Drawing button.");
    }

    @Override
    public void clear() {
        System.out.println("Clearing button.");
    }

    public void setOnClick(Action action) {
        //lambda
        this.action = action;
    }

    public void click() {
        this.action.doSmth();
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

}
