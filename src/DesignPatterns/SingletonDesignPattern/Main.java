package DesignPatterns.SingletonDesignPattern;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {

    public static void main(String[] args) throws Exception {
        /*
            This is the covert way in which the Singleton Design Pattern will be implemented.
         */
        Example example1 = Example.getExample();
//        Example example2 = Example.getExample();
//
//        System.out.println(example1.hashCode());
//        System.out.println(example2.hashCode());


        /*
            But there are ways to break this Pattern.
            1. Reflection Api.
            Solution -> If there is an object ->> throw Runtime Exception.
         */
//        System.out.println(example1.hashCode());
//        Constructor<Example> cont = Example.class.getDeclaredConstructor();
//        cont.setAccessible(true);
//        Example example2 = cont.newInstance();
//        System.out.println(example2.hashCode());


        /*
         2. Deserialization Method. (Make Sure the class is Imlementing Serializable method.)
         Solution -> implement readsolve method and return the same class object.
         */


//        Example example = Example.getExample();
//        System.out.println(example.hashCode());
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("abc.ob"));
//        oos.writeObject(example);
//
//        System.out.println("Serialization Done");
//
//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("abc.ob"));
//        Example e2 = (Example) ois.readObject();
//        System.out.println(e2.hashCode());

    }
}
