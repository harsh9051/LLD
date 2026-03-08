package DesignPatterns.CreationalDesignPattern.FactoryDesignPattern;

public class WindowsButtonFactory extends ButtonFactory{
    @Override
    protected Button createButtonClass() {
        return new WindowsButton();
    }
}
