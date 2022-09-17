public class Main
{
    public static void main(String[] args)
    {
        double cardBalance = 5000.00;
        double firstMonthInterest;
        double secondMonthInterest;
        double total;

        System.out.println("Your starting card balance comes to $" + cardBalance);
        firstMonthInterest = cardBalance * 0.17;
        total = firstMonthInterest + cardBalance;
        System.out.println("Your interest rate is 17%. This brings your first month balance to: $" + total);
        secondMonthInterest = total * 0.17;
        total = secondMonthInterest + total;
        System.out.println("Your interest rate is 17%. This brings your second month balance to $" + total);
    }
}