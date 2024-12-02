package DesignPatterns.FactoryDesignPattern;

import java.util.Scanner;

public class Main {

    public static void main(String arge[]){

        Button button = ButtonFactory.createButton("Windows");
        button.onClick();

    }
}
