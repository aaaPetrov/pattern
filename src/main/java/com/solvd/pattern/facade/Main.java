package com.solvd.pattern.facade;

/**
 * Да вообще абсолютно где угодно можно это использовать.
 * Абсолютно везде, где нужно спрятать повторяющиеся множество раз блоки кода в более лаконичную визуально конструкцию.
 */
public class Main {

    public static void main(String[] args) {
        //Without pattern
        Window loginWindow = new Window(500, 500, 1000, 1000);
        Button closeWindowButton = new Button(1480, 1480, 20, 20, "X");
        closeWindowButton.setOnClick(() -> loginWindow.close());
        Button fullScreenButton = new Button(1460, 1480, 20, 20, "O");
        fullScreenButton.setOnClick(() -> System.out.println("Full screen window."));
        Button rollUpButton = new Button(1440, 1480, 20, 20, "_");
        rollUpButton.setOnClick(() -> System.out.println("Roll up window."));

        TextBox loginTextBox = new TextBox(850, 710, 300, 40);
        TextBox passwordTextBox = new TextBox(850, 650, 300, 40);
        Button loginButton = new Button(950, 590, 100, 40, "Login");
        loginButton.setOnClick(() -> System.out.println("Login if data is correct."));

        loginWindow.addWindowElement(closeWindowButton);
        loginWindow.addWindowElement(fullScreenButton);
        loginWindow.addWindowElement(rollUpButton);
        loginWindow.addWindowElement(loginTextBox);
        loginWindow.addWindowElement(passwordTextBox);
        loginWindow.addWindowElement(loginButton);

        loginWindow.drawWindow();

        System.out.println("\n============================================\n");

        //With pattern
        LoginWindowService loginWindowService = new LoginWindowService();
    }

}
