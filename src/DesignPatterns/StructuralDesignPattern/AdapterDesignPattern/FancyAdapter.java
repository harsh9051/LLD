package DesignPatterns.StructuralDesignPattern.AdapterDesignPattern;

import netscape.javascript.JSObject;

import java.util.logging.XMLFormatter;

public class FancyAdapter implements IMetroResto{
    public final FancyMetroResto fancyMetroResto;

    public FancyAdapter(FancyMetroResto fancyMetroResto){
        this.fancyMetroResto = fancyMetroResto;
    }
    @Override
    public void displayMenus(XMLFormatter xmlFormatter) {
        JSObject jsObject = convertXMLTOJSON(xmlFormatter);
        fancyMetroResto.displayMenus(jsObject);
    }

    @Override
    public void displayUI(XMLFormatter xmlFormatter) {
        JSObject jsObject = convertXMLTOJSON(xmlFormatter);
        fancyMetroResto.displayUI(jsObject);
    }


    public JSObject convertXMLTOJSON(XMLFormatter xmlFormatter){
        return null;
    }
}
