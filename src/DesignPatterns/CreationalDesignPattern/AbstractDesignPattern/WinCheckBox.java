package DesignPatterns.CreationalDesignPattern.AbstractDesignPattern;

public class WinCheckBox implements CheckBox{
    @Override
    public void onBox() {
        System.out.println("Window Checkbox is checked.");
    }
}
