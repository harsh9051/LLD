package DesignPatterns.CreationalDesignPattern.FactoryDesignPattern;

public class HTMLButtonFactory extends ButtonFactory{
    @Override
    protected Button createButtonClass() {
        return new HTMLButton();
    }
}
