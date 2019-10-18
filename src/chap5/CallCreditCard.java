
package chap5;

public class CallCreditCard {
    public static void main(String[] args) {
        CreditCard card = CreditCard.creditCardInstance(23000);
        System.out.println("Card : "+card);
        CreditCard card2 = CreditCard.creditCardInstance(8000);
        System.out.println("Card2 : "+card2);
    }
}
