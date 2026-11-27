
package gymmembershipsystem;

/**
 *
 * PROJECT OOP
 */
public class PremiumMembership extends Membership{
    private double monthlyRate;
    private double trainerFee;
    
    public PremiumMembership(String memberID, String memberName, int months, 
            double monthlyRate, double trainerFee){
        super(memberID, memberName, months);
        this.monthlyRate= monthlyRate;
        this.trainerFee = trainerFee;
    }
    
    @Override 
    public double calculateFee(){
        return (getMonths() * monthlyRate) + trainerFee;
    }
    
    @Override 
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Membership Type: Premium");
        System.out.println("Monthly Rate: RM" + monthlyRate);
        System.out.println("Trainer Fee: RM" + trainerFee);
        System.out.println("Total Fee: RM" + calculateFee());
    }
    
}
