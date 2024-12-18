package DesignPatterns.StructuralDesignPattern.CompositeDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSytem{
    public String directoryName;
    public List<FileSytem> list = new ArrayList<>();

    public Directory(String directoryName) {
        this.directoryName = directoryName;
    }

    public void add(FileSytem fileSytem){
        this.list.add(fileSytem);
    }

    @Override
    public void ls() {
        System.out.println("Directory Name : "+ this.directoryName);
        for(FileSytem fileSytem : list)
            fileSytem.ls();
    }
}
