
package chap5;

public class CreditCard {
    private double minimumSalary;
    
    private CreditCard(double minimumSalary){
        this.minimumSalary = minimumSalary;
    }
    
    public static CreditCard creditCardInstance(double minimumSalary){
        if (minimumSalary >= 15000) {
            return new CreditCard(minimumSalary);
        } else {
            return null;
        }
    }
}
