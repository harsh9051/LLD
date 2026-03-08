package DesignPatterns.CreationalDesignPattern.FactoryDesignPattern;

public class Main {

    public static void main(String arge[]){

        ButtonFactory buttonFactory = new HTMLButtonFactory();
        buttonFactory.createButton().onClick();

    }
}
