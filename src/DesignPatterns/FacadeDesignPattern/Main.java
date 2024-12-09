package DesignPatterns.FacadeDesignPattern;

public class Main {

    public static void main(String[] args) {
        
        /*
        What is happening the Client is calling OrderFacade and has made a Order for respective product.
        The client is least interested about the system logic here.
        
        But we should not bound client to use Facade. But the disadvantage that occurs due to this is if we
        change the logic or the return type of the function the client will have to change on to there system.
        
        But in this they will only call the method that they require.Rest will be handled by the system.
         */
        
        OrderFacade orderFacade = new OrderFacade();
        orderFacade.createOrder();

    }
}
