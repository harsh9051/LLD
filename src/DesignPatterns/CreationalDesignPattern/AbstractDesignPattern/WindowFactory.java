package DesignPatterns.CreationalDesignPattern.AbstractDesignPattern;

public class WindowFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new Winbutton();
    }

    @Override
    public CheckBox createCheckbox() {
        return new WinCheckBox();
    }
}
