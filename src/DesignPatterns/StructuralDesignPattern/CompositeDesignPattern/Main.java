package DesignPatterns.StructuralDesignPattern.CompositeDesignPattern;

public class Main {
    public static void main(String[] args) {

        /*
        This is generally used when we see a Tree Design problem like Calculator, File System.
         */

        Directory directory = new Directory("Movies");
        File file = new File("Border");
        directory.add(file);
        Directory directory1 = new Directory("Comedy");
        directory.add(directory1);

        File file1 = new File("Phir Hera Pheri");
        directory1.add(file1);

        directory.ls();

    }
}
