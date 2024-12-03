package DesignPatterns.PrototypeDesignPatter;

public class Main {
    public static void main(String[] args) throws InterruptedException {


        /*
        In this by default the shallow copy feature is happening.
        Here only the reference object will change in all the other new objects than has cloned.
        Reference Object means like list, class, Hashmap etc.

        If do not want to make a change in any other object that has been cloned than we should use Deep copy to
        make that thing work we have to right a custom logic the overrride method (clone()) and after this if we make
        change in parent object than it won't affect the cloned objects.
         */
        NetworkConnection networkConnection = new NetworkConnection();
        networkConnection.setIp("198.126.4.4");
        networkConnection.loadImportantData();


        NetworkConnection networkConnection1 = null;
        try{
            networkConnection1 = (NetworkConnection) networkConnection.clone();
            networkConnection.getDomains().removeFirst();
            System.out.println(networkConnection);
            System.out.println(networkConnection1);
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

    }
}
