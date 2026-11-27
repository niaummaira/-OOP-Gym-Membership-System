public abstract class Membership {

    private String memberID;
    private String memberName;
    private int months;

    public Membership(String memberID, String memberName, int months) {
        this.memberID = memberID;
        this.memberName = memberName;
        this.months = months;
    }

    public String getMemberID() {
        return memberID;
    }

    public String getMemberName() {
        return memberName;
    }

    public int getMonths() {
        return months;
    }

    public void setMonths(int months) {
        this.months = months;
    }

    public abstract double calculateFee();

    public void displayInfo() {
        System.out.println("Member ID: " + memberID);
        System.out.println("Member Name: " + memberName);
        System.out.println("Membership Duration: " + months + " months");
    }
}
