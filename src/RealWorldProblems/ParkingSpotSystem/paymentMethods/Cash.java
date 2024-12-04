package RealWorldProblems.ParkingSpotSystem.paymentMethods;

public class Cash extends PaymentMethods{
    @Override
    public boolean initiatePayment(int amount) {
        System.out.println("Making Payment by cash : "+amount);
        return true;
    }
}
