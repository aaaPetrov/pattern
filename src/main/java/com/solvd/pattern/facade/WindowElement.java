package com.solvd.pattern.facade;

public abstract class WindowElement {

    private int startPositionX;
    private int startPositionY;
    private int width;
    private int height;

    public WindowElement(int startPositionX, int startPositionY, int width, int height) {
        this.startPositionX = startPositionX;
        this.startPositionY = startPositionY;
        this.width = width;
        this.height = height;
    }

    public abstract void draw();

    public abstract void clear();

    public int getStartPositionX() {
        return startPositionX;
    }

    public void setStartPositionX(int startPositionX) {
        this.startPositionX = startPositionX;
    }

    public int getStartPositionY() {
        return startPositionY;
    }

    public void setStartPositionY(int startPositionY) {
        this.startPositionY = startPositionY;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
