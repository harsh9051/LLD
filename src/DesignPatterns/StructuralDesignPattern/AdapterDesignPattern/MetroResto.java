package DesignPatterns.StructuralDesignPattern.AdapterDesignPattern;

import java.util.logging.XMLFormatter;

public class MetroResto implements IMetroResto{
    @Override
    public void displayMenus(XMLFormatter xmlFormatter) {
        System.out.println(xmlFormatter);
    }

    @Override
    public void displayUI(XMLFormatter xmlFormatter) {
        System.out.println(xmlFormatter);
    }
}
