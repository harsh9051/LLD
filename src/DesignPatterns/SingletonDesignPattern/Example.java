package DesignPatterns.SingletonDesignPattern;

import java.io.Serializable;

public class Example implements Serializable {
    private static Example example;
    private Example(){
    }
    /*
        This is to protect from Reflection Api.
     */
//    private Example(){
//        if(example != null)
//            throw new RuntimeException("You are trying to break the Singleton Design Pattern");
//    }

    public static Example getExample(){
        if(example == null){
            synchronized (Example.class){
                if(example == null){
                    example = new Example();
                    return example;
                }
            }
        }
        return example;
    }

    public Object readResolve(){
        return example;
    }
}
