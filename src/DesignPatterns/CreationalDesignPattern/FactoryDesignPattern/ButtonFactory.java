package DesignPatterns.CreationalDesignPattern.FactoryDesignPattern;

public class ButtonFactory {

    public static Button createButton(String input){
        if(input.trim().equalsIgnoreCase("Windows"))return new WindowsButton();
        return new HTMLButton();
    }
}
