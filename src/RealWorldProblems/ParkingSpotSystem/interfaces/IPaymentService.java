package RealWorldProblems.ParkingSpotSystem.interfaces;

public interface IPaymentService {

    void acceptCash(int amount);
    void acceptCreditCard(int amount, String cardNumber, int cvv);
}
