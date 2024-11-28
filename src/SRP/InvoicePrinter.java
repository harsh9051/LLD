package SRP;

public class InvoicePrinter {
    private double totalSum;

    public void printInvoice(Invoice invoice){
        double price = invoice.calculatorTotal();
        totalSum += price;
        System.out.println("Book Name:- "+ invoice.getBook().getName());
        System.out.println("Book Author:- "+ invoice.getBook().getAuthor());
        System.out.println("Price of the Book:- "+ price);
    }

    public void printTotalSum(){
        System.out.println("Total Price:- "+ totalSum);
    }
}
