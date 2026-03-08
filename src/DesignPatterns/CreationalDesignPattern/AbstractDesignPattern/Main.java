package DesignPatterns.CreationalDesignPattern.AbstractDesignPattern;

public class Main {
    public static void main(String[] args) {
        GUIFactory guiFactory = new MacFactory();
        guiFactory.createCheckbox().onBox();
        guiFactory.createButton().onClick();
    }
}
