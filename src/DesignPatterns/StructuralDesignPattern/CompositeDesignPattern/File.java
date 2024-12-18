package DesignPatterns.StructuralDesignPattern.CompositeDesignPattern;

public class File implements FileSytem {
    public String fileName;

    public File(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void ls() {
        System.out.println("FileName : "+ fileName);
    }
}
