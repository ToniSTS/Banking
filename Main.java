//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        DebitAcc dpt1 = new DebitAcc();
        DebitAcc dpt2 = new DebitAcc(25);

        dpt1.deposit(100);
        dpt1.withdraw(25);
        System.out.println(dpt1.toString());

        dpt2.deposit(100);
        dpt2.withdraw(25);
        System.out.println(dpt2.toString());

        CreditAcc Crd1 = new CreditAcc();
        Crd1.Deposit(100);
        Crd1.Withdraw(50);
        System.out.println(Crd1.toString());

        loanACC ln1 = new loanACC();
        ln1.PaymentsOnLoan(50);
        System.out.println(ln1.toString());



    }
}