public class CreditAcc {
    private double CreditLim;
    private double AmountOfCreditUsed;
    private double Balance;



    public CreditAcc(double StartingBalance, double CreditLim) {
        this.Balance =StartingBalance;
        this.CreditLim = CreditLim;
        this.AmountOfCreditUsed = 0;
    }

    public CreditAcc() {

    }

    public double getCreditLim(){
        return CreditLim;
    }
    public double getAmountOfCreditUsed(){
        return AmountOfCreditUsed;
    }
    public void Deposit(double Money){
        if(Money > 0){
            Balance+= Money;
            if(AmountOfCreditUsed >0){
                double CreditPaidBack = Money;
                if(CreditPaidBack > CreditLim){
                    CreditPaidBack= AmountOfCreditUsed;
                }
                AmountOfCreditUsed -= CreditPaidBack;
                if(AmountOfCreditUsed < 0){
                    AmountOfCreditUsed = 0;
                }
            }
        } else {
            System.out.println("Cant Deposit Negative money!");
        }
    }
    public void Withdraw(double Money){
        if(Money > 0){
            double RemainBalacne = Balance + CreditLim- AmountOfCreditUsed;
            if(Money <= RemainBalacne){
                if(Money <= Balance){
                    Balance -= Money;
                }else {
                    System.out.println("Credit limit reached!");
                }
            }else{
                System.out.println("Can withdraw negative money!");
            }
        }
    }
}
