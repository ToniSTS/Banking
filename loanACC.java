public class loanACC {
    private double Balance;
    private double Interest;
    private double InterestPaid;
    private double PrinciaplPaid;
    private double PaymentsOnLoan;

    public loanACC(double Startingbalance, double Interest){
        if(Startingbalance <0 ){
            System.out.println("Starting balance cannot be negative");
            this.Balance = 0;
        } else {
            this.Balance = Startingbalance;
        }
        if(Interest <0 ){
            System.out.println("Interest cannot be negative");
            this.Interest = 0;
        } else {
            this.Interest = Interest;
        }
        this.InterestPaid = InterestPaid;
        this.PrinciaplPaid = PrinciaplPaid;
        this.PaymentsOnLoan = PaymentsOnLoan;
    }

    public loanACC() {

    }

    public double CalcForInterest(){
        return Balance * Interest;
    }
    public void PaymentsOnLoan(double Payments){
        if(Payments <= 0){
            System.out.println("Payments cannot be negative");
            return;
        }
        double Rate = CalcForInterest();
        double MoneyTowardsInt;
        double MoneyTowardsPrin;

        if(Payments >= Rate){
            MoneyTowardsInt = Rate;
            MoneyTowardsPrin = Payments- Rate;
        } else {
            MoneyTowardsInt = Payments;
            MoneyTowardsPrin = 0;
        }
        if(MoneyTowardsPrin >0){
            Balance -= MoneyTowardsInt;
            if(Balance < 0){
                Balance = 0;
            }
        }
        InterestPaid += MoneyTowardsInt;
        PrinciaplPaid += MoneyTowardsPrin;
        PaymentsOnLoan += Payments;
    }
    public double getPrinciaplPaid(){
        return PrinciaplPaid;
    }
    public double getPaymentsOnLoan(){
        return PaymentsOnLoan;
    }
    public double getInterest(){
        return Interest;
    }
    public double getBalance(){
        return Balance;
    }
    public double getInterestPaid(){
        return InterestPaid;
    }
    public String toString(){
        return "LoanAccount{" + "balance=" + String.format("%.2f", Balance) + ", interestRate=" + String.format("%.2f", Interest) + ", PrincipalPaid=" + String.format("%.2f", PrinciaplPaid) + ", InterestPaid=" + String.format("%.2f", InterestPaid) + ", PaymentsOnLoan=" + String.format("%.2f", PaymentsOnLoan) + '}';
    }

}
