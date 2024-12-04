package RealWorldProblems.ParkingSpotSystem.services;

import RealWorldProblems.ParkingSpotSystem.interfaces.IPaymentService;
import RealWorldProblems.ParkingSpotSystem.paymentMethods.Cash;
import RealWorldProblems.ParkingSpotSystem.paymentMethods.CreditCard;
import RealWorldProblems.ParkingSpotSystem.paymentMethods.PaymentMethods;

public class PaymentServiceImpl implements IPaymentService {
    @Override
    public void acceptCash(int amount) {
        PaymentMethods paymentMethods = new Cash();
        paymentMethods.initiatePayment(amount);
    }

    @Override
    public void acceptCreditCard(int amount, String cardNumber, int cvv) {
        PaymentMethods paymentMethods = new CreditCard(cardNumber, cvv);
        paymentMethods.initiatePayment(amount);
    }
}
