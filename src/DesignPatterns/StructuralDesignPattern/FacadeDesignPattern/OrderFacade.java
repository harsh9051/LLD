package DesignPatterns.StructuralDesignPattern.FacadeDesignPattern;

public class OrderFacade {

    public Product product;
    public Invoice invoice;
    public Payment payment;

    public OrderFacade() {
        this.invoice = new Invoice();
        this.payment = new Payment();
    }

    public void createOrder(){
        product = product.getProduct(121);
        invoice.getInvoice();
        payment.makePayment();
    }
}
