package gymmembershipsystem;

/**
 *
 * PROJECT OOP
 */

public class BasicMembership extends Membership {
    
    private double monthlyRate;
    
    public BasicMembership(String memberID, String memberName, int months, double monthlyRate){
        super(memberID, memberName, months);
        this.monthlyRate = monthlyRate;
    }
    
    @Override 
    public double calculateFee(){
        return getMonths() * monthlyRate;
    }
    
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Membership Type: Basic");
        System.out.println("Monthly Rate: RM" + monthlyRate);
        System.out.println("Total Fee: RM" + calculateFee());      
    }
}
