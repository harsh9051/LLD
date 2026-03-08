package DesignPatterns.CreationalDesignPattern.FactoryDesignPattern;

public abstract class ButtonFactory {

    public Button createButton(){
        return createButtonClass();
    }

    protected abstract Button createButtonClass();

}
