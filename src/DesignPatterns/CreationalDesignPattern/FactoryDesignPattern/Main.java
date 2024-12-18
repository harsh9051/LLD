package DesignPatterns.CreationalDesignPattern.FactoryDesignPattern;

public class Main {

    public static void main(String arge[]){

        Button button = ButtonFactory.createButton("Windows");
        button.onClick();

    }
}
