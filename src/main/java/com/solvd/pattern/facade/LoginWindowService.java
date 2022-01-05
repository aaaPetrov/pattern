package com.solvd.pattern.facade;

public class LoginWindowService {

    private Window loginWindow;
    private Button closeWindowButton;
    private Button fullScreenButton;
    private Button rollUpButton;
    private TextBox loginTextBox;
    private TextBox passwordTextBox;
    private Button loginButton;

    public LoginWindowService() {
        this.loginWindow = new Window(500, 500, 1000, 1000);
        this.closeWindowButton = new Button(1480, 1480, 20, 20, "X");
        this.closeWindowButton.setOnClick(() -> loginWindow.close());
        this.fullScreenButton = new Button(1460, 1480, 20, 20, "O");
        this.fullScreenButton.setOnClick(() -> System.out.println("Full screen window."));
        this.rollUpButton = new Button(1440, 1480, 20, 20, "_");
        this.rollUpButton.setOnClick(() -> System.out.println("Roll up window."));

        this.loginTextBox = new TextBox(850, 710, 300, 40);
        this.passwordTextBox = new TextBox(850, 650, 300, 40);
        this.loginButton = new Button(950, 590, 100, 40, "Login");
        this.loginButton.setOnClick(() -> System.out.println("Login if data is correct."));

        this.loginWindow.addWindowElement(closeWindowButton);
        this.loginWindow.addWindowElement(fullScreenButton);
        this.loginWindow.addWindowElement(rollUpButton);
        this.loginWindow.addWindowElement(loginTextBox);
        this.loginWindow.addWindowElement(passwordTextBox);
        this.loginWindow.addWindowElement(loginButton);

        this.loginWindow.drawWindow();
    }

}
