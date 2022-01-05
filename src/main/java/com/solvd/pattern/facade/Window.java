package com.solvd.pattern.facade;

import java.util.ArrayList;
import java.util.List;

public class Window {

    private int startPositionX;
    private int startPositionY;
    private int width;
    private int height;
    private List<WindowElement> windowElements;

    public Window(int startPositionX, int startPositionY, int width, int height) {
        this.startPositionX = startPositionX;
        this.startPositionY = startPositionY;
        this.width = width;
        this.height = height;
        this.windowElements = new ArrayList<>();
    }

    public void drawWindow() {
        //action with startPositionX, startPositionY, width, height
        System.out.println("Drawing window.");
        //then drawing elements on window
        windowElements.forEach(windowElement -> windowElement.draw());
    }

    private void clearWindow() {
        System.out.println("Clearing window.");
    }

    public void close() {
        this.windowElements.forEach(windowElement -> windowElement.clear());
        clearWindow();
    }

    public void addWindowElement(WindowElement windowElement) {
        if (this.startPositionX <= windowElement.getStartPositionX()
                && (this.startPositionX + width) >= (windowElement.getStartPositionX() + windowElement.getWidth())
                && this.startPositionY <= windowElement.getStartPositionY()
                && (this.startPositionY + height) >= (windowElement.getStartPositionY() + windowElement.getHeight())) {
            windowElements.add(windowElement);
        }
    }

}
